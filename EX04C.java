package FirstApplet;
import java.applet.*;
import java.awt.*;

public class EX04C extends Applet{
	private int xPos = 0,yPos=0;
	public EX04C() {
		
	}
	public void init() {
		resize(320,240);
	}
	public void paint(Graphics g) {
		g.drawLine(0,0,xPos,yPos);
	}
	public boolean mouseDrag(Event evt,int x,int y) {
		xPos = x;
		yPos = y;
		repaint();
		return true;
	}
}