package in.vedisoft.jm1.swing;

import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFormattedFieldDemo extends JPanel {

	JFormattedTextField ftf[];

	public JFormattedFieldDemo() {
		ftf = new JFormattedTextField[7];
		String des[] = new String[ftf.length];

		des[0] = "Date";
		ftf[0] = new JFormattedTextField(new java.util.Date());

		des[1] = "Integer";
		ftf[1] = new JFormattedTextField(90032221);

		des[2] = "Float";
		ftf[2] = new JFormattedTextField(3.14);

		des[3] = "Float work-around";
		ftf[3] = new JFormattedTextField(java.text.NumberFormat.getInstance());
		ftf[3].setValue(3.14);

		des[4] = "currency";
		ftf[4] = new JFormattedTextField(java.text.NumberFormat.getCurrencyInstance());
		ftf[4].setValue(5.99);

		des[5] = "percent";
		ftf[5] = new JFormattedTextField(java.text.NumberFormat.getPercentInstance());
		ftf[5].setValue(0.33);

		des[6] = "java.net.URL";
		java.net.URL u = null;
		try {
			u = new java.net.URL("http://www.vedisoft.in/");
		} catch (java.net.MalformedURLException ignored) {
		}
		ftf[6] = new JFormattedTextField(u);
		ftf[6].setColumns(24);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		for (int j = 0; j < ftf.length; j += 1) {
			JPanel borderPanel = new JPanel(new java.awt.BorderLayout());
			borderPanel.setBorder(new javax.swing.border.TitledBorder(des[j]));
			borderPanel.add(ftf[j], java.awt.BorderLayout.CENTER);
			add(borderPanel);
		}
	}

	public static void main(String argv[]) {
		JFrame f = new JFrame("JFormattedFieldDemo Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new JFormattedFieldDemo());
		f.pack();
		f.setVisible(true);
	}
}







