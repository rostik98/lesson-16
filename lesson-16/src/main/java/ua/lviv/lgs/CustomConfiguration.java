package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {
	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setName("Ivan");
		;
		student.setAge(19);
		student.setId(1);
		return student;
	}

	@Bean(name = "consoleEventLogger")
	public ConsoleEventLogger getConsoleEventLogger() {
		return new ConsoleEventLogger();
	}
}
