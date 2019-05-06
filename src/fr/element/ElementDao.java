package fr.element;

public class ElementDao {

	private static String[] list;
	private static String[] typeList;
		// todo : formaliser les premiers éléments de la liser
		// list : { "id", "code", "type", "parametres..." }
	
	public ElementDao() {
		// TODO Auto-generated constructor stub
	}

	boolean checkListEmpty() {
		if(list == null) {
			return true;
		} else {		
			return false;
		}
	}

	boolean checkListTypeEmpty() {
		if(typeList == null) {
			return true;
		} else {		
			return false;
		}
	}
	
	String[] getList() {
		return list;
	}
}