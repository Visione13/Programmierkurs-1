import java.util.concurrent.atomic.AtomicInteger;

public abstract class Medium {
	private static final AtomicInteger count = new AtomicInteger(-1);
	String titel;
	int jahr;
	final int id;
	
	public Medium (String Titel, int Jahr) {
		id = count.incrementAndGet();
		this.titel = Titel;
		this.jahr = Jahr;
	}
	
	public int getId() {
		int id = this.id;
		return id;
	}
	
	public String getTitel() {
		String titel = this.titel;
		return titel;
	}
	
	public int getJahr() {
		int jahr = this.jahr;
		return jahr;
	}
}