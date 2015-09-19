package andreimihai.alerts.gui.alertstable;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import andreimihai.alerts.IManagerObserver;
import andreimihai.alerts.Manager;

public class WindowViewAlerts extends JPanel {
	
	private JScrollPane container;
	private JTable alertsTable;
	
	private AlertsTableModel model;
	
	public WindowViewAlerts() {
		
		setLayout(new BorderLayout());
		
		model = new AlertsTableModel();
		alertsTable = new JTable(model);
		
		container = new JScrollPane(alertsTable);
		
		add(container, BorderLayout.CENTER);
		
		
		// Controller
		Manager.INSTANCE.addIManagerObserver(new IManagerObserver() {
			@Override
			public void alertsUpdate() {
//				List<Alert> alerts = Manager.INSTANCE.getAlertsAll();
				
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
//						model.setAlertsAll(alerts);
					}
				});
			}
		});
	}
	
}
