package com.app.student.management.controller;

import com.app.student.management.dto.StudentDetailsRequestDTO;
import com.app.student.management.dto.StudentDetailsResponseDTO;
import com.app.student.management.entity.Student;
import com.app.student.management.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

	@Autowired
	private IStudentService student;

	@PostMapping("/student")
	public String addStudent(@RequestBody StudentDetailsRequestDTO request) {
		String msg = student.saveStudentDetails(request);
		return msg;
	}

	/*@GetMapping("/student")
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}*/
	
	@GetMapping("student/{sId}")
	public StudentDetailsResponseDTO getStudentById(@PathVariable("sId") String sId) {
		return student.getStudentDetails(sId);
	}
	@GetMapping("/student/count")
	public Long getNoOfStudentRecords(){
        return student.getStudentCount();
	}
	
	/*@DeleteMapping("/student/{sId}")
	public void deleteStudent(@PathVariable("sId") int sId) {
	    studentRepo.deleteById(sId);
	}
*/
}
