package demo.demo;

class A {
	void m1() {
		System.out.println("In m1 A");
	}

	void m2() {
		System.out.println("In m2 A");
	}

}

class B extends A {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

interface AA {
	void m1();

	void m2();
}

class BB implements AA {

	public void m1() {
		System.out.println("In m1 BB");

	}

	public void m2() {
		System.out.println("In m2 BB");

	}
}

public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.m2();

		B b = new B();
		b.m2();

		AA aa = new BB();
		aa.m2();

		BB bb = new BB();
		bb.m2();
	}
}
