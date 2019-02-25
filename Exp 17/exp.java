class base{
	public static void one(){
	System.out.println("Hello");
	}
}
class child extends base{
	public static void one(){
		System.out.println("HelloWorld");
	}
	public static void main( String args[] ) {

		child o = new child();
		o.one();		
	}
}