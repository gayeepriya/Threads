package MultiThreadingProgram;
import java.util.InputMismatchException;
import java.util.Scanner;
class Operations extends Thread{
public void run() {
	if (Thread.currentThread().getName().equals("Add"))
		   Add();
      
      else if(Thread.currentThread().getName().equals("Print")) {
           Print();
	}
	else {
		Bank();
	}
}
     
    		 public void Add()
    		 {
    	 try
    	 {
    		 Scanner sc=new Scanner(System.in);
    		 System.out.println("Task 1:Addition operation started");
    		 System.out.println("Enter the first number:");
    		 int num1=sc.nextInt();
 			System.out.println("Enter the second number:");
 			int num2=sc.nextInt();
 			int res=num1+num2;
 			System.out.println("Result is:"+res);
 			System.out.println("Task 1:Addition operation completed");
    	 }
    	 catch(ArithmeticException e1)
    	 {
    		 e1.printStackTrace();
    	 }
    	 catch(InputMismatchException e2)
    	 {
    		 e2.printStackTrace();
    	 }
    		 }
     public void Print()
     {
    	 try
    	 {
    		 System.out.println("Task 2: printing operation started");
    		 for(int i=0;i<5;i++)
    		 {
    			 System.out.println("GTEC JAINx BANGALORE");
    			 Thread.sleep(4000);;
    		 }
    		 System.out.println("Task 2: printing operation completed"); 
    	 }
    	 catch(InterruptedException e)
    	 {
    		 e.printStackTrace();
    	 }
     }
     public void Bank()
     {
    	 try
    	 {
    		 Scanner sc=new Scanner(System.in);
    		 System.out.println("Task 3:Banking operation started");
 			System.out.println("enter the account number:");
 			int acc=sc.nextInt();
 			System.out.println("enter the pin code:");
 			int pin=sc.nextInt();
 			System.out.println("Account details recorded");
 			System.out.println("Task 3:Banking operation is completed");
    	 }
    	 catch(ArithmeticException e1)
    	 {
    		 e1.printStackTrace();
    	 }
    		 catch(InputMismatchException e2) {
    	 e2.printStackTrace();
     }
     }
     }
     


    	
 				
    		 
    	 
    	
    		 
	
			


