package com.school_management_system.controller;

import com.school_management_system.dto.ParentDto;
import com.school_management_system.entity.Parent;
import com.school_management_system.service.ParentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ParentController {

    @Autowired
    private final ParentService parentService;

    public ParentController(ParentService parentService){
        this.parentService = parentService;
    }

    @PostMapping("addParent")
    public String addStudent(@RequestBody ParentDto parentDto,
                             Model model,
                             HttpSession session){
        Parent parent = parentService.addParent(parentDto);
        model.addAttribute("newParent", new ParentDto());
        session.setAttribute("msg","Parent Added Sucessfully...");
        return "ParentAdd";
    }
    
    @PutMapping("updateParent/{parentId}")
    public String updateParent(@RequestBody ParentDto parentDto,
                               Model model,
                               HttpSession session){
        Parent parent = parentService.addParent(parentDto);
        model.addAttribute("newParent", new ParentDto());
        session.setAttribute("msg","Parent Updated Sucessfully...");
        return "ParentAdd";
    }

    @GetMapping("getParent/{parentId}")
    public Optional<ParentDto> getParentById(@PathVariable Long parentId){
        return parentService.getParentById(parentId);
    }

    @GetMapping("getParents")
    public List<Parent> getParents(){
        return parentService.getParents();
    }

    @DeleteMapping("deleteParent/{parentId}")
    public Optional<Object> deleteParent(@PathVariable Long parentId){
        return parentService.deleteParent(parentId);
    }
}
