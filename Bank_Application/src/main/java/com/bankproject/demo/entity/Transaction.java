package com.bankproject.demo.entity;

import java.math.BigDecimal;
import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue
    private Long transactionId;

    private String accountNumber;

    private BigDecimal transactionAmount;

    private Timestamp transactionDateTime;

}
