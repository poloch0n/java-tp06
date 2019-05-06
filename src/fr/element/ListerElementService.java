package fr.element;

public class ListerElementService extends MenuService{

	void executeUc(ElementDao ed) {
		if(ed.checkListEmpty()) {
			showText("Vous n'avez pas d'élément sauvegardé");
			return;
		}
		showText("Liste des elements");
		String[] lists = ed.getList();
		for(int i =0; lists.length>i ; i++) {
			// todo : 
				// v0 déparser
				// v1 Afficher une phrase en fonction du type

			showText(i+"- "+lists[i]);
		}
	}

}
