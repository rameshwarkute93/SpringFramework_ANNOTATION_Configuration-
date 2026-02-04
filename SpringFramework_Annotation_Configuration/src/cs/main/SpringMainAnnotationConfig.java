package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cs.model.Student;
import cs.repo.Studentrepo;

public class SpringMainAnnotationConfig {
	public static void main(String[] args) {
		ApplicationContext a = new AnnotationConfigApplicationContext(Studentrepo.class);
		Student s = (Student) a.getBean("student");
		s.disp();
	}
}
