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
		return ResponseEntity.ok(studentService.saveStudent(stdObj));
	}

	@GetMapping(value = { "/getStudents", "/{studentId}" })
	public List<Student> getStudent(@PathVariable(required = false) Long studentId) {

		return studentService.getStudentDetails(studentId);
	}

	@DeleteMapping("delete/{studentId}")
	public ResponseEntity<Student> removeStudent(@PathVariable Long studentId) {
		studentService.deleteStudent(studentId);
		return new ResponseEntity(HttpStatus.OK);
	}

	  @PutMapping("/{studentId}/subject/{subjectId}")
          public Student assignSubjectToStudent(
	            @PathVariable Long studentId,
	            @PathVariable Long subjectId
    ){
	        return studentService.assignSubjectToStudent(studentId, subjectId);
	    }
}
