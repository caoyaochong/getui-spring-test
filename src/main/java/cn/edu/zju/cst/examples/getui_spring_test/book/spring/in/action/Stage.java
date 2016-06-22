package cn.edu.zju.cst.examples.getui_spring_test.book.spring.in.action;

public class Stage {

	private Stage() {
	}
	
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
	

}
