package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate template;

	@Transactional
	public int insert(Student student) {	
		Integer i =(Integer) this.template.save(student);
		return i;
	}
	@Transactional
	public void delete(int id) {
		Student st=this.template.get(Student.class,id);
		this.template.delete(st);
	}
	@Transactional
	public void update(Student st) {
		this.template.update(st);
		
	}
	
	public Student getStudent(int id) {
		Student st=this.template.get(Student.class, id	);
		return st;
	}
	
	public List<Student> getAll(){
		List<Student> list=this.template.loadAll(Student.class);
		return list;
	}

	
	
	
	
	// getter setter
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
}
