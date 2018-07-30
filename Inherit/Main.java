
public class Main {

	public static void main(String[] args) {
		Point2d pkt1 = new Point2d();
		Point2d pkt2 = new Point2d(2, 3);
		Point3d pkt3 = new Point3d();
		Point3d pkt4 = new Point3d(4, 5, 1);
		
		System.out.println("Point1 coordinates: "+pkt1.x+", "+pkt1.y);
		System.out.println("Point2 coordinates: "+pkt2.x+", "+pkt2.y);
		System.out.println("Point3 coordinates: "+pkt3.x+", "+pkt3.y+", "+pkt3.z);
		System.out.println("Point4 coordinates: "+pkt4.x+", "+pkt4.y+", "+pkt4.z);

	}

}
