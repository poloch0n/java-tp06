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
			showText(i + ". "+ed.getNameType(typeLists[i]));
		}
		// ask for wich type

		int choice = FromMenu.getIntFromMenu();
		// get type
		//		check answer
		// :loop from here
		String[] ListParam = ed.getdataTypeFromTypeList(typeLists[choice]);
		
		String answer = "";
		for(int i =0; i<ListParam.length;i++) {
			if(i==0) {
				showText("vous avez préselectionner le type "+ListParam[0]);
			} else {
				showText("Paramètre a renseigner : "+ListParam[i]);
				answer += FromMenu.getStringFromMenu()+",";
			}
		}
		
		// check data
		// :loop from here
		// "{nomType,param1,param2,param3}";
		
		
		
		
		
		
		//todo
			// v0 : une seule ligne, clean de tout espace, type séparé par des virgules, echapper les caractères ? 
			// v1 : ajouter une ligne puis proposer confirmation puis proposer d'ajouter ou non un nouveau champs
		// supposé "nomType,param1,param2,param3 "
		// formater le retour
		// vérifier unicité du nom

//		String message = ed.checkAnswer(answer);
		String message = "";
		if(!message.equals("")) {
			showText(message);
			executeUc(ed);
			return;
		}
		showText(answer);
		ed.saveNewElement(answer);
	}

}
