package fr.element;

public class ElementDao {

	private static String[] list;
	private static String[] typeList;
		// todo : formaliser les premiers éléments de la liser
		// list : { "id", "code", "type", "parametres..." }
	
	public ElementDao() {
		// TODO Auto-generated constructor stub
	}

	public void saveNewElement(String element) {
		String[] listTemporary;
		if(typeList != null) {
			listTemporary = new String[typeList.length + 1];
			if(typeList.length != 0) {
				for (int i = 0; i < typeList.length; i++) {
					listTemporary[i] = typeList[i];
				}
			}
			listTemporary[typeList.length] = element;
		} else {
			listTemporary = new String[1];
			listTemporary[0] = element;
		}
		list = listTemporary;
	}
	public void saveNewListTypeElement(String listType) {
		// supposed ListTypeclean, and unique
		String[] typelistTemporary;
		if(typeList != null) {
			typelistTemporary = new String[typeList.length + 1];
			if(typeList.length != 0) {
				for (int i = 0; i < typeList.length; i++) {
					typelistTemporary[i] = typeList[i];
				}
			}
			typelistTemporary[typeList.length] = listType;
		} else {
			typelistTemporary = new String[1];
			typelistTemporary[0] = listType;
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
	
	public String[] increaseArray(String[] array, String element) {

		String[] menuTemporary;
		if(array != null) {
			menuTemporary = new String[array.length + 1];
			if(array.length != 0) {
				for (int i = 0; i < array.length; i++) {
					menuTemporary[i] = array[i];
				}
			}
			menuTemporary[array.length] = element;
		} else {
			menuTemporary = new String[1];
			menuTemporary[0] = element;
		}
		return menuTemporary;
	}
	
	String[] getdataTypeFromTypeList(String typelist) {

		String[] parts = typelist.split("\\,"); // String array, each element is text between virgules

		return parts;
	}
	
	String getNameType(String typelist){
		return getdataTypeFromTypeList(typelist)[0];	
	}
	
	String[] getList() {
		return list;
	}
	
	String[] getTypeList() {
		return typeList;
	}
}