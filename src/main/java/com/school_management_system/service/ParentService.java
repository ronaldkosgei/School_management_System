package com.school_management_system.service;

import com.school_management_system.dto.ParentDto;
import com.school_management_system.entity.Parent;

import java.util.List;
import java.util.Optional;

public interface ParentService {

    public Parent addParent(ParentDto parentDto);

    public Optional<ParentDto> getParentById(Long parentId);

    public List<Parent> getParents();

    public ParentDto updateParent(Long parentId, ParentDto parentDto);


    public Optional<Object> deleteParent(Long parentId);
}
