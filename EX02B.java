package FirstApplet;

// ex02b.java :

import java.applet.*;
import java.awt.*;
import EX02BFrame;

public class EX02B extends Applet implements Runnable {
	
	Thread m_EX02B = null;
	
	private Graphics m_Graphics;
	private Image  m_Images[];
	private int m_nCurrImage;
	private int m_nImgWidth = 0;
	private int m_nImgHeight = 0;
	private boolean m_fAllLoaded = false;
	private final int NUM_IMAGES = 18;
	
	boolean m_fStandAlone = false;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX02BFrame frame = new EX02BFrame("EX02B");
		
		frame.show();
		frame.hide();
		frame.resize(frame.insets().left+frame.insets().right+320,
					frame.insets().top+frame.insets().bottom+240);
		
		EX02B applet_EX02B = new EX02B();
		
		frame.add("Center",applet_EX02B);
		applet_EX02B.m_fStandAlone = true;
		applet_EX02B.init();
		applet_EX02B.start();
		frame.show();
		

	}
	public EX02B() {
		
	}
	
	public String getAppletInfo() {
		return "Name: EX02B\r\n"+ 
				"Author: Mike Cohn\r\n"+
				"Created with Microsoft Visual";
	}
	public void init() {
		resize(320,240);
	}
	public void destroy() {
		
	}
	private void displayImage(Graphics g) {
		if(m_fAllLoaded) {
			Rectangle r = g.getClipRect();
			g.clearRect(r.x, r.y, r.width, r.height);
			displayImage(g);
		}
		else {
			g.drawString("Loading images ...", 10, 20);
		}
	}
	public void start() {
		if(m_EX02B == null) {
			m_EX02B = new Thread(this);
			m_EX02B.start();
		}
	}
	
	public void stop() {
		if(m_EX02B !=null) {
			m_EX02B.stop();
			m_EX02B = null;
		}
	}
	public void run() {
		
		m_nCurrImage = 0;
		
		if(!m_fAllLoaded) {
			repaint();
			m_Graphics = getGraphics();
			m_Images = new Image[NUM_IMAGES];
			
			MediaTracker tracker = new MediaTracker(this);
			String strImage;
			
			for(int i =1;i<=NUM_IMAGES;i++) {
				 strImage = "images/img00"+ ((i<0) ? "0":"") +i + ".gif";
				 if(m_fStandAlone)
					 m_Images[i-1] = 
					 Toolkit.getDefaultToolkit().getImage(strImage);
				 else
					 m_Images[i-1] = getImage(getDocumentBase(),strImage);
				 tracker.addImage(m_Images[i-1],0 );
			}
		
		try {
			tracker.waitForAll();
			m_fAllLoaded = !tracker.isErrorAny();
		}
		catch(InterruptedException e) {
			
		}
		if(!m_fAllLoaded) {
			stop();
			m_Graphics.drawString("Error loading Images!", 10, 40);
			return;
		}
		m_nImgWidth = m_Images[0].getWidth(this);
		m_nImgHeight = m_Images[0].getHeight(this);
		repaint();
		
		while(true) {
			try {
				displayImage(m_Graphics);
				m_nCurrImage++;
				if(m_nCurrImage == NUM_IMAGES)
					m_nCurrImage = 0;
				Thread.sleep(50);
			}
			catch(InterruptedException e) {
				stop();
			}
		}}
	}
}
