package andreimihai.alerts;

import java.util.Date;

public class Alert {

	private String title;
	private String otherInfo;
	private String dataAsString;
	private Date data = new Date();
	
	private Category cat;
	

	public Alert(String title, Category cat, String otherInfo, Date date) {
		
		this.title = title;
		this.cat = cat;
		this.otherInfo = otherInfo;
//		this.dataAsString = dataAsString;
		
		this.data = date;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getOtherInfo(){
		return otherInfo;
	}
	
//	public String getData(){
//		return dataAsString;
//	}
	
	public Date getDate() {
		return data;
	}
	
	public Category getCategory(){
		return cat;
	}
	
	public String toString(){
		
		String oneAlert;
		oneAlert = title + "\t" + cat.getName() + "\t" + otherInfo + "\t" + dataAsString;
		
		//nu mai stiu care e faza cu title, la ce am nevoie de el?
		
		return oneAlert;
	}
	
	
}
