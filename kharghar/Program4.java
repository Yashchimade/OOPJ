package com.cdac.kharghar;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number representing a weekday (1-7): ");
		
		int WeekDayNumber = sc.nextInt();
        String dayName;

        switch (WeekDayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid weekday";
                break;
        }

        System.out.println("The weekday corresponding to number " + WeekDayNumber + " is: " + dayName);		
		
	}


}
