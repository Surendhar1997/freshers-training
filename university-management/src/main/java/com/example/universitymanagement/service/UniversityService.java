package com.example.universitymanagement.service;


import com.example.universitymanagement.model.University;
import com.example.universitymanagement.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UniversityService {
    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public List<University> getAllUniversities() {

        return universityRepository.findAll();
    }

    public University getUniversityById(Long universityId) {
        return universityRepository.findById(universityId)
                .orElseThrow(() -> new EntityNotFoundException("University not found with ID: " + universityId));
    }

    public University createUniversity(University university) {

        return universityRepository.save(university);
    }

    public University updateUniversity(Long universityId, University updatedUniversity) {
        University university = getUniversityById(universityId);
        university.setName(updatedUniversity.getName());
        university.setLocation(updatedUniversity.getLocation());
        return universityRepository.save(university);
    }

    public void deleteUniversity(Long universityId) {

        universityRepository.deleteById(universityId);
    }
}
