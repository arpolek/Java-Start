
public class Main {

	public static void main(String[] args) {
		Pracownicy pracownik1 = new Pracownicy();
		Szefowie marketing = new Szefowie();
		
		System.out.println(pracownik1.getImie());
		System.out.println(pracownik1.getNazwisko());
		
		pracownik1.setPracownicy("Marian", "Niezgoda", 50);
		marketing.setSzefowie("Marzena", "Ojej", 40, 4000);
		
		System.out.println(pracownik1.getImie());
		System.out.println(pracownik1.getNazwisko());

	}

}
