class thread1 implements Runnable{
	public void run(){
		System.out.println("Working in first Runnable class!");
	}
}
class thread2 implements Runnable{
	public void run(){
		System.out.println("Working in Second Runnable class!");
	}
}
class runnablethread{
	public static void main( String args[] ) {
		
		thread1 r1 = new thread1();
		thread2 r2 = new thread2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		
	}
}