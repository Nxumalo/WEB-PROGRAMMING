package FirstApplet;
import java.applet.*;
import java.awt.*;

public class EX04B extends Applet {
	
	private int xPosStart = 0, xPosEnd = 0;
	private int yPosStart = 0, yPosEnd = 0;
	private boolean drawing = false;
	
	public void init() {
		resize(320,240);
	}
	
	public void pain(Graphics g) {
		if(drawing)
		g.drawLine(xPosStart, yPosStart, xPosEnd, yPosEnd);
	}
	public boolean handleEvent(Event event) {
		boolean result;
		
		switch(event.id) {
		case Event.MOUSE_DOWN:
			drawing = true;
			xPosStart = event.x;
			yPosStart = event.y;
			xPosEnd = xPosStart;
			yPosEnd = yPosStart;
			repaint();
			result = true;
			break;
		case Event.MOUSE_UP:
			drawing = false;
			repaint();
			result = true;
			break;
		case Event.MOUSE_DRAG:
			xPosEnd = event.x;
			yPosEnd = event.y;
			repaint();
			result = true;
			break;
		default:
			result = super.handleEvent(event);
			break;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
