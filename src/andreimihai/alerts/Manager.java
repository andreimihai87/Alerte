package andreimihai.alerts;

import java.util.ArrayList;

public enum Manager {

	INSTANCE;
	
	private ArrayList<Category> categoryList = new ArrayList<Category>();
	private ArrayList<Alert> alertList = new ArrayList<Alert>();
	
	private ArrayList<IManagerObserver> observerList = new ArrayList<IManagerObserver>();
	
	public void addIManagerObserver(IManagerObserver observer){
		observerList.add(observer);
	}
	
	public void addCategory(Category cat){
		if(!categoryList.contains(cat)){
			categoryList.add(cat);
		}
	}
	
	public void addAlert(Alert alert){
		alertList.add(alert);

		for (IManagerObserver observer : observerList) {
			observer.alertsUpdate();
		}
	}
	
	public ArrayList<Alert> getAlertsAll(){
		return alertList;
	}
	
	public ArrayList<Category> getCategorysAll(){
		return categoryList;
	}

}
