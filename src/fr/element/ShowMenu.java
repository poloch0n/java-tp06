package fr.element;

public class ShowMenu {

	public ShowMenu() {
		
	}

	public static void showIntroduction() {
		showText("***** Administration v3 *****");
	}
	
	public static void showMenuOptions() {
		// todo update
		showText("***** Menu *****\r\n1. Lister les elements \r\n2. Lister les types d'�l�ments \r\n3. Ajouter un �l�ment \r\n4. Ajouter un type d'�l�ment \r\n5. Modifier un �l�ment \r\n6. Modifier un type d'�l�ment\r\n7. Supprimer un �l�ment \r\n8. Supprimer un type d'�l�ment \r\n99. Sortir");
	}	
	
	public static void showText(String texte) {
		System.out.println(texte);
	}
}
