package com.example.student;

public class Student {
 private int id;
 private String name,email,phone,course,createdAt;
 public Student(){}
 public Student(int id,String name,String email,String phone,String course,String createdAt){
  this.id=id;this.name=name;this.email=email;this.phone=phone;this.course=course;this.createdAt=createdAt;
 }
 public int getId(){return id;} public void setId(int v){id=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
 public String getEmail(){return email;} public void setEmail(String v){email=v;}
 public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
 public String getCourse(){return course;} public void setCourse(String v){course=v;}
 public String getCreatedAt(){return createdAt;} public void setCreatedAt(String v){createdAt=v;}
}