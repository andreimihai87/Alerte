/**
 * 
 */
package andreimihai.alerts.gui.alertstable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import andreimihai.alerts.Alert;

/**
 *
 */
@SuppressWarnings("serial")
public class AlertsTableModel extends AbstractTableModel {

	private String[] columnNames = new String[] {
		"Title", "Info", "Category", "Date"
	};
	
	private List<Alert> data = new ArrayList<Alert>();
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		Alert alert = data.get(row);
		
		switch (col) {
		case 0: return alert.getTitle();
		case 1: return alert.getOtherInfo();
		case 2: return alert.getCategory().getName();
		case 3: return alert.getDate();
		default:
			break;
		}
		
		return "N/A";
	}
	
	public void addAlert(Alert alert) {
		data.add(alert);
		fireTableDataChanged();
	}
	
	public void setAlertsAll(List<Alert> alerts) {
		data.clear();
		data.addAll(alerts);
		fireTableDataChanged();
	}

}
