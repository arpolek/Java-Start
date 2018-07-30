public class Firma {

	public static void main(String[] args) {

/*			
		Pracownik pracownik1 = new Pracownik();
		Pracownik pracownik2 = new Pracownik();
	
		pracownik1.setImie("Waldek");
		pracownik1.setNazwisko("Kowalski");
		pracownik1.setWiek(30);
		
		pracownik2.setImie("Ferdek");
		pracownik2.setNazwisko("Malolepszy");
		pracownik2.setWiek(55);
*/

		Pracownik[] pracownicy = new Pracownik[3];
		
		String[] imiona = {"Waldek", "Ferdek", "Halinka"};
		String[] nazwiska = {"Kolwalski", "Malopelszy", "Kiepska"};
		int[] wiek = {30, 55, 50};
		
		for(int i=0; i<pracownicy.length; i++) {
			pracownicy[i] = new Pracownik();
			pracownicy[i].pracownikImie = imiona[i];
			pracownicy[i].pracownikNazwisko = nazwiska[i];
			pracownicy[i].pracownikWiek = wiek[i];
		}
		
		System.out.println("Pracownicy firmy to:");
		for (int i=0; i<pracownicy.length; i++)
			System.out.println(pracownicy[i].pracownikImie+""+pracownicy[i].pracownikNazwisko+""+pracownicy[i].pracownikWiek);

/*		
		System.out.println("Pracownik1 "+ pracownik1.getImie() +" " + pracownik1.getNazwisko() +", wiek:"+ pracownik1.getWiek());
		System.out.println("Pracownik2 "+ pracownik2.getImie() +" " + pracownik2.getNazwisko() +", wiek:"+ pracownik2.getWiek());
*/
	}

}
