
public class Main {

	public static void main(String[] args) {
		Punkt punkt = new Punkt();
		punkt.x = 10;
		punkt.y = 20;
		
		Test.InkrementujPkt(punkt);
		Test.ZmienPkt(punkt, 150, 560);
		
		Punkt.Print(punkt);
		

	}

}
