
public class D3Point extends D2Point{
	double z;
	D3Point()
	{
		super();
		z=0;
	}
	D3Point(double nx,double ny,double nz)
	{
		super(nx,ny);
		z=nz;
	}
	double distance3D(D3Point b)
	{
		double dp=super.dist2D(new D2Point(b.x,b.y));
		double dz=b.z-this.z;
		double dist=Math.sqrt((dz*dz)+(dp*dp));
		return dist;
	}
}
