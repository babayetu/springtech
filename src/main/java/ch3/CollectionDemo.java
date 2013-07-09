package ch3;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch2.SomeBean;

public class CollectionDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-config3.xml");
		CollectionBean cb = context.getBean("cb", CollectionBean.class);

		String[] str=cb.getStrArray();
		SomeBean[] sb=cb.getSbArray();
		
		for(SomeBean sbi:sb) {
			System.out.println(sbi.getName()+" ");
		}
		
		List list=cb.getList();
		for (Object li:list) {
			System.out.println(li.toString());
		}
		
		Map map=cb.getMap();
		System.out.println(map.get("MapTest"));
		System.out.println(map.get("MapOtherTest"));
	}
}