package com.university.Subject.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.Student.Entity.Student;
import com.university.Subject.Entity.Subject;
import com.university.Subject.Repository.SubjectRepository;
import com.university.Subject.Service.SubjectService;
import com.university.Subject.SubjectDetails.SubjectDetails
;

	@RestController
	@RequestMapping("/subject")
	public class SubjectController {
        
		@Autowired
	    private  SubjectService subjectService;

	    
	    @PostMapping("/save")
	    public ResponseEntity<Subject> saveSubject(@RequestBody Subject subObj) {
			return ResponseEntity.ok(subjectService.saveSubject(subObj));
	    }

	    @GetMapping(value = {"/getsubjects/{subjectId}"})
	    public List<Subject> getSubjects(@PathVariable(required = false) Long subjectId) {
	        return subjectService.getSubjectDetails(subjectId);
	    }
	    
	    
	    @DeleteMapping("/delete/{subjectId}")
	    public ResponseEntity<Void> removeSubject(@PathVariable Long subjectId) {
	        subjectService.deleteSubject(subjectId);
	        return ResponseEntity.ok().build();
	    }

	    @GetMapping("/{subjectId}/details")
	    public ResponseEntity<SubjectDetails> getSubjectfullDetails(@PathVariable Long subjectId) {
	        SubjectDetails subjectDetails = subjectService.getSubjectfullDetails(subjectId);
	            return ResponseEntity.ok(subjectDetails); 
	        
	    }
	}
	
