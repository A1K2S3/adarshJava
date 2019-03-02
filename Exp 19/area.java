interface rect{
	int l,b;
	default void rectdimensions(int l, int b){
		this.l = l;
		this.b = b;
	}
	
}
interface circle{
	int r;
	default void cdimensions(int r){
		this.r = r;
	}
	
}
class area implements rect,circle{
	int rarea,carea;
	void rectarea(){
		this.rarea = this.l*this.b;
		System.out.println("Area of rectangle with dimension " + this.l + " " + this.b + " " + " is " + this.rarea);
	}
	void carea(){
		this.carea = 3.14*(this.r*this.r);
		System.out.println("Area of rectangle with radius " + this.r + " is " + this.carea);
	}
	public static void main(String[] args) {
		area obj1 = new area();
		obj1.rectdimensions(1,2);
		obj1.rectarea();
		obj1.cdimensions(2);
		obj1.carea();

	}
}