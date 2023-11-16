package com.school_management_system.service;

import com.school_management_system.dto.StudentDto;
import com.school_management_system.entity.Student;
import com.school_management_system.mapper.StudentMapper;
import com.school_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student addStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        return studentRepository.save(student);
    }

    @Override
    public Optional<StudentDto> getStudentById(Long studentId) {
        Optional<Student> student = studentRepository.findById(studentId);
        return student.map(student1 -> StudentMapper.mapToStudentDto(student1));
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto studentDto) {
        Optional<Student> student = studentRepository.findById(studentId);

        if (student.isPresent()){
            Student existingStudent = student.get();

            existingStudent.setName(studentDto.getName());
            existingStudent.setAge(studentDto.getAge());
            existingStudent.setGrade(studentDto.getGrade());
            existingStudent.setAddress(studentDto.getAddress());
            existingStudent.setTP(studentDto.getTP());
            existingStudent.setClz(studentDto.getClz());
            existingStudent.setEmail(studentDto.getEmail());

            Student updatedStudent = studentRepository.save(existingStudent);
            return StudentMapper.mapToStudentDto(updatedStudent);
        } else {
            return null;
        }
    }

    @Override
    public Optional<Object> deleteStudent(Long studentId) {
        Optional<Student> student = studentRepository.findById(studentId);

        if (student.isPresent()) {
            studentRepository.deleteById(studentId);
            return Optional.of("Student Removed!!");
        } else {
            return Optional.empty();
        }
    }
}
