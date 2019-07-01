import java.awt.*;
/*
 * Stand-Alone application support
 * this frame class acts as a top-level in which the applet applet appears
 * when its run as a stand alone application
 */
class EX02AFrame extends Frame {
	//EX02A constructor
	//-------------- 
	public EX02AFrame(String str) {
		//TODO: Add additional constructor code here
		super(str);
	}
	/*
	 * The handleEvent() method receives all events generated within the frame window.
	 * You can use this method to respond to window events.
	 * To respond to events geneated by menus, buttons, etc. or other 
	 * controls in the frame window but not managed by the applet, override
	 * the windows action() method.
	 */
	public boolean handleEvent(Event evt) {
		switch(evt.id) {
			/*
			 * Application shutdown
			 * ----------
			 */
		case Event.WINDOW_DESTROY:
			//TODO: Additional clean up code here
			dispose();
			System.exit(0);
			return true;
		default:
			return super.handleEvent(evt);
		}
	}
}
