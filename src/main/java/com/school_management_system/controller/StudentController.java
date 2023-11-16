package com.school_management_system.controller;

import com.school_management_system.dto.StudentDto;
import com.school_management_system.entity.Student;
import com.school_management_system.service.StudentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class StudentController {



    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @PostMapping("addStudent")
    public String addStudent(@RequestBody StudentDto studentDto,
                             Model model,
                             HttpSession session){
        Student student = studentService.addStudent(studentDto);
        model.addAttribute("newStudent", new StudentDto());
        session.setAttribute("msg","Student Added Sucessfully...");
        return "StudentAdd";
    }

    @GetMapping("getStudent/{studentId}")
    public Optional<StudentDto> getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    @GetMapping("getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PutMapping("updateStudent/{studentId}")
    public StudentDto updateStudent(@PathVariable Long studentId,
                                    @RequestBody StudentDto studentDto){
        return studentService.updateStudent(studentId, studentDto);
    }
    @DeleteMapping("deleteStudent/{studentId}")
    public Optional<Object> deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }

}