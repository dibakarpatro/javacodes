import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Last extends Frame implements WindowListener,ItemListener {

	   private Checkbox cb1,cb2;
		public Last()
		   {
			   this.setTitle("Demo App-4");
			   this.setBackground(Color.yellow);
			   this.addWindowListener(this);
			   this.setLayout(null);
			   
			   //check box
			   cb1=new Checkbox("Red");
			   cb1.setBounds(100,100,60,20);
			   this.add(cb1);
			   cb1.addItemListener(this);
			   
			   cb2=new Checkbox("Blue");
			   cb2.setBounds(200,100,60,20);
			   this.add(cb2);
			   cb2.addItemListener(this);

	}
		public static void main(String[] args) {
			 Last t=new Last();
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
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(cb1.getState())
					this.setBackground(Color.red);
				else if(cb2.getState())
					this.setBackground(Color.blue);
			}
				// TODO Auto-generated method stub
		
				
			
		}

