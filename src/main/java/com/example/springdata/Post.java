package com.example.springdata;


import jakarta.persistence.*;


@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;

    @Column
    private String text;

    @Column
    private
}
