package com.sanjeev.security.spring_security_v4.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "student")
@Data
public class StudentBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name ="name" )
    private String studentName;

    @Column(name = "age")
    private String age;
}
