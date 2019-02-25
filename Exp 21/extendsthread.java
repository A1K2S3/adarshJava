class thread extends Thread{
	public void run(){
		System.out.println("Working in First Thread!");
	}
}
class thread2 extends Thread{
	public void run(){
		System.out.println("Working in Second Thread!");
	}
}
class extendsthread{
	public static void main( String args[] ) {
		thread t1 = new thread();
		thread2 t2 = new thread2();
		t1.start();
		t2.start();
	}
}
