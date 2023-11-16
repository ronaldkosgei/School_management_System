package com.school_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_parents")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent's_id")
    private Long parentId;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father's_name")
    private String fatherName;

    @Column(name = "address")
    private String Address;

    @Column(name = "tp")
    private String TP;
}
