package andreimihai.alerts.test;

import andreimihai.alerts.*;

public class ClientConsole {

	public static void main(String[] args) {
		
		Manager allStuff = new Manager();
		
		Category oneCategory = new Category("Buletin");
		
		allStuff.addCategory(oneCategory);
		
		Category secondCategory = new Category("Permis");
		
		allStuff.addCategory(secondCategory);
		//allStuff.addCategory(secondCategory);
		//am testat sa vad daca se mai adauga inca una
		
		System.out.println(oneCategory.getName());
		System.out.println(secondCategory.getName());
		
		Alert firstAlert = new Alert("Ceva", oneCategory, "Mihai", "14-09-2015");
		Alert secondAlert = new Alert("Titlu?", oneCategory, "Dan", "16-09-2015");
		
		System.out.println(firstAlert);
		System.out.println(secondAlert);
		
		allStuff.viewCategories();

	}

}
