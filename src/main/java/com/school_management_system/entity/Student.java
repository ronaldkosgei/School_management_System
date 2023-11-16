package com.school_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long StudentId;

    @Column(name = "name")
    private String Name;

    @Column(name = "age")
    private int Age;

    @Column(name = "grade")
    private String Grade;

    @Column(name = "clz")
    private String Clz;

    @Column(name = "address")
    private String Address;

    @Column(name = "tp")
    private String TP;

    @Column(name = "email")
    private String email;

    @Column(name = "parent")
    private String parent;
}
