package com.cdac.kharghar;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int grade = sc.nextInt();
		
		if(grade>=90 && grade<=100) {
			System.out.println("A Grade");
		}else if(grade>=80) {
			System.out.println("B Grade");
		}else if (grade>=70) {
			System.out.println("C Grade");
		}else if (grade>=60) {
			System.out.println("D Grade");
		}else {
			System.out.println("Fail");
		}
	}

}
