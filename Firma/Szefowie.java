
public class Szefowie extends Pracownicy {
	int premia;
	
	public Szefowie() {
		
	}
	
	public Szefowie(String imie, String nazwisko, int wiek, int premia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.premia = premia;
	}
	
	public void setSzefowie(String imie, String nazwisko, int wiek, int premia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.premia = premia;
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
	
	public int getPremia() {
		return this.premia;
	}
}
