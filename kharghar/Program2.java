package com.cdac.kharghar;
import java.util.*;

@SuppressWarnings("unused")

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        String result = leapYear ? "Leap year" : "Not a leap year";
        
        System.out.println(year + " is " + result);
		
	}

}
