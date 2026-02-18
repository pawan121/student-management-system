package com.app.student.management.controller;
import com.app.student.management.dto.StudentDTO;
import com.app.student.management.entity.Student;
import com.app.student.management.repository.StudentRepository;
import com.app.student.management.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@GetMapping("/{sId}")
	public StudentDTO getStudentById(@PathVariable("sId") String sId) {
		return studentService.getStudentDetails(sId);
	}

	@GetMapping("/student/count")
	public Long getNoOfStudentRecords(){
        return studentService.getStudentCount();
	}
	
	@DeleteMapping("/student/{sId}")
	public void deleteStudent(@PathVariable("sId") int sId) {
	    studentRepo.deleteById(sId);
	}
}
