package com.lucle.springboottutorial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucle.springboottutorial.models.Student;
import com.lucle.springboottutorial.repositories.StudentRepository;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	// http://localhost:8083/students/hello

//	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
//	public String hello(ModelMap modelMap) {
//		return "Hello World. How are you ?";
//	}
	
//	http://localhost:8083/api/v1/students
	@GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
	
	@PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
	
	@PutMapping("/{id}")
    public Student updateBook(@PathVariable Integer id, @RequestBody Student student) {
		student.setId(id);
        return studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id) {
    	studentRepository.deleteById(id);
    }
	

}
