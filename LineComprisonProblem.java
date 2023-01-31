package com.bridgelabz;

import java.util.Scanner;

public class LineComprisonProblem {
	public static void main(String[] args) {
		System.out.println("Calculate the length of a line using Cartecian co-ordinate system.");
		
		System.out.println("Enter the value of first point :");
		Scanner a = new Scanner(System.in);
		int x1 = a.nextInt();
		int y1 = a.nextInt();

		System.out.println("Enter the value of secound point :");
		Scanner b = new Scanner(System.in);
		int x2 = b.nextInt();
		int y2 = b.nextInt();

		int length = (int)(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

		System.out.println("Length of a line = "+Math.sqrt(length));


	}

}
