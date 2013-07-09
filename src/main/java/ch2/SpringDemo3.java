package ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
		IMusicBox musicBox = context.getBean("musicBox", IMusicBox.class);
		musicBox.play();
	}
}