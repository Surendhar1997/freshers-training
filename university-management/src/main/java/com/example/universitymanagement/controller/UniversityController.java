package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.University;
import com.example.universitymanagement.service.UniversityService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//@RequestMapping("/api/universities")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {

        this.universityService = universityService;
    }
    @GetMapping("/api/universities")
    public List<University> getAllUniversities() {

        return universityService.getAllUniversities();
    }

    @GetMapping("/api/universities/{universityid}")
    public University getUniversityById(@PathVariable Long universityid) {
        return universityService.getUniversityById(universityid);
    }

    @PostMapping("/api/university")
    public University createUniversity(@RequestBody University university) {
        return universityService.createUniversity(university);
    }

    @PutMapping("/api/universities/{universityid}")
    public University updateUniversity(@PathVariable Long universityid, @RequestBody University updatedUniversity) {
        return universityService.updateUniversity(universityid, updatedUniversity);
    }

    @DeleteMapping("/api/universities/{universityid}")
    public void deleteUniversity(@PathVariable Long universityid) {
        universityService.deleteUniversity(universityid);
    }
}
