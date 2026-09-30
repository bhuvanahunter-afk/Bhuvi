package com.example.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
 private final StudentRepository repo;
 public StudentController(StudentRepository repo){this.repo=repo;}

 @GetMapping
 public List<Student> getAll(){return repo.all();}

 @PostMapping
 public ResponseEntity<String> add(@RequestBody Student s){
  if(s.getName()==null||s.getName().isBlank()||s.getEmail()==null||s.getEmail().isBlank())
   return ResponseEntity.badRequest().body("Name and email are required.");
  repo.add(s);
  return ResponseEntity.ok("Student saved successfully.");
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<String> delete(@PathVariable int id){
  if(repo.delete(id)==0)return ResponseEntity.notFound().build();
  return ResponseEntity.ok("Student deleted successfully.");
 }
}