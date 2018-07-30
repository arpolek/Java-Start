
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("czesc");
		
		int[] tablica = new int[10];
		for (int i=0; i<10; i++)
			tablica[i] = i+1;
		
		for (int x: tablica)
			System.out.println(x);

	}

}
