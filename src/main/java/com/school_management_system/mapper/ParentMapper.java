package com.school_management_system.mapper;

import com.school_management_system.dto.ParentDto;
import com.school_management_system.entity.Parent;

public class ParentMapper {

    public static Parent mapToParent(ParentDto parentDto){
       Parent parent = new Parent();
       parent.setParentId(parentDto.getParentId());
       parent.setMotherName(parentDto.getMotherName());
       parent.setFatherName(parentDto.getFatherName());
       parent.setAddress(parentDto.getAddress());
       parent.setTP(parentDto.getTP());

       return parent;
    }

    public static ParentDto mapToParentDto(Parent parent){
        ParentDto parentDto = new ParentDto();
        parentDto.setParentId(parent.getParentId());
        parentDto.setMotherName(parent.getMotherName());
        parentDto.setFatherName(parent.getFatherName());
        parentDto.setAddress(parent.getAddress());
        parentDto.setTP(parent.getTP());

        return parentDto;
    }
}
