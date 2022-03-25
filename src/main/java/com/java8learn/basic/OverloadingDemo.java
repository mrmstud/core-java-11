package com.java8learn.basic;

class Exam {
	int roll;
	String name;

	Exam() {
	}

	Exam(int a, String s) {
		roll = a;
		name = s;
	}

	void display(int x) {
		System.out.print(roll);
	}

	void display(int x, int y) {
		System.out.print(roll + " " + name);
	}
}

class Result extends Exam {
	int marks;

	Result() {
	}

	Result(int a, String s, int m) {
		super(a, s);
		marks = m;
	}

	void display() {
		super.display(1);
		super.display(1, 2);
		System.out.println(" " + marks);
	}

	static void sort(Result a[], int n) {
		Result temp = new Result();
		for (int i = 0; i < n; i++) {
			for (int j = (i + 1); j < n; j++) {
				if (a[i].marks < a[j].marks) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {
		Result a[] = new Result[5];
		a[0] = new Result(2, "Maheen", 200);
		a[1] = new Result(3, "Hina", 210);
		a[2] = new Result(4, "Mehak", 100);
		a[3] = new Result(5, "Mareen", 150);
		a[4] = new Result(6, "Sadaf", 120);
		System.out.println("Before Sorting ");
		for (int i = 0; i < 5; i++)
			a[i].display();
		Result.sort(a, 5);
		System.out.println("After Sorting based on Marks and Sports marks");
		for (int i = 0; i < 5; i++)
			a[i].display();
	}
}