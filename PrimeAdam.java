import java.util.*;
class PrimeAdam
{
    boolean checkPrime(int n)//checks if n is prime
    {
        if(n==1)
        return false;
        if(n==2)
            return true;
        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    boolean checkAdam(int n)//check if n is adam
    {
        if(reverse(n*n)==(int)Math.pow(reverse(n),2))
            return  true;
        return false;    
    }
    int reverse(int n)//recursively reverse the number
    {
        if(n>=10)
            return ((n%10)*(int)Math.pow(10,(int)Math.log10(n))+reverse(n/10));
        else
        return n;
    }
    void accept()//accepting data and printing output
    {
        System.out.print("m = ");
        int m=new Scanner(System.in).nextInt();
        System.out.print("\nn = ");
        int n=new Scanner(System.in).nextInt();
        if(m>=n)
            System.out.println("Invalid Input");
        else
        {
            findPrimeAdam(m,n);
        }
        
    }
    void findPrimeAdam(int m,int n)//finds the prime adams in range m->n
    {
        System.out.println("The Prime-Adam Integers Are:");
        int count=0;
        for(int i=m;i<=n;i++)
        {
            if(checkPrime(i) && checkAdam(i))
            {
                System.out.print(i+" ");
                count++;
            }
            
        }
        if(count==0)
            System.out.print("NIL");
        System.out.println("\nThe Frequency of Prime-Adam Integers is: "+count);
    }
    public static void main(String [] args)//main method
    {
        new PrimeAdam().accept();
        
    }
}//end of class
