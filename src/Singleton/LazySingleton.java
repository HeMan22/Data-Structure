package Singleton;

class LazySingletonDemo {

	private int value = 0;
	private static LazySingletonDemo single_instance = null;

	private LazySingletonDemo() {
	}

	static LazySingletonDemo getInstance() {
		if (single_instance == null)
			single_instance = new LazySingletonDemo();

		return single_instance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class LazySingleton{
	public static void main(String...args) {
		LazySingletonDemo lazySingleton = LazySingletonDemo.getInstance();
		lazySingleton.setValue(123);
		
		System.out.println(lazySingleton.getValue());
	}
}
