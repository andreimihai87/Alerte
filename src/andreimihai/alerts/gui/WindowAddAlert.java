package andreimihai.alerts.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowAddAlert extends JPanel {
	
	private JLabel cat = new JLabel("Categorie");
	private JLabel messages = new JLabel("");
	private JButton addAlert = new JButton("Adauga");
	
	public WindowAddAlert() {
		
		setBackground(Color.GREEN);
		setLayout(new FlowLayout());
		
		add(messages);
		add(cat);
		add(addAlert);
		
		addAlert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				messages.setText("Alerta Adaugata");
			}
		});
		
	}
	
}
