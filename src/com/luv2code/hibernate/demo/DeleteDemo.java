package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Instructor;
import com.entity.InstructorDetail;

public class DeleteDemo {
public static void main(String[] args) {
	
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(Instructor.class);
	configuration.addAnnotatedClass(InstructorDetail.class);
	
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.getCurrentSession();
	try {
		session.beginTransaction();
		//get instructor by primary key/Id
		int theId=2;
		Instructor tempInstructor=session.get(Instructor.class, theId);
		
		System.out.println("Found instructor: "+tempInstructor);
		
		//delete the instructor
		if (tempInstructor !=null) {
			
			System.out.println("Delete the instructor  for this id");
			session.delete(tempInstructor);
		}
		session.getTransaction().commit();
		
	} finally {
		session.close();
	}
}
}
