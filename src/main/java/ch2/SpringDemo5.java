package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo5 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		HelloBean hb = context.getBean("helloBean", HelloBean.class);
		System.out.println(hb.getName() + " " + hb.getHelloWorld());
	}
}