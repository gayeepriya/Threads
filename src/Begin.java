
class Begin{
public static void main(String[] args) {
	Object lock=new Object();
	EvenOrOdd r1=new EvenOrOdd(lock);
	EvenOrOdd r2=new EvenOrOdd(lock);
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	
	
	t1.setName("even");
	t2.setName("odd");

	
	t1.start();
	t2.start();	
	
	
	
}
}


			


