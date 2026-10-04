package com.sanjeev.security.spring_security_v4.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "users")
@Data
public class UserBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;
}
