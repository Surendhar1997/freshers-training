package com.university.Student.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.Student.Entity.Student;
import com.university.Student.Service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {
	 @Autowired
	    private StudentService studentService;
                
	    @PostMapping("/save")
	    public ResponseEntity<Student> saveStudent(@RequestBody Student stdObj) {
	        studentService.saveStudent(stdObj);
	        return new ResponseEntity<>(HttpStatus.CREATED);
	    }

	    @GetMapping(value = {"/getStudents", "/{studentId}"})
	    public List<Student> getStudent(@PathVariable(required = false) Long student_id) {
	       
			return studentService.getStudentDetails(student_id);
	    }

	    @DeleteMapping("delete/{studentid}")
	    public ResponseEntity<Student> removeStudent(@PathVariable Long student_id){
	    	studentService.deleteStudent(student_id);
	        return new ResponseEntity(HttpStatus.OK);
	    }

	    @PutMapping("/{studentid}/subject/{subjectId}")
	    public Student assignSubjectToStudent(
	            @PathVariable Long student_id,
	            @PathVariable Long subject_id
	    ){
	        return studentService.assignSubjectToStudent(student_id, subject_id);
	    }
	}

