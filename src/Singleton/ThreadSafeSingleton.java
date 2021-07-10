package Singleton;


// Thread Safe Singleton is actually  Lazy Singleton with synchronised keyword


class ThreadSafeSingletonDemo {

	private int value = 0;
	private static ThreadSafeSingletonDemo INSTANCE = null;

	private ThreadSafeSingletonDemo() {
	}

	public static synchronized ThreadSafeSingletonDemo getINSTANCE() {

		if (INSTANCE == null) {
			INSTANCE =  new ThreadSafeSingletonDemo();
			return INSTANCE;
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
	public static void main(String... args) {
		ThreadSafeSingletonDemo threadSafeSingleton = ThreadSafeSingletonDemo.getINSTANCE();
		threadSafeSingleton.setValue(123);

		System.out.println(threadSafeSingleton.getValue());
		
		ThreadSafeSingletonDemo threadSafeSingleton1 = ThreadSafeSingletonDemo.getINSTANCE();
		
		System.out.println(threadSafeSingleton.equals(threadSafeSingleton1));
	}
}