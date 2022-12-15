/* Write a java program there are two Departments and each Department have two Students.  Every Student have 3 Subject .
Initializing marks for each student and print the total of the Student in each Department.

About program:  I use Simple 2D Array to Inital the marks and Add the 3 subject marks using simple Arithmetic method and finally it will print the output. For the
clear explanatin i use String type to identify the person*/

 class Demo2

 {
	
	public static void main(String[] args)
	{
		
		
		int[][] marks = new int[4][3];
	
		marks[0][0] = 40;
		marks[0][1] = 50;
		marks[0][2] = 60;
		
		marks[1][0] = 40;
		marks[1][1] = 72;
		marks[1][2] = 49;

		marks[2][0] = 45;
		marks[2][1] = 50;
		marks[2][2] = 60;
	
		marks[3][0] = 40;
		marks[3][1] = 72;
		marks[3][2] = 49;
		
		
		
		String a = "Student 1, Department 1";
		String b = "Student 2, Department 1";
		String c = "Student 1, Department 2";
		String d = "Student 2, Department 2";
		
		int total1 = marks[0][0] + marks[0][1] + marks[0][2];
		System.out.println("Total marks of " + a + ": " + total1);
		

		int total2 = marks[1][0] + marks[1][1] + marks[1][2];
		System.out.println("Total marks of " + b + ": " + total2);
		
		
		int total3 = marks[2][0] + marks[2][1] + marks[2][2];
		System.out.println("Total marks of " + c + ": " + total3);
		
		int total4 = marks[3][0] + marks[3][1] + marks[3][2];
		System.out.println("Total marks of " + d + ": " + total4);
	}

}