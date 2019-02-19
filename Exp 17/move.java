class animal{
	int speed;	
	void move(int s){
		this.speed = s;
	};
}
class dog extends animal{
	void move(int s){
		super.move(s);
		System.out.println("Speed of Baxter is "+super.speed +" m/s");
	}
}
class move{
	public static void main( String args[] ) {

			dog d = new dog();
			d.move(12);
	}
}