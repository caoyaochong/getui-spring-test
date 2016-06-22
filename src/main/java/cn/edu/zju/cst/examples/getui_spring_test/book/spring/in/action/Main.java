package cn.edu.zju.cst.examples.getui_spring_test.book.spring.in.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//		Performer performer = (Performer) ac.getBean("duck");
//		performer.perform();
		
		Performer performer = (Performer)ac.getBean("hank");
		performer.perform();

	}

}
