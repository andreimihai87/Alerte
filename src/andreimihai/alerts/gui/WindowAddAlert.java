package andreimihai.alerts.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import andreimihai.alerts.Alert;
import andreimihai.alerts.Category;
import andreimihai.alerts.Manager;

public class WindowAddAlert extends JPanel {
	
	JLabel messages;
	JButton addAlert;
	JTextField catText, anotherInfoText, dateText;
	
	Category categ;
	Alert newAlert;
	
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
				
		catText = new JTextField();
		catText.setBounds(10, 40, 80, 20);
		add(catText);
		
		//another info label + text box
		JLabel anotherInfo = new JLabel("Alte info");
		anotherInfo.setBounds(130, 10, 100, 20);
		add(anotherInfo);
				
		anotherInfoText = new JTextField();
		anotherInfoText.setBounds(130, 40, 120, 20);
		add(anotherInfoText);
		
		//date label + date box
		JLabel date = new JLabel("Data (yyyy-MM-dd)");
		date.setBounds(280, 10, 100, 20);
		add(date);
				
		dateText = new JTextField();
		dateText.setBounds(280, 40, 100, 20);
		add(dateText);
		
		
		addAlert = new JButton("Adauga Alerta");
		addAlert.setBounds(10, 80, 120, 20);
		add(addAlert);
		
		addAlert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				messages.setText("Alerta Adaugata");
								
				categ = new Category(catText.getText());
				
				Date dateAsDate = null;
				String dateAsString = dateText.getText();
				/*
				 * ceva cod care face din dAS, dAD
				 */
				
				newAlert = new Alert("title", categ, anotherInfoText.getText(), dateAsDate);
				
				Manager.INSTANCE.addAlert(newAlert);
//				manager.add ...
				// clear fields
				
				//System.out.println(newAlert);
				
			}
			
		});
		
	}
	
}
