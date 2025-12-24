package net.school.student_backend.controller;

import lombok.AllArgsConstructor;
import net.school.student_backend.dto.StudentDto;
import net.school.student_backend.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    //Build Add Student REST API

    @PostMapping("/students")
    public ResponseEntity<StudentDto>createStudent(@RequestBody StudentDto studentDto){
        StudentDto saveStudent = studentService.createStudent(studentDto);
        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }

}
