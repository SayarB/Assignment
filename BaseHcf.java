
public class BaseHcf {
	private int p,q;
	BaseHcf(int a,int b)
	{
		p=a;
		q=b;
	}
	void show()
	{
		
		System.out.println(hcf(p,q));
	}
		
	int hcf(int m,int n)
	{
		if(m>n)
			return hcf(m-n,n);
		else if(m<n)
			return hcf(m,n-m);
		else
			return m;
	}
	int getP()
	{
		return p;
	}
	int getQ()
	{
		return q;
	}
}
