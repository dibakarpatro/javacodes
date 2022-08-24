import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
public class Graphics2 extends Frame implements WindowListener,ActionListener{
	
	private TextField tu;
	private TextField tu1;
	private TextArea tu2;
	private Button bb;
	
   public Graphics2() {
	this.setTitle("Demo App-2");
    this.setBackground(Color.gray);
    this.addWindowListener(this);
    this.setLayout(null);
    Label lu=new Label("User ID :");
    lu.setBounds(700,300,70,40);
    this.add(lu);
    Label lu1=new Label("Password :");
    lu1.setBounds(700,350,70,40);
    this.add(lu1);
    Label lu2=new Label("Remark :");
    lu2.setBounds(700,400,70,40);
    this.add(lu2);
    
    tu=new TextField();
    tu.setBounds(800,300,250,40);
    this.add(tu);
    tu1=new TextField();
    tu1.setBounds(800,350,250,40);
    this.add(tu1);
    tu2=new TextArea();
    tu2.setBounds(800,400,450,40);
    tu2=new TextArea(15,20);
    tu2.setBounds(800,400,450,40);
    this.add(tu2);
    bb=new Button("Login");
    bb.setBounds(800,600,100,40);
    this.add(bb);
    bb.addActionListener(this);
    
    
   }
public static void main(String[] args)
{
	Graphics2 t=new Graphics2();
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
public void actionPerformed(ActionEvent e)
{
	String u=tu.getText();
	String pa=tu1.getText();
	if(u.equals("dibbs")&&pa.equals("1234"))
		JOptionPane.showMessageDialog(this, "Login Successful");
	else
		JOptionPane.showMessageDialog(this, "Login Failed");}
}

