import java.util.*;
public class Sphenic {
    public static void main(String []args)
    {
        new Sphenic().accept();     
    }
    void accept()
    {
        int a,n;
        System.out.print("Enter a number:");
        a=new Scanner(System.in).nextInt(); 
        System.out.print("\nEnter N(Limit):");
        n=new Scanner(System.in).nextInt();
        if(sphenic(a,1,0))
            System.out.println(a+" is a sphenic number.");
        else
            System.out.println(a+" is not a sphenic number.");
        int i=1;
        int count=1;
        while(count<=n)
        {
            if(sphenic(i,1,0))
            {
                System.out.print(i+",");
                count++;
            }
            i++;
        }
        for(i=1;i<5000;i++)
        {
            if(sphenic(i,1,0) && sphenic(i+1,1,0))
                System.out.println(i+" , "+(i+1));
            
        }
    }    
    boolean sphenic(int n,int i,int count)
    {
        if(n>=i && isPrime(n) && count==2)
            return true;
        else if(count<3)
        {   
            while(i<n)
            {   
                if(isPrime(i) && n%i==0)
                {                  
                    return sphenic(n/i,i+1,count+1);                  
                }
                i++;
            }
            return false;          
        }
        return false;
    }
    boolean isPrime(int n)
    {
        if(n==1)
            return false;
        if(n==2)
            return true;
        for(int i=2;i<n/2 ;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }      
}
