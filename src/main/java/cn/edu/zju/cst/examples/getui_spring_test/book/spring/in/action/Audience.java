package cn.edu.zju.cst.examples.getui_spring_test.book.spring.in.action;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
	
	public Audience() {
		super();
	}

	public void takSeats() {
		System.out.println("The audience is taking their seats");
	}
	
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}
	
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP");
	}
	
	public void demandRefund() {
		System.out.println("Boo! We want our money back");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("The audience is taking their seats");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis();
			
			joinPoint.proceed();
			
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start) + " milliseconds");
			
		}catch(Throwable e) {
			System.out.println("Boo! We want our money back");
		}
	}

}
