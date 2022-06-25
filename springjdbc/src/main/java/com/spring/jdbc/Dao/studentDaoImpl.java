package com.spring.jdbc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentdao")
public class studentDaoImpl implements studentDao{

	@Autowired
	private JdbcTemplate template;
	

	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student values(?,?,?)";
		int res = this.template.update(query,student.getId(),student.getName(),student.getCity());
		
		return res;
	}


	public int change(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=? ,city=? where id=?";
		int res=this.template.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}


	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int res=this.template.update(query,studentId);
		return res;
	}


	public Student getData(int studentId) {
		// TODO Auto-generated method stub
		String query="select * from student where id=?";
		RowMapper<Student> rowmapper=new RowMapperImpl();
		Student st=this.template.queryForObject(query, rowmapper,studentId);
		return st;
	}


	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		String query="select * from student";
		
		List<Student> list = this.template.query(query, new RowMapperImpl());
		
		
		return list;
	}
	
	
}
