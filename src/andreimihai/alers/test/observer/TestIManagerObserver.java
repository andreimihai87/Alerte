package andreimihai.alers.test.observer;

import java.util.ArrayList;

import andreimihai.alerts.Alert;
import andreimihai.alerts.IManagerObserver;
import andreimihai.alerts.Manager;

public class TestIManagerObserver implements IManagerObserver{
	
	ArrayList<Alert> someAlertList;
	
	public void alertsUpdate() {
	
		someAlertList = Manager.INSTANCE.getAlertsAll();
		
		for(Alert someAlert:someAlertList){
			System.out.println(someAlert);
		}
		
	}

}
