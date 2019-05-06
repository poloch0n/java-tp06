package fr.element;
import java.util.Scanner;

public class FromMenu {
	
	static Scanner scanner;
	public FromMenu() {
		scanner = new Scanner(System.in);
	}
	
	public static String getListTypeForm() {
		//todo
		// v0 : une seule ligne, clean de tout espace, type séparé par des virgules, echapper les caractères ? 
		// v1 : ajouter une ligne puis proposer confirmation puis proposer d'ajouter ou non un nouveau champs
		showText("Veuillez saisir votre type sous le format \"nomType,param1,param2..\" sans espace");
		return getStringFromMenu();
	}
	
	public static int getIntFromMenu() {
		String input = scanner.next();
        int number = 0;
        try {
            number = Integer.parseInt(input);
            return number;
        } catch (Exception e) {
            return 0;
        }   
	}
	
	public static String getStringFromMenu() {
		try {
			//todo : attention injection ?
			return (String) scanner.next();
		} catch(Exception e)  {
			// Gestion des cas où l'utilisateur ne rentre pas un text au bon format
			return "";
		}
	}

	private static void showText(String texte) {
		System.out.println(texte);
	}
}
