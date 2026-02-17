package com.app.student.management.controller;

import java.util.List;

import com.app.student.management.dto.StudentDetailsResponseDTO;
import com.app.student.management.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.student.management.entity.Student;
import com.app.student.management.repository.IStudentRepository;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private IStudentRepository studentRepo;

    @Autowired
    private StudentServiceImpl studentService;

	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {

		return studentRepo.save(student);
	}

	@GetMapping("/student")
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}
	
	@GetMapping("student/{sId}")
	public StudentDetailsResponseDTO getStudentById(@PathVariable("sId") String sId) {
		return studentService.getStudentDetails(sId);
	}
	
	
	@DeleteMapping("/student/{sId}")
	public void deleteStudent(@PathVariable("sId") int sId) {
	    studentRepo.deleteById(sId);
	}
}
