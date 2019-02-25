class table{
	synchronized void print(int n){
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i );
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class thread1 extends Thread{
	table t;
	thread1(table t){
		this.t = t;
	}
	public void run() {
		t.print(5);
	}
}
class thread2 extends Thread{
	table t;
	thread2(table t){
		this.t = t;
	}
	public void run() {
		t.print(6);
	}
}
class Syncronized{
	public static void main( String args[] ) {
		table o = new table();
		thread1 t1 = new thread1(o);
		thread2 t2 = new thread2(o);
		t1.start();
		t2.start();
	}
}