package com.spring.springorm;
import java.io.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao student=context.getBean("studentDao",StudentDao.class);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
//        insert
        
//        Student st=new Student(100000,"aaaa","aaaa");
//        int res=student.insert(st);
//        System.out.println(res);
        
//        delete
//        student.delete(45);
        
//        update
//        Student st=new Student(1,"depeu","lucknow");
//        student.update(st);
        
        System.out.println(student.getStudent(1));
        
        System.out.println(student.getAll());
        
        
        
        
        
        
    }
}
