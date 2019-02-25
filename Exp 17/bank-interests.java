class rate{
	double interest;
	void rateofI(Double i){
		this.interest = i;
	}
}
class banks extends rate{
	String objname;
	void rateofI(String name){
		System.out.println("Rate of Interest in " + objname + " is " + super.interest);
	}
	public static void main( String args[] ) {

		banks BOB = new banks();
		banks SBI = new banks();

		BOB.rateofI(11.0);
		BOB.rateofI("BOB");

		SBI.rateofI(12.0);
		SBI.rateofI("SBI");
		
	}
}
