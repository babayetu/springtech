package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch1.Business;

public class SpringDemo2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		Business service = (Business) ctx.getBean("business");
		service.save();
	}
}
