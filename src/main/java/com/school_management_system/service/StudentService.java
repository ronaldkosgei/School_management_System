package com.school_management_system.service;

import com.school_management_system.dto.StudentDto;
import com.school_management_system.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student addStudent(StudentDto studentDto);

    public Optional<StudentDto> getStudentById(Long studentId);

    public List<Student> getStudents();

    public StudentDto updateStudent(Long studentId, StudentDto studentDto);

    public Optional<Object> deleteStudent(Long studentId);
}
