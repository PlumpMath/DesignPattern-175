package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Book{
	static String title;
	
}

class C1 extends Book {
	void fun1(){
		title = "";
	}
}

class C2 {
	void fun(){
		Book obj = new Book();
		System.out.println(obj.title);
		;
	}
}

public class Person {
	final int a = 5;
	public void swap (int x, int y) {
        int temp = x;
        x = y;
        y = temp;
	}
		
	public static void main(String[] args) {
		Person p = new Person();
		int x = 42;
		int y = 24;
		p.swap(x, y);
		System.out.println(x + " " + y);
	}

}
