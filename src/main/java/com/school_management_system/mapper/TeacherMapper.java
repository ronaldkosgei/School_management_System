package com.school_management_system.mapper;

import com.school_management_system.dto.TeacherDto;
import com.school_management_system.entity.Teacher;

public class TeacherMapper {

    public static Teacher mapToTeacher(TeacherDto teacherDto){
        Teacher teacher = new Teacher();
        teacher.setTeacherId(teacherDto.getTeacherId());
        teacher.setName(teacherDto.getName());
        teacher.setAge(teacherDto.getAge());
        teacher.setAddress(teacherDto.getAddress());
        teacher.setTP(teacherDto.getTP());
        teacher.setEmail(teacherDto.getEmail());

        return teacher;
    }

    public static TeacherDto mapToTeacherDto(Teacher teacher){
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setTeacherId(teacher.getTeacherId());
        teacherDto.setName(teacher.getName());
        teacherDto.setAge(teacher.getAge());
        teacherDto.setAddress(teacher.getAddress());
        teacherDto.setAddress(teacher.getAddress());
        teacherDto.setTP(teacher.getTP());
        teacherDto.setEmail(teacher.getEmail());

        return teacherDto;
    }
}
