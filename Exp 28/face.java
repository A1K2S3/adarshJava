import java.applet.*;
import java.awt.*;

/*<applet code = "face.class" width=1000 height=1000>
<param name = "pname" value="Adarsh" />
</applet>*/

public class face extends Applet{
	String name;
	public void init(){
		name = getParameter("pname");
	}
	public void paint(Graphics g){

		g.drawOval(20,20,600,600);
		g.drawOval(175,175,80,80);
		g.drawOval(400,175,80,80);
		g.drawArc(225,250,200,200,200,150);

	}
}