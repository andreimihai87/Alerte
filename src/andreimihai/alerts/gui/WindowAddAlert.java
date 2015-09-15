package andreimihai.alerts.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowAddAlert extends JPanel {
	
	JLabel messages;
	JButton addAlert;
	
	public WindowAddAlert() {
		
		setBackground(Color.GREEN);
		setLayout(null);
		
		
		messages = new JLabel("");
		messages.setBounds(10, 120, 120, 20);
		add(messages);
		
		//category label + text box
		JLabel cat = new JLabel("Categorie");
		cat.setBounds(10, 10, 100, 20);
		add(cat);
				
		JTextField catText = new JTextField();
		catText.setBounds(10, 40, 80, 20);
		add(catText);
		
		//another info label + text box
		JLabel anotherInfo = new JLabel("Alte info");
		anotherInfo.setBounds(130, 10, 100, 20);
		add(anotherInfo);
				
		JTextField anotherInfoText = new JTextField();
		anotherInfoText.setBounds(130, 40, 120, 20);
		add(anotherInfoText);
		
		//date label + date box
		JLabel date = new JLabel("Data");
		date.setBounds(280, 10, 100, 20);
		add(date);
				
		JTextField dateText = new JTextField();
		dateText.setBounds(280, 40, 100, 20);
		add(dateText);
		
		
		addAlert = new JButton("Adauga Alerta");
		addAlert.setBounds(10, 80, 120, 20);
		add(addAlert);
		
		addAlert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				messages.setText("Alerta Adaugata");
			}
		});
		
	}
	
}
