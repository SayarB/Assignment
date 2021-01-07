import java.util.*;
class Date
{
    int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    int numDays=365;
    String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Day Number: ");
        int dn=sc.nextInt();
        System.out.print("\nYear :");
        int year=sc.nextInt();
        System.out.print("\nDate After(N Days) :");
        int da=sc.nextInt();
        if(da>100 || da<1)
        {
            System.out.println("Date After(N days) is out of Range");
            System.exit(0);
        }
        else if(dn<1 ||dn>366)
        {
            System.out.println("Day number out of range");
            System.exit(0);
        }
        if(year%400==0)
        {
            days[1]=29;
            numDays=366;
        }
        else if(year%4==0 && year%100!=0)
        {
            days[1]=29;
            numDays=366;
        }
        System.out.print("Date : ");
        findDate(dn,year);            
        System.out.print("Date after "+da+" days :");
        findDate(da+dn,year);
    }
    
    String findSuf(int a)
    {
	if(a%10==1)
	   return "st";
	else if(a%10==2)
	   return "nd";
	else if(a%10==3)
	   return "rd";
	else
	   return "th";
    }
    void findDate(int d,int y)
    {
        int month=0;        
        y+=(d/numDays);
        if(y%400==0)
        {
            days[1]=29;
            
        }
        else if(y%4==0 && y%100!=0)
        {
            days[1]=29;
            
        }
        d%=numDays;
        while(days[month]<d)
        {
            d-=days[month++];
        }
        System.out.println(d+findSuf(d)+" "+months[month]+" "+y);     
    }
    
    public static void main(String[] args)
    {
        new Date().accept();
    }
}
