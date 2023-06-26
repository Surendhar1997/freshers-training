package com.example.universitymanagement.controller;



import com.example.universitymanagement.model.University;
import com.example.universitymanagement.service.UniversityService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {

        this.universityService = universityService;
    }

    @GetMapping
    public List<University> getAllUniversities() {

        return universityService.getAllUniversities();
    }

    @GetMapping("/{universityId}")
    public University getUniversityById(@PathVariable Long universityId) {
        return universityService.getUniversityById(universityId);
    }

    @PostMapping
    public University createUniversity(@RequestBody University university) {
        return universityService.createUniversity(university);
    }

    @PutMapping("/{universityId}")
    public University updateUniversity(@PathVariable Long universityId, @RequestBody University updatedUniversity) {
        return universityService.updateUniversity(universityId, updatedUniversity);
    }

    @DeleteMapping("/{universityId}")
    public void deleteUniversity(@PathVariable Long universityId) {

        universityService.deleteUniversity(universityId);
    }
}
