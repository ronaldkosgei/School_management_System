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
public class ParentDto {

    @Id
    private Long parentId;

    private String motherName;

    private String fatherName;

    private String Address;

    private String TP;
}
