// Page no.: Q13 1
interface NewShape{
	default void draw(){};
}
interface circle{
	default void getRadius(){};
	int radius = 10;
}
class NewCircle implements circle,NewShape{
	public void getRadius() {
		System.out.println(radius);
	}
}
class wrong extends NewCircle{
	public static void main(String[] args) {
		NewCircle nc = new NewCircle();
		nc.getRadius();
	}
}