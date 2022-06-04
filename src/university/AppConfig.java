package university;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("university/data.properties")
@ComponentScan(basePackages = "university")
public class AppConfig {
	
	@Bean
	public Teacher teacher1() {
		Teacher teacher1=new Teacher();
		teacher1.setEmpId("1234");
		teacher1.setAddress(add2());
		return teacher1;		
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public Student student1() {
		Student stu=new Student();
		stu.setID("Saurav1234");
		stu.setName("Saurav Mehare");
		//stu.setAddress(add2());
		return stu;
	}
	
	@Bean()
	public Address add1(){
		//Address add2=new Address("${add2.residential}","${add2.pin}");
		Address add2=new Address();
		add2.setResidental("Delhi");
		return add2;
	}
	
	@Bean()
	public Address add2(){
		//Address add2=new Address("${add2.residential}","${add2.pin}");
		Address add2=new Address();
		add2.setResidental("${add2.residential}");
		//add2.setPin(Long.parseLong("${add2.pin}"));// error in setting address
		return add2;
	}
	
	
	

}
