package andreimihai.alerts.test;

import andreimihai.alerts.Alert;
import andreimihai.alerts.Category;

public class ClientConsole {

	public static void main(String[] args) {
		
		Category oneCategory = new Category("Buletin");
		Category secondCategory = new Category("Permis");
		
		System.out.println(oneCategory.getName());
		System.out.println(secondCategory.getName());
		
		Alert firstAlert = new Alert("Ceva", oneCategory, "Mihai", "14-09-2015");
		Alert secondAlert = new Alert("Titlu?", oneCategory, "Dan", "16-09-2015");
		
		System.out.println(firstAlert);
		System.out.println(secondAlert);

	}

}
