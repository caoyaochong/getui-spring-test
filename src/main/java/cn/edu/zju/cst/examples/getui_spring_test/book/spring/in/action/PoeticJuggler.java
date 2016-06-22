package cn.edu.zju.cst.examples.getui_spring_test.book.spring.in.action;

public class PoeticJuggler extends Juggler {
	private Poem poem;

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags) {
		super(beanBags);
	}

	@Override
	public void perform() {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
	
	
	

}
