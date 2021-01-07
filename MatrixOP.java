import java.util.*;
public class MatrixOP {
	int arr[][];
	int n;
	MatrixOP(int nn)
	{
		n=nn;
		arr=new int[n][n];
	}
	void input()
	{
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int in;
				//do {
				in=new Scanner(System.in).nextInt();
				//if(in<100)
					//System.out.println("Try again. Only 3 digit numbers allowed");
				//}while(in<100);
				
				arr[i][j]=in;
			}
		}
		
	}
	MatrixOP prod (MatrixOP a)
	{
		MatrixOP p=new MatrixOP(a.arr.length);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(highPrimeD(this.arr[i][j])!=-1 && highPrimeD(a.arr[i][j])!=-1)
					p.arr[i][j]=highPrimeD(this.arr[i][j])*highPrimeD(a.arr[i][j]);
				else if(highestCompositeD(a.arr[i][j])!=-1)
					p.arr[i][j]=highestCompositeD(a.arr[i][j])+sumOfDigit(this.arr[i][j]);
				else
					p.arr[i][j]=prodOfDigit(a.arr[i][j]);
					
				
					
			}
				
		}
		return p;
	}
	int highPrimeD(int i)
	{
		int ans=-1;
		
		while(i>0)
		{
			int dig=i%10;
			if(dig>ans && (dig==2 || dig==3 || dig==5 || dig==7))
			{
				ans=dig;
			}
			i/=10;
		}
		return ans;
	}
	int highestCompositeD(int i)
	{
		int ans=-1;
		
		while(i>0)
		{
			int dig=i%10;
			if(dig>ans && (dig==4 || dig==6 || dig==8 || dig==9))
			{
				ans=dig;
			}
			i/=10;
		}
		return ans;
	}
	int sumOfDigit(int i)
	{
		if(i<10)
			return i;
		return (i%10)+sumOfDigit(i/10);
	}
	int prodOfDigit(int i)
	{
		if(i<10)
			return i;
		return (i%10)*sumOfDigit(i/10);
	}
	void display()
	{
		for(int i=0;i<n;i++,System.out.println())
			for(int j=0;j<n;j++)
				System.out.print(this.arr[i][j]+" ");
	}
	public static void main(String [] args)
	{
		MatrixOP a=new MatrixOP(3);
		MatrixOP b=new MatrixOP(3);
		a.input();
		b.input();
		MatrixOP ans=a.prod(b);
		ans.display();
	}
}
