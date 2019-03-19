interface student{
	void setDetails(String name, int roll);
	void getDetails();
}
public class Interface implements student{
	String name;
	int roll;
	public void setDetails(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	public void getDetails(){
		System.out.println("#######################################");
		System.out.println("		Name : " + this.name);
		System.out.println("		Roll : " + this.roll);
		System.out.println("#######################################");
		System.out.println("");
		System.out.println("");
	}
	public static void main(String[] args) {
		Interface Adarsh = new Interface();
		Adarsh.setDetails("Adarsh", 12);
		Adarsh.getDetails();
		Interface Omkar = new Interface();
		Omkar.setDetails("Omkar", 06);
		Omkar.getDetails();
		Interface Yash = new Interface();
		Yash.setDetails("Yash", 32);
		Yash.getDetails();
	}
}