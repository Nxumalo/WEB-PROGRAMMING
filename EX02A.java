//*******************************
//EX02A.java: Applet
//
//*******************************

import java.applet.*;
import java.awt.*;
import EX02AFRAME.*;


//===============================
// Main Class for applet EX02A
//
//===============================

public class EX02A extends Applet{
	//Standalone application support:
	// m_fstandalone will be set to true if applet is run
	//standlone
	
	boolean m_fStandAlone = false;
	
	// StandAlone Application Support
	// The main() method acts as the applet's entry point when it 
	// is run as a stand alone application
	//it is ignore if the 
	//applet is run from with an html page.
	//---------------------------
	
	public static void main(String args[]) {
		// create toplevel window to contain applet exo2a
		//-----------------------
		EX02AFrame frame = new EX02AFrame("EX02A");
		
		// must show frame before we sit it so insets() will
		// return valid values
		//-----------------------------------
		
		frame.show();
		frame.hide();
		frame.resize(frame.insets().left+frame.insets().right +320,
						frame.insets().top+frame.insets().bottom +240);
		
		// the following code starts the applet running with the frame window.
		// it aslo calls GetParamenters() to retrieve
		// parameter values from teh command line, and sets 
		//m_fStandAlone to true tp prevent init() from trying to get
		// get them from the Html page
		//------------------------------------
		
		EX02A applet_EX02A = new EX02A();
		
		frame.add("Center",applet_EX02A);
		applet_EX02A.m_fStandAlone = true;
		applet_EX02A.init();
		applet_EX02A.show();
		}
	
	// EX02A CLass Constructor
	//--------------------
	
		public EX02A() {
			//TODO: ///
			
		}
	
		public String getApplicationInfo() {
			return "Name:EX02A\r\n"+
					"Author:Fraizer Jabulani Nxumalo The Matrix has found you.\r\n"+
					"Created With Eclipse";
		}
	
	/* The initit () method is called the AWT when an applet is firsted loaded or reloaded.
	 * Override this method to perform whatever initialization your applet needs, such as 
	 * initializing data structures, loading images or fonts,
	 * creating frame windows, setting the layout manager or 
	 * adding IU components.
	 */
	
	public void init() {
		/*
		 * If you eant to use a rosource wizard - generated control creator class to arrange
		 * controls in your applet, you may want to call its createcontrols () method from with this method.
		 * remove the following call to resize() before adding the call to createControls () ; CreateControls ()
		 * does its own resizing.
		 */
		resize(320,240);
		
		//TODO: Place addtional initialization code here
		
	}
	
	/*
	 * Place additional applet clean up code here. destroy() is called when your applet is
	 * termininating and being unloaded.
	 */
	
	public void destroy() {
		//TODO: place applet cleanup code here
	}
	
	//EX02A Paint Handler
	//----------------------
	public void paint (Graphics g) {
		g.drawString("Fraser Hello World", 10,10);
	}
	
	/*
	 * To start method() is called when the page containing the applet
	 * first appears on the screen. The appletWizards intial implementation
	 * pf this method starts execution of the applet thread.
	 */
	public void start() {
		//TODO: Place additonal applet start code here
	}
	/*
	 * The stop () is called whe the page containing the appplet is no longer on the 
	 * screen. The AppletWizards inintial implementation of this method stops execution of
	 * the applets thread.
	 * ----------------------------
	 */
	public void stop() {
		
	}
	
	
	
	
	
	
}

