import java.awt.*;
import java.awt.event.*;
public class Graphics3 extends Frame implements WindowListener,ActionListener
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Image img;
private Image img1;
   private MediaTracker mt;
   private MediaTracker mt1;
   
   public Graphics3()
   {
	   this.setTitle("Demo App-3");
	   this.setBackground(Color.yellow);
	   this.addWindowListener(this);
	   this.setLayout(null);
	   img=Toolkit.getDefaultToolkit().getImage("C:\\Users\\dibakar\\Desktop\\kitten.png");
	   mt=new MediaTracker(this);
	   mt.addImage(img,0);
	   img1=Toolkit.getDefaultToolkit().getImage("C:\\Users\\dibakar\\Pictures\\IMG_20191224_153845.jpg");
	   mt1=new MediaTracker(this);
	   mt1.addImage(img1,1);
	   try
	   {
		   mt.waitForID(0);
		   mt1.waitForID(1);
	   }catch(Exception r) {}
   }
   public void paint(Graphics g)
   {
       g.drawImage(img,100,100,300,300,null);
       g.drawImage(img1,500,100,300,300,null);
   }
   public static void main(String[] args) {
	   Graphics3 t=new Graphics3();
	   t.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	   t.setVisible(true);
   }
   public void windowOpened(WindowEvent e) {
		
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void windowClosed(WindowEvent e) {
		
	}

	public void windowIconified(WindowEvent e) {
	    	
	    }

	
	 public void windowDeiconified(WindowEvent e) {
	    	
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
