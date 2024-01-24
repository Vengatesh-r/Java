package Com.mt.pkg;

class A extends Thread {
	public void run() {
		for (int i = 9000; i < 9100; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count > 0) {
				// System.out.println("prime no");
			} else {
				System.out.println("prime" + i);
			}
		}

	}
}

class B extends Thread {
	public void run() {
		String original = "malayalam";
		String reverse = "";
		char[] c = original.toCharArray();
		for (int i = c.length - 1; i > 0; i--) {
			reverse = reverse + c[i];

		}
		if (original.equals(reverse)) {
			System.out.println("Given string is pallindrom");
		} else {
			System.out.println("given string is not pallindrom");
		}

	}
}

class C extends Thread {

	public void run() {
		int num = 12;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));

		}
	}

}

public class Mt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();

	}

}
