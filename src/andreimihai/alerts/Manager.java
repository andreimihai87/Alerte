package andreimihai.alerts;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Category> categoryList = new ArrayList<Category>();
	private ArrayList<Alert> alertList = new ArrayList<Alert>();
	
	public void addCategory(Category cat){
		if(!categoryList.contains(cat)){
			categoryList.add(cat);
		}
	}
	
	public void addAlert(Alert alert){
		alertList.add(alert);
	}
	
	public void viewCategories(){
		for(int i=0; i<categoryList.size(); i++){
			System.out.println(categoryList.get(i).getName());
		}
	}
	public void viewAlerts() {
		
	}

	
	
}
