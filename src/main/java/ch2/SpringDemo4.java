package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		SomeBean sb = context.getBean("son", SomeBean.class);
		System.out.println(sb.getName() + " " + sb.getAge());
	}
}