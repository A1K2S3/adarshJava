// class dimension{
// 	int l,b,h;
// 	dimension(int l, int b, int h){
// 		this.l = l;
// 		this.b = b;
// 		this.h = h;
// 	}
// }
// class Methods extends dimension{
// 	double area,volume;
// 	Methods(int l,int b, int h){
// 		super(l,b,h);
// 	}
// 	public void area() {
// 		this.area = (2*this.l*this.b) + (2*this.b*this.h) + (2*this.l*this.h);
// 		System.out.println("Area : " + this.area);
// 	}
// 	public void volume() {
// 		this.volume = this.l*this.b*this.h;
// 		System.out.println("Volume : " + this.volume);
// 	}
// 	public static void main( String args[] ) {
// 		Methods room1 = new Methods(1,1,1);
// 		room1.area();
// 		room1.volume();
// 		Methods room2 = new Methods(2,2,2);
// 		room2.area();
// 		room2.volume();
// 	}
// }

class dimensions{
	int l,b,h;
	public void dimensions(int l, int b, int h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
}
class Methods extends dimensions{
	public void area() {
		int this.area = (2*this.l*this.b) + (2*this.b*this.h) + (2*this.l*this.h);
		System.out.println("Area : " + this.area);
	}
	public void volume() {
		this.volume = this.l*this.b*this.h;
		System.out.println("Volume : " + this.volume);
	}
	public static void main( String args[] ) {
		Methods room1 = new Methods();
		room1.dimensions(1,1,1);
		room1.area();
		room1.volume();
		Methods room2 = new Methods();
		room2.dimensions(2,2,2);
		room2.area();
		room2.volume();
	}
}