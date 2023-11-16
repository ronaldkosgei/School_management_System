package com.school_management_system.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    @Id
    private Long StudentId;

    private String Name;

    private int Age;

    private String Grade;

    private String Clz;

    private String Address;

    private String TP;

    private String email;

    private String parent;
}
