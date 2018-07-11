public class Dispatcher {
	
	private final Sean Sean;
	private final Nikki Nikki;
	private final Brad Brad;
	
	public Dispatcher() {
		Sean = new Sean();
		Nikki = new Nikki();
		Brad = new Brad();
	}
	
	public void dispatch(String request) {
		
		if(request.equalsIgnoreCase("Sean")) {
			Sean.bio();
		}
		
		else if(request.equalsIgnoreCase("Nikki")) {
			Nikki.bio();
		}
		
		else {
			Brad.bio();
		}
	}
}