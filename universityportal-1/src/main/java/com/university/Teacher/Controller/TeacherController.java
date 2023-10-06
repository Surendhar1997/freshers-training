package com.university.Teacher.Controller;

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

import com.university.Teacher.Entity.Teacher;
import com.university.Teacher.Service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

		@Autowired
		private TeacherService teacherService;

		@PostMapping("/save")
		public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher stdObj) {
			return ResponseEntity.ok(teacherService.saveTeacher(stdObj));
		}

		@GetMapping(value = { "/getTeachers", "/{teacherId}" })
		public List<Teacher> getTeacher(@PathVariable(required = false) Long teacherId) {

			return teacherService.getTeacherDetails(teacherId);
		}


		  @GetMapping("/{teacherId}/subject/{subjectId}")
	          public Teacher assignSubjectToTeacher(
		            @PathVariable Long teacherId,
		            @PathVariable Long subjectId)
	          
	    {
		        return teacherService.assignSubjectToTeacher(teacherId, subjectId);
		    }
	

        @DeleteMapping("/{teacherId}/subjects/{subjectId}")
              public Teacher removeSubjectFromTeacher(
                      @PathVariable Long teacherId,
                      @PathVariable Long subjectId) 
        {
                     return teacherService.removeSubjectFromTeacher(teacherId, subjectId);
}

}
