package com.orangedemo.ms1.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orangedemo.ms1.dto.TransactionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private TransactionValidatorService transactionValidatorService;

    @Override
    public void handleTransaction(TransactionDto transactionDto) throws JsonProcessingException {
        transactionValidatorService.validateTransaction(transactionDto);
        sendTransactionToQueue(transactionDto);
    }

    private void sendTransactionToQueue(TransactionDto transactionDto) throws JsonProcessingException {
        String transactionJson = new ObjectMapper().writeValueAsString(transactionDto);
        jmsTemplate.convertAndSend(queue, transactionJson);
    }
}
