//Write a java program to check whether it is Pronic Number or not.
import java.util.*;

class Demo1
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scanner.nextInt();
		int mark =0;
		for(int i=0;i<num;i++)
		{
			if(i*(i+1)==num)
			{
				mark = 1;
				break;
			}
			
		}
		if(mark==1)
				
		System.out.println(num + " is Pronic Number");
		   
		else 
				
       System.out.println(num + " is Not a Pronic Number");
			
			
		
		
	}
	
}