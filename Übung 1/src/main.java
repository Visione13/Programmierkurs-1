import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		main main = new main();
		Audio audio1 = new Audio("It Means Nothing", 2007, 229, "Stereophonics");
		Bild bild1 = new Bild("Gebaeude FB Informatik", 2021, "Dortmund");
		audio1.druckeDaten();
		bild1.druckeDaten();
		main.getAge(bild1);
	}
	
	public void getAge(Medium medium) {
		LocalDate date = LocalDate.now();
		int age = date.getYear()-medium.getJahr();
		
		if(age > 1) {
			System.out.println('"' + medium.getTitel()+ '"' + " ist " + age + " Jahre alt");
		}else {
			System.out.println('"' + medium.getTitel()+ '"' + " ist " + age + " Jahr alt");
		}
	}
}