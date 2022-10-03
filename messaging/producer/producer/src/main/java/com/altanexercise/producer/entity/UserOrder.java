package com.altanexercise.producer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_order_table")
@AllArgsConstructor
@NoArgsConstructor
public class UserOrder {
    @Id
    @GeneratedValue
    private int id;

    private String userName;

    private String status;

    private String failureReason;
}
