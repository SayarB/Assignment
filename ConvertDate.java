import java.util.Scanner;
class ConvertDate
{
    int n;
    int d;
    int m;
    int y;
    ConvertDate()
    {
        n=0;
        d=0;
        m=0;
        y=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number");
        n=sc.nextInt();
        System.out.println("Enter the year");
        y=sc.nextInt();
        day_to_date();
    }
    void day_to_date()
    {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        
        int numDays=365;
        if(y%400==0)
        {
            days[1]=29;
            numDays=366;
        }
        else if(y%4==0 && y%100!=0)
        {
            days[1]=29;
            numDays=366;
        }
        y+=(n/numDays);
        
        n%=numDays;
        while(days[m]<n)
        {
            n-=days[m++];
        }
        d=n;
        display();
    }
    void display()
    {
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(months[m]+" "+d+" "+y);
    }
    public static void main(String[] args)
    {
        ConvertDate ob=new ConvertDate();
        ob.accept();
        
    }
}
