package fr.element;

public class AjouterListType extends MenuService{

	void executeUc(ElementDao ed) {
		showText("Ajout d'un nouveau type");
		//todo
			// v0 : une seule ligne, clean de tout espace, type s�par� par des virgules, echapper les caract�res ? 
			// v1 : ajouter une ligne puis proposer confirmation puis proposer d'ajouter ou non un nouveau champs
		String listType = FromMenu.getListTypeForm();
			// suppos� "nomType,param1,param2,param3 "
		// formater le retour
			// "{nomType,param1,param2,param3}";
		// v�rifier unicit� du nom
		if(!message.equals("")) {
			showText(message);
			executeUc(dao);
			return;
		}
		ed.saveNewListType(listType);
	}
}
