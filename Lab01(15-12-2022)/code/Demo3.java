/* Write a java program to Record the Weekly temperature of two cities and display it.

About Program: I use simple for loop condition to inital and print the value.  */ 

import java.util.*;
 class Demo3
 {
	 static int city = 2;

	 static int week = 7;

	public static void main(String args[])
	{
		int[][] temperature = new int[city][week];
       Scanner sc = new Scanner(System.in);
	
		for(int i = 0; i < city; i++) {
			for(int j = 0; j < week; j++) {
				System.out.print("City[" + (i + 1) + "], Day[" + (j + 1) + "]: ");
				temperature[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		
		System.out.println("Displaying Values:\n");

		for(int i = 0; i < city; i++) {
			for(int j = 0; j < week; j++) {
				System.out.println("City[" + (i + 1) + "], Day[" + (j + 1) + "]=" + temperature[i][j]);
			}
			System.out.println();
		}
	}

}