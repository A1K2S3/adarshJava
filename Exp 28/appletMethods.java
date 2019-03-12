import java.applet.*;
import java.awt.*;

/*<applet code = "appletMethods.class" width=1000 height=1000>
<param name = "pname" value="Adarsh" />
</applet>*/

public class appletMethods extends Applet{
	String name;
	public void init(){
		name = getParameter("pname");
	}
	public void paint(Graphics g){

		int j = 0;
		int w = 0;
		for(int i = 0; i<50;i++){
			g.drawRect(20+w,20+w,500-j,600-j);
			j+=10;
			w=(j/2);
		}

	}
}