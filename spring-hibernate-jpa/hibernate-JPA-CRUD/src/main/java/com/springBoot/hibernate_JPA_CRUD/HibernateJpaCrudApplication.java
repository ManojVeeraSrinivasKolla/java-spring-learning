package com.springBoot.hibernate_JPA_CRUD;

import com.springBoot.hibernate_JPA_CRUD.dao.StudentDAO;
import com.springBoot.hibernate_JPA_CRUD.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernateJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentdao) {
		return runner -> {
//			createStudent(studentDAO);
			createmultiplestudents(studentdao);

//			readStudent(studentdao);
//			queryForStudents(studentdao);

//			queryForStudentLastName(studentdao);

//			updateStudent(studentdao);

//			deleteStudent(studentdao);

//			deleteAllStudents(studentdao);
		};
	}

	private void deleteAllStudents(StudentDAO studentdao){
		System.out.println("Deleting all students");

		int noo= studentdao.deleteAll();
		System.out.println("Deleted row count: "+noo);
	}


	private void deleteStudent(StudentDAO studentdao){
		int idd=3;

		System.out.println("deleteing student id : "+idd);
		studentdao.delete(idd);
	}
	private void updateStudent(StudentDAO studentdao){
		//retrieve the student based on the id: primary key
		int StudentId=1;
		System.out.println("Getting student id: "+StudentId);
		Student st= studentdao.findById(StudentId);

		//change the first name to scooby
		System.out.println("updateing studennttt...");
		st.setFirst_name("ratannnnnn");


		//UPDATEE the student

		studentdao.update(st);
		//display the updated student
		System.out.println(st);
	}

	private void queryForStudentLastName(StudentDAO studentdao){
		//get a list of students
		List<Student> thestudents=studentdao.findByLastName("konidelaa");

		//display list of students
		for(Student st:thestudents){
			System.out.println(st);
		}


	}

	private void queryForStudents(StudentDAO studentDAO){
		//get a list of students
		List<Student> thestudents=studentDAO.findAll();


		//display list of students
		for(Student st:thestudents){
			System.out.println(st);
		}
	}

	private void createStudent(StudentDAO studentDAO){
		//create the student object

		System.out.println("creating student object......");

		Student st=new Student("Srinivas","Kolla","srinivaskolla@gmail.com");
		//save the student object
		System.out.println("saviing student object....");
		studentDAO.save(st);
		//display the id of the student object
		System.out.println("saved student generated is :"+st.getId());

	}

	private void readStudent(StudentDAO studentdao){
		//creaate a student object
		System.out.println("creating new aastudent");
		Student stt=new Student("ram","konidelaa","ramkonidela@gmail.com");
		//save the student
		System.out.println("saving the student");
		studentdao.save(stt);
		//display the id of the saved student
		int idd=stt.getId();
		System.out.println("saved student id:"+idd);
		//retrieve student based on the id: primary key
		System.out.println("retreiveing the student with id : "+idd);
		Student ram=studentdao.findById(idd);
		//display student
		System.out.println("found the student: "+ram);

	}

	private void createmultiplestudents(StudentDAO studentdao){
		//create the multiple student objects

		System.out.println("creating student objects......");

		Student st1=new Student("Srinivas1","Kolla1","srinivaskolla1@gmail.com");
		Student st2=new Student("Srinivas2","Kolla2","srinivaskolla2@gmail.com");
		Student st3=new Student("Srinivas3","Kolla3","srinivaskolla3@gmail.com");
		//save the student object
		System.out.println("saviing student objects....");
		studentdao.save(st1);
		studentdao.save(st2);
		studentdao.save(st3);
		//display the id of the student object
		System.out.println("saved student generated is :"+st1.getId());
		System.out.println("saved student generated is :"+st2.getId());
		System.out.println("saved student generated is :"+st3.getId());

	}
}