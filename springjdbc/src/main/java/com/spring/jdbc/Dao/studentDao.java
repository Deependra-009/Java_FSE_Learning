package com.spring.jdbc.Dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface studentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getData(int studentId);
	public List<Student> getAllData();
	
}
