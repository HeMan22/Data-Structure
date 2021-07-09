package Singleton;

class ThreadSafeSingletonDemo {

	private int value = 0;
	private static final ThreadSafeSingletonDemo INSTANCE = null;

	private ThreadSafeSingletonDemo() {
	}

	public static synchronized ThreadSafeSingletonDemo getINSTANCE() {

		if (INSTANCE == null) {
			return new ThreadSafeSingletonDemo();
		}
		return INSTANCE;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

public class ThreadSafeSingleton {
	public static void main(String...args) {
		ThreadSafeSingletonDemo threadSafeSingleton = ThreadSafeSingletonDemo.getINSTANCE();
		threadSafeSingleton.setValue(123);
		
		System.out.println(threadSafeSingleton.getValue());
	}
}