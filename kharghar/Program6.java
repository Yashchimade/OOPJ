package com.cdac.kharghar;
import java.util.*;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight;
		double height;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		
		
        System.out.print("Enter your weight in kgs: ");
        weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
	}

}
