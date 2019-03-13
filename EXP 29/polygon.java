import java.applet.*;
import java.awt.*;
/*<Applet code="polygon.class" height="1000" width="1000"></Applet>*/
public class polygon extends Applet{
	int[] x = {150,250,250,150,50,50,150};
	int[] y = {50,150,250,350,250,150,50};
	public void paint(Graphics g){
		
		g.drawPolygon(x,y,6);
	}
}