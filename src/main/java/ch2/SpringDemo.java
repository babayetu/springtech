package ch2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo {
	static Logger logger = Logger.getLogger(SpringDemo.class);
	
	public static void main(String[] args) {
		Resource rs = new ClassPathResource("beans-config.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		HelloBean hb = (HelloBean)factory.getBean("helloBean");
		
		PropertyConfigurator.configure(SpringDemo.class.getClassLoader().getResource("log4j.properties"));
		logger.warn(hb.getHelloWorld());
	}
}