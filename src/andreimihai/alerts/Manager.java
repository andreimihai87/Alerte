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
		
		for(int i=0; i<observerList.size(); i++){
			observerList.get(i).alertsUpdate();
		}
		
		for (IManagerObserver observer : observerList) {
//			observer.alertsUpdate();
		}
		
	}
	
	public void viewCategories(){
		for(int i=0; i<categoryList.size(); i++){
			System.out.println(categoryList.get(i).getName());
		}
	}
	public void viewAlerts() {
		
	}

	
	
}
