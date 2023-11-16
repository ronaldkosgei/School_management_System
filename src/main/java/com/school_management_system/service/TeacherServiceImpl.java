package com.school_management_system.service;

import com.school_management_system.dto.TeacherDto;
import com.school_management_system.entity.Teacher;
import com.school_management_system.mapper.TeacherMapper;
import com.school_management_system.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher addTeacher(TeacherDto teacherDto) {
        Teacher teacher = new TeacherMapper().mapToTeacher(teacherDto);
        return teacherRepository.save(teacher);
    }

    @Override
    public Optional<TeacherDto> getTeacherById(Long teacherId) {
        Optional<Teacher> teacher = teacherRepository.findById(teacherId);
        return teacher.map(teacher1 -> new TeacherMapper().mapToTeacherDto(teacher1));
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public TeacherDto updateTeacher(Long teacherId, TeacherDto teacherDto) {
        Optional<Teacher> teacher = teacherRepository.findById(teacherId);

        if (teacher.isPresent()) {
            Teacher existingTeacher = teacher.get();

            existingTeacher.setName(teacherDto.getName());
            existingTeacher.setAge(teacherDto.getAge());
            existingTeacher.setAddress(teacherDto.getAddress());
            existingTeacher.setTP(teacherDto.getTP());
            existingTeacher.setEmail(teacherDto.getEmail());

            Teacher updatedTeacher = teacherRepository.save(existingTeacher);
            return new TeacherMapper().mapToTeacherDto(updatedTeacher);
        } else {
            return null;
        }

    }

    @Override
    public Optional<Object> deleteTeacher(Long teacherId) {
        Optional<Teacher> teacher = teacherRepository.findById(teacherId);

        if (teacher.isPresent()) {
            teacherRepository.deleteById(teacherId);
            return Optional.of("Teacher deleted!!");
        } else {
            return Optional.of("Teacher not found!!");
        }
    }
}
