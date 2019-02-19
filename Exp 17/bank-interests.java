class rate{
	double interest;
	void rateofI(Double i){
		this.interest = i;
	}
}
class banks extends rate{
	String objname;
	banks(String name){
		this.objname = name;
	}
	void rateofI(){
		System.out.println("Rate of Interest in " + objname + " is " + super.interest);
	}
	public static void main( String args[] ) {

		banks BOB = new banks("BOB");
		banks SBI = new banks("SBI");

		BOB.rateofI(11.0);
		BOB.rateofI();

		SBI.rateofI(12.0);
		SBI.rateofI();
		
	}
}
