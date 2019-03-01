interface one{
	default void display1(){
		System.out.println("In the First Class");
	}
}
interface two{
	default void display2(){
		System.out.println("In the Second Class");
	}
}
class multiple implements one,two{
	void display3(){
		System.out.println("In the third Class");
	}
	public static void main( String args[] ) {
		multiple obj1 = new multiple();
		obj1.display1();
		obj1.display2();
		obj1.display3();
	}
}