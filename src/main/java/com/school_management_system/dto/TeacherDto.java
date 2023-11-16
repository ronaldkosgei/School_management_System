package com.school_management_system.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {

    @Id
    private Long teacherId;

    private String name;

    private int age;

    private String address;

    private String TP;

    private String email;
}
