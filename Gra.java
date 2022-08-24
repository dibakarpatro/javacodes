import java.awt.*;
import java.awt.event.*;
public class Gra extends Frame implements WindowListener,ActionListener
{
	private Button bb;
	private Button bb1;
	private Button bb2;
	private Button bb3;
	public Gra() {
		this.setTitle("Demo App-1");
		this.setBackground(Color.pink);
		this.addWindowListener(this);
		this.setLayout(null);
		bb=new Button("Blue");
		bb.setBounds(100, 100, 100, 30);
		this.add(bb);
		bb.addActionListener(this);
		bb1=new Button("Green");
		bb1.setBounds(100, 100, 100, 30);
		this.add(bb1);
		bb1.addActionListener(this);
		bb2=new Button("White");
		bb2.setBounds(200, 100, 100, 30);
		this.add(bb2);
		bb2.addActionListener(this);
		bb3=new Button("Black");
		bb3.setBounds(300, 100, 100, 30);
		this.add(bb3);
		bb3.addActionListener(this);
	}
		
	public static void main(String[] args) {
		Gra t=new Gra();
		t.setSize(500,500);
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

	 
	 public void windowActivated(WindowEvent e) {
	    	
	    }

	  
	 public void windowDeactivated(WindowEvent e) {
	    	
	    }
	 public void actionPerformed(ActionEvent e) {
		 Button x=(Button)e.getSource();
		 if(x==bb)
			 this.setBackground(Color.blue);
		 else if(x==bb1)
			 this.setBackground(Color.green);
		 else if(x==bb2)
		     this.setBackground(Color.white);
		 else if(x==bb3)
			 this.setBackground(Color.black);
	 }


		// TODO Auto-generated method stub
		
	}
