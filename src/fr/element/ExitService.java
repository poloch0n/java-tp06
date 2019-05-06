package fr.element;
import fr.element.ElementDao;

public class ExitService extends MenuService{

	public ExitService() {
		// TODO Auto-generated constructor stub
	}
	
	void executeUc(ElementDao ed) {
		showText("Aurevoir☹ ");
		System.exit(0);
	}
}
