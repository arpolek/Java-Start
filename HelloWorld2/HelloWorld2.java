
public class HelloWorld2 {

	public static void main(String[] args) {
		int tab1[][] = new int[2][3];
		int k=0;
		for(int i=0; i<tab1.length; i++) {
			for(int j=0; j<tab1[i].length; j++) {
				tab1[i][j] = k++;
				System.out.printf("tab[%d,%d] = %d \n", i,j,tab1[i][j]);
			}
		}
		
		int tab2[] = new int[10];
		for(int i=0; i<10; i++)
			tab2[i] = i+1;
		
		for(int j : tab2)
			System.out.println(j);
		

	}

}
