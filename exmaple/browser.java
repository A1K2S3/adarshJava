import java.awt.Desktop;
import java.net.URI;
class browser{
	public static void main(String[] args) {
		Desktop d = Desktop.getDesktop();
		try {
				d.browse(new URI("http://google.com"));
		} catch(Exception e){
			System.out.println(e);
		}
	}
}