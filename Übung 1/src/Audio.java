public class Audio extends Medium{
	int dauer;
	String interpret;
	
	public Audio(String name, int jahreszahl, int Dauer, String Interpret) {
		super(name, jahreszahl);
		this.dauer = Dauer;
		this.interpret = Interpret;
	}
	
	public int getDauer() {
		int dauer = this.dauer;
		return dauer;
	}
	
	public String getInterpret() {
		String interpret = this.interpret;
		return interpret;
	}
	
	public void druckeDaten() {
		System.out.println("ID = " + this.getId() + " " + '"' + this.getTitel() + '"' + " von " + this.getInterpret() + " aus " + this.getJahr() + " Spieldauer: " + this.getDauer() + " sek.");
	}
}