
public class Pracownicy {
	String imie;
	String nazwisko;
	int wiek;
	
	public Pracownicy() {
		this.imie = "Unknown";
		this.nazwisko = "Uknown";
		this.wiek = -1;
	}
	
	public Pracownicy(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	public void setPracownicy(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	public String getImie() {
		return this.imie;
	}
	
	public String getNazwisko() {
		return this.nazwisko;
	}
	
	public int getWiek() {
		return this.wiek;
	}
	
}
