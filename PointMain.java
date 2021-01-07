
public class PointMain {
	public static void main(String [] args)
	{
		double x1=1;
		double x2=1;
		double y1=1;
		double y2=1;
		double z1=1;
		double z2=1;
		D3Point p1=new D3Point(x1,y1,z1);
		D3Point p2=new D3Point(x2,y2,z2);
		System.out.println("P1= "+x1+","+y1+","+z1);
		System.out.println("P2= "+x2+","+y2+","+z2);
		System.out.println("Distance= "+p1.distance3D(p2));
	}
}
