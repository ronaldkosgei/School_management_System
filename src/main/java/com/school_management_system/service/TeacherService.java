package com.school_management_system.service;

import com.school_management_system.dto.TeacherDto;
import com.school_management_system.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    public Teacher addTeacher(TeacherDto teacherDto);

    public Optional<TeacherDto> getTeacherById(Long teacherId);

    public List<Teacher> getTeachers();

    public TeacherDto updateTeacher(Long teacherId, TeacherDto teacherDto);

    public Optional<Object> deleteTeacher(Long teacherId);
}
