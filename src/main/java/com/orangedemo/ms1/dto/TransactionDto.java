package com.orangedemo.ms1.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransactionDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal id;
    private TransactionType type;
    private String iban;
    private String cnp;
    private String name;
    private String desc;
    private BigDecimal sum;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id=" + id +
                ", type=" + type +
                ", iban='" + iban + '\'' +
                ", cnp='" + cnp + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", sum=" + sum +
                '}';
    }
}

