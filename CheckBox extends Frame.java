import java.awt.*;
import java.awt.event.*;
class CheckBox extends Frame{
	CheckBox (){
		setTitle("Checkbox");
		Checkbox c=new Checkbox("Yes");
		c.setBounds(500,100,60,60);
		Checkbox c1=new Checkbox("No");
		c1.setBounds(1000,1000,60,60);
		add(c);
		add(c1);
		setVisible(true);
		setLayout(null);
		setSize(1200,1200);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent ex) {
					System.exit(0);
				}
		});
	}
	public static void main(String args[] ) {
		new CheckBox ();
	
	}
}
