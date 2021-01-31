package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dao.impl.StudentDaoImpl;

@SpringBootApplication
public class Lesson16Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Lesson16Application.class, args);
		StudentDaoImpl student = (StudentDaoImpl) ctx.getBean("student");

		Student student1 = new Student(0, "st1", 96);

		Student student2 = new Student(1, "st2", 666);

		student.create(student1);
		student.create(student2);

		System.out.println(student.read(0));

		System.out.println(student.update(student2));

		System.out.println(student.readAll());

		student.delete(1);

		System.out.println(student.read(0));

		student.clear();
	}

}
