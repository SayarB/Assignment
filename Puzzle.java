import java.util.*;
public class Puzzle {//starting class
	
	boolean check(String[] arr,String k)//checks if puzzle is possible to solve
	{
		if(arr.length==1 && arr[0].charAt(0)==k.charAt(k.length()-1))//base case
			return true;
			
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].charAt(0)==k.charAt(k.length()-1))//recursion case
			{
				int count=0;
				String a[]=new String[arr.length-1];
				for(int j=0;j<arr.length;j++)
				{
					if(i!=j)
					a[count++]=arr[j];
					
				}
				return check(a,arr[i]);//recursive call
			}
		}
		return false;
	}
	public static void main(String[] args)//main method
	{
		Puzzle ob=new Puzzle();
		System.out.println("Enter number of test Case");
		int t=new Scanner(System.in).nextInt();
		int m=t;
		boolean ans[]=new boolean[t];
		while(m-->0)
		{
			System.out.println("Enter n");
			int n=new Scanner(System.in).nextInt();
			String a[]=new String[n];
			for(int i=0;i<n;i++)
			{
				a[i]=new Scanner(System.in).nextLine();
			}
			for(int i=0;i<n;i++)
			{
				int count=0;
				String[] b=new String[a.length-1];
				for(int j=0;j<n;j++)
				{
					if(i!=j)
						b[count++]=a[j];
						
				}
				ans[m]=ob.check(b,a[i]);
				if(ob.check(b, a[i]))
					break;
			}
			
		}
		while(t-->0)
		{
			if(ans[t])
			{
				System.out.println("Proper ordering is possible");
			}
			else
			{
				System.out.println("The door cannot be opened");
			}
		}
	}//end of main method
}//end of class
