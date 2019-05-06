package fr.element;

class MenuServiceFactory {

	public MenuServiceFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public MenuService run(Integer answer) {
		switch(answer) {
		case 1:
			return new ListerElementService();
		case 2:
			return new ListerTypeElementService();
		case 4:
			return new AjouterListTypeService();
		case 99:
			return new ExitService();
		default:
			// todo define
			return new DefaultService();
		}
	}

}
