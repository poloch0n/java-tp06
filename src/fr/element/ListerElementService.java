package fr.element;

public class ListerElementService extends MenuService{

	void executeUc(ElementDao ed) {
		if(ed.checkListEmpty()) {
			showText("Vous n'avez pas d'élément sauvegardé");
			return;
		}
		showText("Liste des elements");
		
		for(String ligne: ed.getList()) {
			// todo : 
				// v0 déparser
				// v1 Afficher une phrase en fonction du type
			String text = ligne;
			showText(text);
		}
	}

}
