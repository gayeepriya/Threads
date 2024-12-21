
public class EvenOrOdd implements Runnable {
	static int count=1;
	Object obj;
		public EvenOrOdd (Object obj)
	{
	super();
	this.obj=obj;
}

	@Override
	public void run() {
		
			while(count<=10) {
				if(count%2==0&&Thread.currentThread().getName().equals("even")){
						synchronized(obj){
							System.out.println("ThreadName:"+Thread.currentThread().getName()+"value:"+count);
							try {
							Thread.sleep(2000);
							}catch(InterruptedException e) {
                            //TODO Auto-generatedException catch block
							
						 e.printStackTrace();
						}
						count++;
						try {					
							obj.wait();
						}
				catch(Exception e) 
						{
					e.printStackTrace();
						}
				}
			}
						if(count%2!=0&&Thread.currentThread().getName().equals("odd")&& count<=10) {
							synchronized(obj) {
								System.out.println("ThreadName:"+Thread.currentThread().getName()+"value:"+count);
								try {
								
								Thread.sleep(2000);
								}catch(InterruptedException e) {
									//TODO Auto-generatedException catch block
									e.printStackTrace();
								
								}
								count++; 
								try {
								
								obj.notify();
								}
								catch(Exception e) {
									e.printStackTrace();
								}
							}
						}
							}
								
	

}

}

			
		
		
	



							
						
				
			
		
		
									
								
							
						
			
		
		
	


