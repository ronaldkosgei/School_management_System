package com.school_management_system.controller;

import com.school_management_system.dto.SubjectDto;
import com.school_management_system.entity.Subject;
import com.school_management_system.service.SubjectService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SubjectController {

    @Autowired
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("addSubject")
    public Subject addSubject(@RequestBody SubjectDto subjectDto){
        return subjectService.addSubject(subjectDto);
    }

    @GetMapping("getSubject/{subjectId}")
    public Optional<SubjectDto> getSubjectById(@PathVariable Long subjectId){
        return subjectService.getSubjectById(subjectId);
    }

    @GetMapping("getSubjects")
    public Iterable<Subject> getSubjects(){
        return subjectService.getSubjects();
    }

    @PutMapping("updateSubject/{subjectId}")
    public SubjectDto updateSubject(@RequestBody SubjectDto subjectDto,
                                    @PathVariable Long subjectId){
        return subjectService.updateSubject(subjectId, subjectDto);
    }

    @DeleteMapping("deleteSubject/{subjectId}")
    public Optional<Object> deleteSubject(@PathVariable Long subjectId,
                                          HttpSession session){
        session.setAttribute("msg","Subject Deleted Sucessfully...");
        return subjectService.deleteSubject(subjectId);
    }
}
