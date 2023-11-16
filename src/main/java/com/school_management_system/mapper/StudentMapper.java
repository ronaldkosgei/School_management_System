package com.school_management_system.mapper;

import com.school_management_system.dto.StudentDto;
import com.school_management_system.entity.Student;

public class StudentMapper {

    public static Student mapToStudent(StudentDto studentDto){
        Student student = new Student();
        student.setStudentId(studentDto.getStudentId());
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setGrade(studentDto.getGrade());
        student.setClz(studentDto.getClz());
        student.setAddress(studentDto.getAddress());
        student.setTP(studentDto.getTP());
        student.setEmail(studentDto.getEmail());

        return student;
    }

    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentId(student.getStudentId());
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge());
        studentDto.setGrade(student.getGrade());
        studentDto.setClz(student.getClz());
        studentDto.setAddress(student.getAddress());
        studentDto.setTP(student.getTP());
        studentDto.setEmail(student.getEmail());

        return studentDto;
    }
}
