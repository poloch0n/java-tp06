package fr.element;

public class AjouterElementService extends MenuService {

	void executeUc(ElementDao ed) {
		showText("Ajout d'un nouveau element");
		String[] typeLists;
		// check empty typelist
		if(ed.checkListTypeEmpty()) {
			showText("Vous devez d'abord créer au moins un type d'élément");
			return;
		}
		
		showText("De quel type va être votre élément ? ");
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
