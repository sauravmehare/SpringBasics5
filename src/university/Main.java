package university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new  AnnotationConfigApplicationContext(AppConfig.class);
		Teacher teacher1=context.getBean("teacher1",Teacher.class);
		//Student student1=context.getBean("student1",Student.class);
		System.out.println(teacher1);
		//System.out.println(student1);

	}

}
