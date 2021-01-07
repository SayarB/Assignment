
public class D2Point {
	double x;
	double y;
	D2Point()
	{
		x = 0;
		y = 0;
	}
	D2Point(double nx,double ny)
	{
		x=nx;
		y=ny;
		
	}
	double dist2D(D2Point b)
	{
		double dx=this.x-b.x;
		double dy=this.y-b.y;
		double dist=Math.sqrt((dx*dx)+(dy*dy));
		return dist;
	}
}
