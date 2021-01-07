import java.util.*;
public class Descending {//starting class
	int num;
	Descending()//constructor
	{
		num=0;
	}
	int dsc()//iterates from 9 to 0
	{
		for(int i=9;i>=0;i--)
		{
			for(int j=0;j<(num+"").length();j++)
			{
				if(i==Integer.parseInt(((num+"").charAt(j))+""))
						{
						String temp=(num+"").substring(0,j)+(num+"").substring(j+1);
						if(!temp.equals(""))
						{
							num=Integer.parseInt(temp);
							return i;
						}
				}
			}
		}
		return num;
	}
	int high()//method  high 
	{
		int newno;
		if(num>=10)
		{
			newno=dsc();
			int t=high();
			num=newno*(int)Math.pow(10,(int)Math.log10(t)+1)+t;
			return num;
		}
		
		return num;
		
	}////end of method main
	public static void main(String[] args)
	{//start of main method 
		Descending ob=new Descending();
		ob.num=111222333;
		System.out.println("Number= "+ob.num+"\nArranged Number= "+ob.high());
	}//end of main method
}//ed of class
