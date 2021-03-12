import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame{
		Frame1(){
		setSize(2000,2050);
		setVisible(true);
		setLayout(null);
		
		Button b=new Button("Click");
		b.setBounds(500,500,80,40);
		b.setSize(80,40);
		add(b);
		Label l=new Label("Hello");
		Label l1=new Label("Hii");
		l1.setBounds(100,160,500,500);
		l.setBounds(100,100,200,100);
		add(l);
		add(l1);
		 addWindowListener(new WindowAdapter() {
	           
	            public void windowClosing(WindowEvent ex)
	            {
	                System.exit(0);
	            }

	       
	            });
}
}
public class Frame_ {
	public static void main(String[] args) {
	Frame1 obj=new Frame1();
	}
	
}
