public class Bild extends Medium {
	String ort;

	public Bild(String name, int jahreszahl, String Ort) {
		super(name, jahreszahl);
		this.ort = Ort;
	}
	
	public String getOrt() {
		String ort = this.ort;
		return ort;
	}
	
	public void druckeDaten() {
		System.out.println("ID = " + this.getId() + " " + '"' + this.getTitel() + '"' + " aufgenommen im Jahr " + this.getJahr() + " in " + this.getOrt());
	}
}