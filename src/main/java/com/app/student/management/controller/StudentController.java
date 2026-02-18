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
	private IStudentService student;

	@Autowired
	private StudentRepository repo;

	/*@PostMapping("/student/save")
	public String addStudent(@RequestBody StudentDetailsRequestDTO request) {
		return student.saveStudentDetails(request);

	}*/

	@GetMapping("/student")
	public List<Student> getAllStudent() {

		return repo.findAll();
	}

	@GetMapping("/{sId}")
	public StudentDTO getStudentById(@PathVariable("sId") String sId) {
		return student.getStudentDetails(sId);
	}
	@GetMapping("/student/count")
	public Long getNoOfStudentRecords(){
        return student.getStudentCount();
	}
	
	@DeleteMapping("/student/{sId}")
	public void deleteStudent(@PathVariable("sId") int sId) {
	    repo.deleteById(sId);
	}
}
