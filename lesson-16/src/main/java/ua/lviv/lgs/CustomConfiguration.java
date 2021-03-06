package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {
	@Bean(name = "student")
	public StudentDaoImpl getStudentDaoImplConf() {

		StudentDaoImpl daoImpl = StudentDaoImpl.getStudentDaoImpl();

		return daoImpl;
	}

	@Bean(name = "consoleEventLogger")
	public ConsoleEventLogger getConsoleEventLogger() {
		return new ConsoleEventLogger();
	}
}