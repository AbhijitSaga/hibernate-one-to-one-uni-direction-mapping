package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Instructor;
import com.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(InstructorDetail.class);
		configuration.addAnnotatedClass(Instructor.class);
		//create sessionFectory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		//get session
		Session session = sessionFactory.getCurrentSession();

		try {
			//create the object
			Instructor theInstructor=new  Instructor("abhijit","sagar","abhijitsagar1204@gmail.com");
			
			InstructorDetail theInstructorDetail=new InstructorDetail("abhijitYouTubeChannel", "codding");
			
			
			
			theInstructor.setInstructorDetail(theInstructorDetail);
			
			//start a transaction
			session.beginTransaction();
           
			//save the instructor
			//associate the object
			//Note: this will also save the InstructorDetail object
			//because of cascadeType.ALL
			
			System.out.println("saving instructor detail");
			session.save(theInstructor);
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done......");
		} finally {
			session.close();
		}

	}
}
