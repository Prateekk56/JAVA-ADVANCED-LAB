import java.awt.*;
import java.awt.event.*;
class CheckBox extends Frame{
	CheckBox (){
		setTitle("Checkbox");
		setVisible(true);
		setLayout(null);
		setSize(1200,1200);
		final Label label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,400);
		label.setVisible(true);
		CheckboxGroup grp=new CheckboxGroup();
		Checkbox c=new Checkbox("C++",grp,true);
		c.setBounds(500,100,50,50);
		Checkbox c1=new Checkbox("Java",grp,false);
		c1.setBounds(500,150,50,50);
		add(c);
		add(c1);
		add(label);
		c.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {               
                label.setText("C++ Checkbox: Checked");  
             }  
		});
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e1) {
				label.setText("Java Checkbox: Checked");
			}
		});
		
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
