package FirstApplet;
import java.applet.*;
import java.awt.*;

public class EX04A extends Applet {
	
	private String history = "";
	
	public EX04A() {
		
	}
	
	public void init() {
		history = history +"init";
		resize(320,240);
	}
	
	public void start() {
		history = history + "(start ";
	}
	
	public void stop() {
		history = history +"stop) ";
	}
	
	public void destroy() {
		history = history +" destroy )";
	}
	
	public void paint (Graphics g) {
		g.drawString(history, 10, 10);
	}

}
