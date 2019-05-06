package fr.element;

public class AjouterElementService extends MenuService {

	void executeUc(ElementDao ed) {
		showText("Ajout d'un nouveau element");
		String[] typeLists;
		// check empty typelist
		if(ed.checkListTypeEmpty()) {
			showText("Vous devez d'abord cr�er au moins un type d'�l�ment");
			return;
		}
		
		showText("De quel type va �tre votre �l�ment ? ");
		typeLists = ed.getTypeList();
		for(int i=0;i<typeLists.length;i++) {
			showText(i + ". "+ed.getNameTypeFromString(typeLists[i]));
		}
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
