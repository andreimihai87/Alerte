/**
 * 
 */
package andreimihai.alerts.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 */
public class MainWindow extends JFrame {
	
	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension dimension = new Dimension(600, 400);
		
		setPreferredSize(dimension);
		setMaximumSize(dimension);
		setMinimumSize(dimension);

		setLayout(new BorderLayout());
		loadSomething();
		
		pack();
	}
	
	private void loadSomething() {
		add(new WindowAbout(), BorderLayout.CENTER);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainWindow().setVisible(true);
			}
		});

	}

}
