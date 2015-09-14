/**
 * 
 */
package andreimihai.alerts.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 */
public class WindowAbout extends JPanel {
	
	private JLabel about = new JLabel("Alerts 1.0");
	private JButton ok = new JButton("Ok");
	
	public WindowAbout() {
		
		setBackground(Color.RED);
		setLayout(new FlowLayout());
		
		add(about);
		add(ok);
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				about.setText("Oook...");
			}
		});
		
	}
	
}
