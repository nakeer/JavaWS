package threads;

class ThreadA extends Thread {
	public void run() {
		for(int i =0; i<3 ; i++) {
			System.out.println("A: " + i);
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		for(int i =0; i<3 ; i++) {
			System.out.println("B: " + i);
		}
	}
}

class ThreadC extends Thread {
	public void run() {
		for(int i =0; i<3 ; i++) {
			System.out.println("C: " + i);
		}
	}
}


public class NewThreadCreeationTest {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();

	}

}
