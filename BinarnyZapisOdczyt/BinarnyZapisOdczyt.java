import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BinarnyZapisOdczyt {

	public static void main(String[] args) {
		RandomAccessFile strumien = null;
		int iloscBajtow = 0;
		
		try {
			strumien = new RandomAccessFile("daneBinarne.txt","rw");
		} catch (FileNotFoundException e) {
			System.out.println("Blad otwierania strumienia");
		}
		
		try {
			strumien.writeUTF("Artur");
			strumien.writeInt(2018);
			strumien.writeDouble(50 / 4);
			
			strumien = new RandomAccessFile("daneBinarne.txt","rw");
			while (strumien.read() != -1)
				iloscBajtow++;
		} catch (IOException e) {
			System.out.println("Blad wejscia-wyjscia");
		}
		
		try {
			strumien.close();
		} catch (IOException e) {
			System.out.println("Blad zamykania strumienia");
		}
		
		System.out.println("Ilosc Bajtow Wynosi: " + iloscBajtow);
		
	}

}
