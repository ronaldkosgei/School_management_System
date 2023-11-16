package com.school_management_system.service;

import com.school_management_system.dto.ParentDto;
import com.school_management_system.entity.Parent;
import com.school_management_system.mapper.ParentMapper;
import com.school_management_system.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentServiceImpl implements ParentService{

    @Autowired
    private final ParentRepository parentRepository;

    public ParentServiceImpl(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @Override
    public Parent addParent(ParentDto parentDto) {
        Parent parent = new ParentMapper().mapToParent(parentDto);
        return parentRepository.save(parent);
    }

    @Override
    public Optional<ParentDto> getParentById(Long parentId) {
        Optional<Parent> parent = parentRepository.findById(parentId);
        return parent.map(parent1 -> new ParentMapper().mapToParentDto(parent1));
    }

    @Override
    public List<Parent> getParents() {
        return parentRepository.findAll();
    }

    @Override
    public ParentDto updateParent(Long parentId, ParentDto parentDto) {
        Optional<Parent> parent = parentRepository.findById(parentId);

        if (parent.isPresent()){
            Parent existingParent = parent.get();

            existingParent.setMotherName(parentDto.getMotherName());
            existingParent.setFatherName(parentDto.getFatherName());
            existingParent.setAddress(parentDto.getAddress());
            existingParent.setTP(parentDto.getTP());

            Parent updatedParent = parentRepository.save(existingParent);
            return new ParentMapper().mapToParentDto(updatedParent);
        } else {
            return null;
        }
    }

    @Override
    public Optional<Object> deleteParent(Long parentId) {
        Optional<Parent> parent = parentRepository.findById(parentId);

        if (parent.isPresent()) {
            parentRepository.deleteById(parentId);
            return Optional.of("Parent Removed!!");
        } else {
            return Optional.empty();
        }

    }
}
