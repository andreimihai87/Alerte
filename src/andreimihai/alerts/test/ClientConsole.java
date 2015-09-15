package andreimihai.alerts.test;

import andreimihai.alerts.*;
//import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientConsole {

	public static void main(String[] args) {
		
		Date data = new Date();
		//SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-YYYY");
		//System.out.println("Current Date: " + ft.format(data));
		
//		Manager allStuff = new Manager();
		Manager allStuff = Manager.INSTANCE;
		
		Category oneCategory = new Category("Buletin");
		Category secondCategory = new Category("Permis");
		
		allStuff.addCategory(oneCategory);
		allStuff.addCategory(secondCategory);
		//allStuff.addCategory(secondCategory);
		//am testat sa vad daca se mai adauga inca una
		
		System.out.println(oneCategory.getName());
		System.out.println(secondCategory.getName());
		
		Alert firstAlert = new Alert("Ceva", oneCategory, "Mihai", data);
		Alert secondAlert = new Alert("Titlu?", oneCategory, "Dan", data);
		
		System.out.println(firstAlert);
		System.out.println(secondAlert);
		
		allStuff.viewCategories();

	}

}
