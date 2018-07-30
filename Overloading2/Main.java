
public class Main {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 4;
		double d = 10.0;
		double e = 15.0;
		double f = 20.0;
		
		Dodawanie operacja = new Dodawanie();
		
		System.out.println(operacja.dodaj(b, c));
		System.out.println(operacja.dodaj(d, e, f));
		System.out.println(operacja.dodaj(a, b, c));
		

	}

}
