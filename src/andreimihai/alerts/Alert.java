package andreimihai.alerts;

import java.util.Date;

public class Alert {

	private String title;
	private String otherInfo;
	private String dataAsString;
	private Date data = new Date();
	
	private Category cat;
	

	public Alert(String title, Category cat, String otherInfo, String dataAsString){
		
		this.title = title;
		this.cat = cat;
		this.otherInfo = otherInfo;
		this.dataAsString = dataAsString;
		
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getOtherInfo(){
		return otherInfo;
	}
	
	public String getData(){
		return dataAsString;
	}
	
	public String getCategory(){
		return cat.getName();
	}
	
	public String toString(){
		
		String oneAlert;
		oneAlert = "Alerta:\t" + title + "\t" + getCategory() + "\t" + otherInfo + "\t" + dataAsString;
		
		//nu mai stiu care e faza cu title, la ce am nevoie de el?
		
		return oneAlert;
	}
	
	
}
