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
				showText("vous avez pr�selectionner le type "+ListParam[0]);
			} else {
				showText("Param�tre a renseigner : "+ListParam[i]);
				answer += FromMenu.getStringFromMenu()+",";
			}
		}
		
		// check data
		// :loop from here
		// "{nomType,param1,param2,param3}";
		
		
		
		
		
		
		//todo
			// v0 : une seule ligne, clean de tout espace, type s�par� par des virgules, echapper les caract�res ? 
			// v1 : ajouter une ligne puis proposer confirmation puis proposer d'ajouter ou non un nouveau champs
		// suppos� "nomType,param1,param2,param3 "
		// formater le retour
		// v�rifier unicit� du nom

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
