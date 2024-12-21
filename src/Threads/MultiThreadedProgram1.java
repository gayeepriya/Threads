package Threads;
class MultiThreadedProgram1{
	public static void main(String[] args) throws InterruptedException
	{
		Operations1 op1=new Operations1();
		Operations1 op2=new Operations1();
		Operations1 op3=new Operations1();
		
//		op1.setName("add");
//		op2.setName("print");
//		op3.setName("bank");
//		
//	     op1.start();
//	     op2.start();
//	     op3.start();
		
		Thread t1=new Thread(op1);
		Thread t2=new Thread(op2);
		Thread t3=new Thread(op3);
		
		t1.setName("Add");
		t2.setName("Print");
		t3.setName("Bank");
		
		t1.start();
		
		t2.start();
		
		t3.start();
	}
}
