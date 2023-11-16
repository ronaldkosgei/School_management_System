package com.school_management_system.service;

import com.school_management_system.dto.SubjectDto;
import com.school_management_system.entity.Subject;
import com.school_management_system.mapper.SubjectMapper;
import com.school_management_system.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject addSubject(SubjectDto subjectDto) {
        Subject subject = SubjectMapper.mapToSubject(subjectDto);
        return subjectRepository.save(subject);
    }

    @Override
    public Optional<SubjectDto> getSubjectById(Long subjectId) {
        Optional<Subject> subject = subjectRepository.findById(subjectId);
        return subject.map(subject1 -> SubjectMapper.mapToSubjectDto(subject1));
    }

    @Override
    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public SubjectDto updateSubject(Long subjectId, SubjectDto subjectDto) {
        Optional<Subject> subject = subjectRepository.findById(subjectId);

        if (subject.isPresent()){
            Subject existingSubject = subject.get();

            existingSubject.setSubName(subjectDto.getSubName());
            existingSubject.setChapters(subjectDto.getChapters());

            Subject updatedSubject = subjectRepository.save(existingSubject);
            return SubjectMapper.mapToSubjectDto(updatedSubject);
        } else {
            return null;
        }
    }

    @Override
    public Optional<Object> deleteSubject(Long subjectId) {
            Optional<Subject> subject = subjectRepository.findById(subjectId);

            if (subject.isPresent()) {
                subjectRepository.deleteById(subjectId);
                return Optional.of("Subject Removed!!");
            } else {
                return Optional.empty();
            }
        }

}
