package andreimihai.alerts;

public class Alert {

	private String title;
	private String otherInfo;
	private String data;
	
	private Category cat;
	

	public Alert(String title, Category cat, String otherInfo, String data){
		
		this.title = title;
		this.cat = cat;
		this.otherInfo = otherInfo;
		this.data = data;
		
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getOtherInfo(){
		return otherInfo;
	}
	
	public String getData(){
		return data;
	}
	
	public String getCategory(){
		return cat.getName();
	}
	
	public String toString(){
		
		String oneAlert;
		oneAlert = "Alerta:\t" + title + "\t" + getCategory() + "\t" + otherInfo + "\t" + data;
		
		//nu mai stiu care e faza cu title, la ce am nevoie de el?
		
		return oneAlert;
	}
	
	
}
