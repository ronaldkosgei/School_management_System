package com.school_management_system.controller;

import com.school_management_system.dto.TeacherDto;
import com.school_management_system.entity.Teacher;
import com.school_management_system.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TeacherController {

    @Autowired
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody TeacherDto teacherDto) {
        return teacherService.addTeacher(teacherDto);
    }

    @GetMapping("/getTeacher/{teacherId}")
    public Optional<TeacherDto> getTeacherById(@PathVariable Long teacherId) {
        return teacherService.getTeacherById(teacherId);
    }

    @PutMapping("/updateTeacher/{teacherId}")
    public TeacherDto updateTeacher(@PathVariable Long teacherId, @RequestBody TeacherDto teacherDto) {
        return teacherService.updateTeacher(teacherId, teacherDto);
    }

    @DeleteMapping("/deleteTeacher/{teacherId}")
    public Optional<Object> deleteTeacher(@PathVariable Long teacherId) {
        return teacherService.deleteTeacher(teacherId);
    }

}
