package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Dao.studentDao;
import com.spring.jdbc.Dao.studentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.Dao"})
public class Jdbcconfig {
	
	@Bean("ds")
	public DataSource getDS() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("deependra");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDS());
		return jdbcTemplate;
	}
	
//	@Bean("studentdao")
//	public studentDao getStudentDao() {
//		studentDaoImpl st=new studentDaoImpl();
//		st.setTemplate(getTemplate());
//		return st;
//		
//		
//	}
	
	

}
