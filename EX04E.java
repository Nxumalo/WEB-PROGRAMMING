package FirstApplet;
import java.applet.*;
import java.awt.*;

public class EX04E extends Applet{
	
	int yRow = 1;
	
	public void init() {
		resize(320,240);
	}
	
	public void paint(Graphics g) {
		
	}
	
	public boolean keyDown(Event event , int key) {
		
		boolean result = false;
		
		Graphics g = getGraphics();
		
		switch(key) {
		case Event.UP:
			g.drawString("the up key" , 10, yRow++*10);
			result = true;
			break;
		case Event.DOWN:
			g.drawString("the down key",10, yRow++*10);
			result = true;
			break;
		case Event.LEFT:
			StringBuffer str = new StringBuffer("you pressed: ");
			if(event.controlDown())
				str.append("control +");
			if(event.shiftDown())
				str.append("shift + ");
			str.append("left");
			g.drawString(str.toString(),10,yRow++*10);
			result = true;
			break;
		default:
			if((key >= 65 && key <= 90) || (key >= 97 && key <= 122)) {
				Character ch = new Character((char) key);
				g.drawString(ch.toString(), 10, yRow++*10);
				result = true;
			}
			break;
		}
		return result;
	}
}
