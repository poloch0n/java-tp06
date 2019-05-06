package fr.element;

public class AjouterListTypeService extends MenuService{

	void executeUc(ElementDao ed) {
		showText("Ajout d'un nouveau type");
		//todo
			// v0 : une seule ligne, clean de tout espace, type séparé par des virgules, echapper les caractères ? 
			// v1 : ajouter une ligne puis proposer confirmation puis proposer d'ajouter ou non un nouveau champs
		String listType = FromMenu.getListTypeForm();
			// supposé "nomType,param1,param2,param3 "
		// formater le retour
			// "{nomType,param1,param2,param3}";
		// vérifier unicité du nom

		String message = ed.checkListType(listType);
		if(!message.equals("")) {
			showText(message);
			executeUc(ed);
			return;
		}
		showText(listType);
		ed.saveNewListTypeElement(listType);
	}
}
