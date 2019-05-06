package fr.element;

public class ElementDao {

	private static String[] list;
	private static String[] typeList;
		// todo : formaliser les premiers éléments de la liser
		// list : { "id", "code", "type", "parametres..." }
	
	public ElementDao() {
		// TODO Auto-generated constructor stub
	}

	public void saveNewListTypeElement(String ListType) {
		// supposed ListTypeclean, and unique
		String[] typelistTemporary;
		if(typeList != null) {
			typelistTemporary = new String[typeList.length + 1];
			if(typeList.length != 0) {
				for (int i = 0; i < typeList.length; i++) {
					typelistTemporary[i] = typeList[i];
				}
			}
			typelistTemporary[typeList.length] = ListType;
		} else {
			typelistTemporary = new String[1];
			typelistTemporary[0] = ListType;
		}
		typeList = typelistTemporary;
	}
	
	String checkListType(String listType) {
		if(listType.equals("")) {
			return "Vous n'avez rien rentré";
		} else if(listType.indexOf(",",0) < 1) {
			return "le format utilisé n'est pas compatible";
		} else if(false) {
			return "vous avez déjà utilisé ce nom pour un type de list";
		}
		return "";
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
	
	String getNameTypeFromString(String type) {
	
		String result = "";
		int end = type.indexOf(",");
		if (end != -1) 
		{
			result= type.substring(0 , end); //to check if it does apply delete
		}
		return result;
	}
	
	String[] getParamTypeFromString(String type) {
		String[] result = null;
		int end = type.indexOf(",");
		while(end != -1) {
			
		}
		return result;
	}
	
	String[] getList() {
		return list;
	}
	
	String[] getTypeList() {
		return typeList;
	}
}