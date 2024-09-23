package in.vedisoft.jm1.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JScrollBarExample extends JPanel implements AdjustmentListener {
	JScrollBar scbRed, scbGreen, scbBlue;
	JLabel lblRed, lblGreen, lblBlue;

	public JScrollBarExample() {
		setLayout(new GridLayout(6, 1, 0, 10));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		setBackground(Color.WHITE);
		scbRed = new JScrollBar(JScrollBar.HORIZONTAL, 255, 0, 0, 255);
		scbGreen = new JScrollBar(JScrollBar.HORIZONTAL, 255, 0, 0, 255);
		scbBlue = new JScrollBar(JScrollBar.HORIZONTAL, 255, 0, 0, 255);
		lblRed = new JLabel();
		lblGreen = new JLabel();
		lblBlue = new JLabel();
		lblRed.setHorizontalAlignment(JLabel.CENTER);
		lblGreen.setHorizontalAlignment(JLabel.CENTER);
		lblBlue.setHorizontalAlignment(JLabel.CENTER);
		updateLabels();
		scbRed.addAdjustmentListener(this);
		scbGreen.addAdjustmentListener(this);
		scbBlue.addAdjustmentListener(this);
		add(scbRed);
		add(lblRed);
		add(scbGreen);
		add(lblGreen);
		add(scbBlue);
		add(lblBlue);
	}

	private void updateLabels() {
		lblRed.setText("Red : " + scbRed.getValue());
		lblGreen.setText("Green : " + scbGreen.getValue());
		lblBlue.setText("Blue : " + scbBlue.getValue());
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int red = scbRed.getValue();
		int green = scbGreen.getValue();
		int blue = scbBlue.getValue();
		setBackground(new Color(red, green, blue));
		updateLabels();
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("JScollBar Demo Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new JScrollBarExample());
		frame.setSize(400, 250);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
