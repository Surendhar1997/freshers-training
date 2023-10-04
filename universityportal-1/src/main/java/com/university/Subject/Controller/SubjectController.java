package com.university.Subject.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.Subject.Entity.Subject;
import com.university.Subject.Repository.SubjectRepository;
import com.university.Subject.Service.SubjectService;

	@RestController
	@RequestMapping("/subject")
	public class SubjectController {
        
		@Autowired
	    private  SubjectService subjectService;

	    
	    @PostMapping("/save")
	    public ResponseEntity createSubject(@RequestBody Subject subjectObj) {
	        subjectService.saveSubject(subjectObj);
	        return new ResponseEntity(HttpStatus.CREATED);
	    }

	    @GetMapping(value = {"/getsubjects", "/{subjectId}"})
	    public List<Subject> getSubjects(@PathVariable(required = false) Long subject_id) {
	        return subjectService.getSubjectDetails(subject_id);
	    }

	    @DeleteMapping("/delete/{subjectId}")
	    public ResponseEntity removeSubject(@PathVariable Long subject_id) {
	    	subjectService.deleteSubject(subject_id);
	        return new ResponseEntity(HttpStatus.OK);
	    }
	}


