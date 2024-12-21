package Threads;

import java.util.Scanner;

public class SingleThreadProgram {
public static void main(String[] args)throws InterruptedException
{
	Scanner sc=new Scanner(System.in);
			System.out.println("Task1:Addition operation started");
			System.out.println("Enter the first number:");
			int num1=sc.nextInt();
			System.out.println("Enter the second number:");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("Resultis:"+res);
			System.out.println("Task 1:Addition operation completed");
			System.out.println("Task 2:Printing operation started");
			for(int i=0;i<5;i++)
			{
				System.out.println("Gayee priya");
				Thread.sleep(2000);
			}
			System.out.println("Task 2:Printing operation completed");
			System.out.println("Task 3:Banking operation started");
			System.out.println("enter the account number:");
			int acc=sc.nextInt();
			System.out.println("enter the pin code:");
			int pin=sc.nextInt();
			System.out.println("Account details recorded");
			System.out.println("Task 3:Banking operation is completed");
				
			}
}

