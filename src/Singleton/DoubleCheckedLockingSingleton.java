package Singleton;

// This method of creating thread safe Singleton is highly discouraged now

// But it is good to know about this procedure too.

class DoubleCheckedLockingSingletonDemo {

	public DoubleCheckedLockingSingletonDemo() {
	}

	int value = 0;
	private static DoubleCheckedLockingSingletonDemo INSTANCE = null;

	public static DoubleCheckedLockingSingletonDemo getInstance() {

		if (INSTANCE == null) {
			synchronized (DoubleCheckedLockingSingletonDemo.class) {
				if (INSTANCE == null) {
					INSTANCE = new DoubleCheckedLockingSingletonDemo();
					return INSTANCE;
				}
			}
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

public class DoubleCheckedLockingSingleton {

	public static void main(String... args) {
		DoubleCheckedLockingSingletonDemo singleton = DoubleCheckedLockingSingletonDemo.getInstance();

		singleton.setValue(22);
		System.out.println(singleton.getValue());
		
		DoubleCheckedLockingSingletonDemo singleton1 = DoubleCheckedLockingSingletonDemo.getInstance();
		System.out.println(singleton.equals(singleton1));

	}

}
