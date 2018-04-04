import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		GUI g = new GUI();

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(g);

	}

}
