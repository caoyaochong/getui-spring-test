package cn.edu.zju.cst.examples.getui_spring_test.book.spring.in.action;

public class Juggler implements Performer {
	private int beanBags = 3;

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	public Juggler() {
	}

	@Override
	public void perform() {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");

	}

}
