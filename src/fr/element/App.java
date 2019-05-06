package fr.element;

import fr.element.FromMenu;

public class App {


	private static MenuServiceFactory msf;
	private static FromMenu fm;
	private static ElementDao ed;
	public static void main(String[] args) {

		ed = new ElementDao();
		fm = new FromMenu();
		msf = new MenuServiceFactory();
		
		ShowMenu.showIntroduction();
		while(true) {
			ShowMenu.showMenuOptions();
			int answer = FromMenu.getIntFromMenu();
			msf.run(answer).executeUc(ed);
		}
	}

}
