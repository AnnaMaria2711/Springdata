package com.example.springdata;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date registrationDate;

    @Column
    private String userName;
}
