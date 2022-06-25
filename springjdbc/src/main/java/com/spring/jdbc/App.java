package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.Dao.studentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        studentDao temp = context.getBean("studentdao",studentDao.class);
        
//      insert
        
//        Student st=new Student();
//        st.setId(0010);
//        st.setName("hello");
//        st.setCity("usa");
//        int result = temp.insert(st);
//        System.out.println(result);
        
//      update
        
//        Student st=new Student();
//        st.setName("naman");
//        st.setCity("lucknow");
//        st.setId(1);
//        int result=temp.change(st);
//        System.out.println(result);
        
//      delete
       
//        int result=temp.delete(8);
//        System.out.println(result);
        
        // select single data
        
//        Student st=temp.getData(1);
//        System.out.println(st);
        
//        select all student
        
//        List<Student> list=temp.getAllData();
//        
//        for(Student s:list) {
//        	System.out.println(s);
//        }
//        
        
        
//        Without xml
        ApplicationContext context=new AnnotationConfigApplicationContext(Jdbcconfig.class);
        studentDao temp = context.getBean("studentdao",studentDao.class);
        
        
      List<Student> list=temp.getAllData();
      
      for(Student s:list) {
      	System.out.println(s);
      }
        
        
        
        
        
        
        
    }
}
