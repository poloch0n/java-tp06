package fr.element;

public class AjouterElementService extends MenuService {

	void executeUc(ElementDao ed) {
		showText("Ajout d'un nouveau element");
		
		// check empty typelist
		
		// ask for wich type
		
		// get type
		
		// :loop from here
		
		// create array from type (param)
		
		// create form
		
		// check data
		
		// :loop from here
		
		
		
		
		
		
		//todo
			// v0 : une seule ligne, clean de tout espace, type s�par� par des virgules, echapper les caract�res ? 
			// v1 : ajouter une ligne puis proposer confirmation puis proposer d'ajouter ou non un nouveau champs
		String listType = FromMenu.getListTypeForm();
			// suppos� "nomType,param1,param2,param3 "
		// formater le retour
			// "{nomType,param1,param2,param3}";
		// v�rifier unicit� du nom

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
