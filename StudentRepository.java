package com.example.student;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepository {
 private final JdbcTemplate jdbc;
 public StudentRepository(JdbcTemplate jdbc){this.jdbc=jdbc;}

 public int add(Student s){
  return jdbc.update("INSERT INTO students(name,email,phone,course) VALUES(?,?,?,?)",
   s.getName(),s.getEmail(),s.getPhone(),s.getCourse());
 }

 public List<Student> all(){
  return jdbc.query("SELECT id,name,email,phone,course,DATE_FORMAT(created_at,'%Y-%m-%d %H:%i:%s') created_at FROM students ORDER BY id DESC",
   (rs,n)->new Student(rs.getInt("id"),rs.getString("name"),rs.getString("email"),
   rs.getString("phone"),rs.getString("course"),rs.getString("created_at")));
 }

 public int delete(int id){return jdbc.update("DELETE FROM students WHERE id=?",id);}
}