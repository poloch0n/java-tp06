package fr.element;
import java.util.Scanner;

public class FromMenu {
	
	static Scanner questionUser;
	public FromMenu() {
		questionUser = new Scanner(System.in);
	}
	
	public static int getIntFromMenu() {
		String input = questionUser.next();
        int number = 0;
        try {
            number = Integer.parseInt(input);
            return number;
        } catch (Exception e) {
            return 0;
        }   
	}
}
