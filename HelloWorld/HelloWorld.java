import static java.lang.Math.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HelloWorld {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Pierwsza linia\nDruga Linia\nTrzecia linia");
		
		System.out.println('a' + 'A');
		System.out.println(1+2);
		System.out.println(1.0+2.0);
		System.out.println("cudzyslow\"");
		System.out.println(true);
		
		int liczba1, liczba2;
		liczba1 = 5;
		liczba2 = liczba1;
		System.out.println(liczba1+liczba2);
		
		double liczba3, liczba4;
		liczba3 = 1.0;
		liczba4 = 2.0;
		System.out.println(liczba3);
		System.out.println(liczba4);
		
		System.out.println("a + b = "+(liczba1+liczba2));
		
		String pierwszy = "Mala ";
		String drugi = "Monika";
		String malamonika = pierwszy+drugi;
		System.out.println(malamonika);
		
		String czesc = malamonika.substring(0, 6) + "uczniu";
		System.out.println(czesc);
		
		double liczba = 9.0;
		double wykladnik = 3.0;
		
		double potega = pow(liczba, wykladnik);
		double pierwiastek = sqrt(liczba);
		System.out.println("Potega trzeciego stopnia liczby "+liczba+" to "+potega);
		System.out.println("Pierwiastek z liczby "+liczba+" to "+pierwiastek);
		
		String imie;
		System.out.println("Podaj swoje imie"+"\n");
		Scanner odczyt1 = new Scanner(System.in);
		imie = odczyt1.nextLine();
		System.out.println("Witaj "+imie);
		
		int liczba5, liczba6;
		System.out.println("Podaj pierwsza liczbe int:");
		Scanner odczyt2 = new Scanner(System.in);
		liczba5 = odczyt2.nextInt();
		System.out.println("Podaj druga liczbe int:");
		Scanner odczyt3 = new Scanner(System.in);
		liczba6 = odczyt3.nextInt();
		int liczba7 = liczba5 + liczba6;
		System.out.println("Suma podanych przez Ciebie liczb to: "+liczba7);
		
		File file = new File("plik.txt");
		Scanner in = new Scanner(file);
		String zdanie = in.nextLine();
		System.out.println(zdanie);
		
		PrintWriter zapis = new PrintWriter("plik2.txt");
		zapis.println("Teraz spia w ubraniach");
		zapis.close();
		System.out.println("Tekst zostal zapisany do pliku plik2.txt");
		
		//pobranie z klawiatury imienia, zapisanie go do pliku a pozniej odczytanie go z pliku
		//i wyswietlenie w konsoli
		
		String name;
		System.out.println("Zadanie: wprowadz swoje imie, zapisze je do pliku");
		Scanner read_name = new Scanner(System.in);
		name = read_name.nextLine(); // wprowadzenie i przechwycenie imienia
		System.out.println("Wpisales imie: "+name+". Zapisuje je do pliku"); // wyswietlenie wpisanego imienia
																			 //tylko zmiennej, nie z pliku
		PrintWriter save_name = new PrintWriter("imie.txt");
		save_name.println(name);											//zapisanie imienia do pliku
		save_name.close();
		File file_read = new File("imie.txt");
		Scanner in2 = new Scanner(file_read);
		name = in2.nextLine();
		System.out.println("Wyswietlam imie z pliku imie.txt: "+name);		//wyswietlenie imienia z pliku
		
		// TABLICE
		int j = 100;
		int numbers[] = new int[10];
		for(int i=0; i<10; i++) {
			numbers[i] = j;
			j++;
			System.out.println("Stworzylismy tablice. Jej kolejnymi elementami sa: "+numbers[i]);
		}
		System.out.println("Zostaniesz poproszony o podanie nazw 5 miast");
		String cities[] = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("Podaj nazwe miasta nr "+(i+1));
			Scanner city_read = new Scanner(System.in);
			cities[i] = city_read.nextLine();
			System.out.println("Witaj w miescie "+cities[i]);
		}
		
		System.out.println("Jak duza powinna byc tablica?");
		Scanner table_size = new Scanner(System.in);
		int t_size = table_size.nextInt();
		int tablica[] = new int[t_size];
		for(int i=0; i<t_size; i++) {
			tablica[i] = i+1;
		}
		System.out.println("Wyswietlam zawartosc tablicy przy pomocy petli while");
		int k=0;
		while(k < t_size) {
			System.out.println(tablica[k]);
			k++;
		}
		
	}

}
