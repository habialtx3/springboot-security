package com.habialtx3.springboot_security.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Student {
    private int id;
    private String name;
    private int marks;
}
