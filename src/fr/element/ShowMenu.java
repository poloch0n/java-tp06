package fr.element;

public class ShowMenu {

	public ShowMenu() {
		
	}

	public static void showIntroduction() {
		showText("***** Administration v3 *****");
	}
	
	public static void showMenuOptions() {
		// todo update
		showText("***** Menu *****\r\n1. Lister les elements \r\n2. Lister les types d'éléments \r\n3. Ajouter un élément \r\n4. Ajouter un type d'élément \r\n5. Modifier un élément \r\n6. Modifier un type d'élément\r\n7. Supprimer un élément \r\n8. Supprimer un type d'élément \r\n99. Sortir");
	}	
	
	public static void showText(String texte) {
		System.out.println(texte);
	}
}
