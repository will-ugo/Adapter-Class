import javax.swing.JFrame;

public class adapterMain {
	public static void main (String args []) {
		adapter event = new adapter();
		event.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		event.setSize(500, 300);
		event.setVisible(true);
	}
}
