package com.habialtx3.springboot_security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "users")
public class User {

    @Id
    private int id;
    private String username;
    private String password;

}
