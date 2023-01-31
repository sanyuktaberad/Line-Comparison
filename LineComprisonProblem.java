package com.bridgelabz;

import java.util.Scanner;

public class LineComprisonProblem {
	public static void main(String[] args) {
		System.out.println("Calculate the length of a line using Cartecian co-ordinate system.");

		System.out.println("Enter the value of first point :");
		Scanner a = new Scanner(System.in);
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int p1 = a.nextInt();
		int q1 = a.nextInt();

		System.out.println("Enter the value of secound point :");
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		int p2 = a.nextInt();
		int q2 = a.nextInt();

		int l = (int)(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		int l2 =(int)(((q2-q1)*(q2-q1))+((p2-p1)*(p2-p1)));

		System.out.println("The length of first line is "+ l +"& length of the second line is "+l2+" .");

		
		if (l==l2) {

			System.out.println("The given lines are equal.");

		}
		
		else if (l<l2){
			
			System.out.println("The first line is smaller than than the secound one.");
			
		}
		
		else {
		
			System.out.println("The first line is greater than the secound one.");
		
		}
	}
}