class X extends Thread{ 
	public void run(){ 
		System.out.println("Thread X Started"); 
		for(int i=0; i<5; i++){ 
			System.out.println("\t Value of i in Thread X : " + i); 
		} 
		System.out.println("Thread x finished "); 
	} 
} 
class Y extends Thread{ 
	public void run(){ 
		System.out.println("Thread Y started"); 
		for(int i=0; i<5; i++){ 
			System.out.println("\tValue of i in Thread Y : " + i); 
		} 
		System.out.println("ThreadY Finished"); 
	} 
} 
class Z extends Thread{ 
	public void run(){ 
		System.out.println("Thread Z started"); 
		for(int i=0; i<5; i++){ 
			System.out.println("\tValue of i in Thread Z : " + i); 
		} 
		System.out.println("ThreadZ Finished"); 
	} 
} 
 class threadPriority{ 
	public static void main( String[] args ){ 
		System.out.println("Main thread started"); 
		X threadX = new X(); 
		Y threadY = new Y (); 
		Z threadZ = new Z (); 
		threadZ.setPriority(Thread.MAX_PRIORITY);  // priority = 10 
		threadY.setPriority(threadX.getPriority()+1); // priority = 6 
		threadX.setPriority(Thread.MIN_PRIORITY); // priority = l 
		threadX.start();
		threadY.start(); 
		threadZ.start(); 
		try{ 
			threadX.join();
			threadY.join();
			threadZ.join(); 
		} 
		catch(InterruptedException e){
			System.out.println(e);
		} 
		System.out.println("Main Thread Finished"); 
	} 
} 
