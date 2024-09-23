package in.vedisoft.jm1.awt;

import java.awt.*;
import java.awt.event.*;

public class TestExample {

	Button btn;

	public TestExample() {
		btn = new Button("Click Me");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
