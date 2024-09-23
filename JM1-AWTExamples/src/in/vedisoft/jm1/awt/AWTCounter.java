package in.vedisoft.jm1.awt;

import java.awt.*;

public class AWTCounter extends Frame {
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;

	public AWTCounter() {
		setLayout(new FlowLayout());

		lblCount = new Label("Counter");
		add(lblCount);

		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);

		btnCount = new Button("Count");
		add(btnCount);

		setTitle("AWT Counter");
		setSize(250, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		AWTCounter app = new AWTCounter();
	}

}
