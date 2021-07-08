package Singleton;

class BasicSingletonDemo {

	private BasicSingletonDemo() {
	}

	private static final BasicSingletonDemo INSTANCE = new BasicSingletonDemo();
	private int value = 0;

	public static BasicSingletonDemo getINSTANCE() {
		return INSTANCE;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class BasicSingleton {

	public static void main(String... args) {
		BasicSingletonDemo basicSingletonDemo = BasicSingletonDemo.getINSTANCE();
		basicSingletonDemo.setValue(12);
		basicSingletonDemo.setValue(15);
		System.out.println(basicSingletonDemo.getValue());
	}
}