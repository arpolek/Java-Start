
public class Pracownik {
	String pracownikImie;
	String pracownikNazwisko;
	int pracownikWiek;
	
	void setImie(String imie) {
		pracownikImie = imie;
	}
	
	void setNazwisko (String nazwisko) {
		pracownikNazwisko = nazwisko;
	}
	
	void setWiek (int wiek) {
		pracownikWiek = wiek;
	}
	
	String getImie() {
		return pracownikImie;
	}
	
	String getNazwisko() {
		return pracownikNazwisko;
	}
	
	int getWiek() {
		return pracownikWiek;
	}
}
