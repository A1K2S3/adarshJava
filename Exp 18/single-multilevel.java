class student{
	int r;
	void taker(int rol){
		this.r = rol;
	}
}
class stud_name extends student{
	String name;
	void name(String s){
		this.name = s;
	}
}
class log extends stud_name{
	void disp(){
		System.out.println("Name : " + super.name);
		System.out.println("Roll No.: " + super.r);
		System.out.println("");
	}
	public static void main( String args[] ) {
		log Adarsh = new log();
		Adarsh.taker(12);
		Adarsh.name("Adarsh");
		Adarsh.disp();
		log Omkar = new log();
		Omkar.taker(06);
		Omkar.name("Omkar");
		Omkar.disp();
	}
}
