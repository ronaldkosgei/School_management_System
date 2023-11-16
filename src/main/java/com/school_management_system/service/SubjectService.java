package com.school_management_system.service;

import com.school_management_system.dto.SubjectDto;
import com.school_management_system.entity.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    public Subject addSubject(SubjectDto subjectDto);

    public Optional<SubjectDto> getSubjectById(Long subjectId);

    public List<Subject> getSubjects();

    public SubjectDto updateSubject(Long subjectId, SubjectDto subjectDto);

    public Optional<Object> deleteSubject(Long subjectId);


}
