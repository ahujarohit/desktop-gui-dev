package in.vedisoft.jm1.awt;

import java.awt.*;

public class AWTAccumulator extends Frame {
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;

	public AWTAccumulator() {
		setLayout(new FlowLayout());

		lblInput = new Label("Enter an Integer: ");
		add(lblInput);

		tfInput = new TextField(10);
		add(tfInput);

		lblOutput = new Label("The Accumulated Sum is: ");
		add(lblOutput);

		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);

		setTitle("AWT Accumulator");
		setSize(350, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AWTAccumulator();
	}

}
