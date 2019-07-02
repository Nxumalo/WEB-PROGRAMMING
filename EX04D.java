package FirstApplet;
import java.applet.*;
import java.awt.*;

public class EX04D extends Applet {
	
	private int xPosStart = 0,xPosEnd = 0;
	private int yPosStart = 0,yPosEnd = 0;
	private boolean drawing = false;
	
	public EX04D() {
		
	}
	
	public void init() {
		resize(320,240);
	}
	
	public void pain(Graphics g) {
		
		if(drawing) {
			g.drawLine(xPosStart, yPosStart, xPosEnd, yPosEnd);
		}
	}
	
	public boolean mouseDown(Event evt, int x,int y) {
		drawing = true;
		xPosStart = x;
		yPosStart = y;
		xPosEnd = xPosStart;
		yPosEnd = yPosStart;
		return true;
	}
	
	public boolean mouseUp(Event evt, int x,int y) {
		drawing = false;
		repaint();
		return true;
	}
	
	public boolean mouseDrag(Event evt, int x, int y) {
		xPosEnd = x;
		yPosEnd = y;
		repaint();
		return true;
	}
	
}
