package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrieve Bean from Spring Container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach newCoach = context.getBean("newCoach", Coach.class);
		
		
		//Call methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyWorkout());
		
		//Close the context
		context.close();
	}

}
