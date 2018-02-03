import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adapter extends JFrame {
	private JPanel panel;
	private JLabel messageBar;
	
	public adapter() {
		super("Adapter Class Demo");
		
		messageBar = new JLabel("Default");
		add(messageBar, BorderLayout.SOUTH);
		
		panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		add(panel, BorderLayout.CENTER);
		panel.addMouseListener(new handlerClass());
	}
	private class handlerClass extends MouseAdapter {
		public void mouseEntered (MouseEvent event) {
			panel.setBackground(Color.BLUE);
		}
		
		public void mouseClicked (MouseEvent event) {
			messageBar.setText(String.format("You clicked %d times", event.getClickCount()));
			if (event.isMetaDown())
				messageBar.setText(String.format("You clicked %d times " + "with right mouse button", event.getClickCount()));
			else if (event.isAltDown())
				messageBar.setText(String.format("You clicked %d times " + "with center mouse button", event.getClickCount()));
			else
				messageBar.setText(String.format("You clicked %d times " + "with left mouse button", event.getClickCount()));
		}
	}
}
