package com.school_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "sub_name")
    private String subName;

    @Column(name = "chapters")
    private String chapters;

//    @OneToMany(mappedBy = "subject")
//    private Set<Teacher> teacher = new HashSet<>();

//    @OneToMany(mappedBy = "subject")
//    private Set<Teacher> teachers = new HashSet<>();
}

