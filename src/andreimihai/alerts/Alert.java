package andreimihai.alerts;

public class Alert {

	private String title;
	private String otherInfo;
	private String data;
	private String nameCat;
	
	

	public Alert(String title, String nameCat, String otherInfo, String data){
		
		this.title = title;
		this.nameCat = nameCat;
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
		
		return nameCat;
	}
	
	public String toString(){
		
		String oneAlert;
		oneAlert = "Alerta:\t" + title + "\t" + nameCat + "\t" + otherInfo + "\t" + data;
		
		//nu mai stiu care e faza cu title, la ce am nevoie de el?
		
		return oneAlert;
	}
	
	
}
