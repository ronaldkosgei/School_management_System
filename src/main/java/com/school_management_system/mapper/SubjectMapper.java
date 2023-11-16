package com.school_management_system.mapper;

import com.school_management_system.dto.SubjectDto;
import com.school_management_system.entity.Subject;

public class SubjectMapper {

    public static Subject mapToSubject(SubjectDto subjectDto){
        Subject subject = new Subject();
        subject.setSubjectId(subjectDto.getSubjectId());
        subject.setSubName(subjectDto.getSubName());
        subject.setChapters(subjectDto.getChapters());

        return subject;
    }

    public static SubjectDto mapToSubjectDto(Subject subject){
        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setSubjectId(subject.getSubjectId());
        subjectDto.setSubName(subject.getSubName());
        subjectDto.setChapters(subject.getChapters());

        return subjectDto;
    }
}
