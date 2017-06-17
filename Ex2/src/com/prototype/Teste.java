package com.prototype;

public class Teste {

	public static void main(String[] args) {
		Bar bar = new Bar("BAR1");
		Foo foo  = new Foo(1, bar);		
		System.out.println("Foo_x = " + foo.x + " Foo_bar = " + foo.bar.getY());
		Foo foo2 = (Foo) foo.clone();
		foo2.x = 2;
		foo2.bar = new Bar("BAR2");
		System.out.println("Foo_x = " + foo2.x + " Foo_bar = " + foo2.bar.getY());
		Foo foo3 = (Foo) foo.clone();
		foo3.x = 3;
		foo3.bar = new Bar("BAR3");
		System.out.println("Foo_x = " + foo3.x + " Foo_bar = " + foo3.bar.getY());

	}

}
