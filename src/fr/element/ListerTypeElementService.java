package fr.element;

public class ListerTypeElementService extends MenuService{

		void executeUc(ElementDao ed) {
			if(ed.checkListTypeEmpty()) {
				showText("Vous n'avez pas de type d'�l�ment sauvegard�");
				return;
			}
			showText("Liste des types d'�l�ments");
			
			for(String ligne: ed.getList()) {
				// todo : 
					// v0 d�parser
					// v1 Afficher une phrase en fonction du type
				String text = ligne;
				showText(text);
			}
		}

	}

