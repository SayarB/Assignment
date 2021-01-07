import java.util.Scanner;
class NumWord
{
    void accept()
    {
        int n=0;
        
        do{
            System.out.println("Enter a number of 7 digit");
            n=new Scanner(System.in).nextInt();
            
        }while (n<0 || n>9999999);
        String k=numToWord("",n);
        System.out.println(k);
    }
    String tillHundred(int n)
    {
        String []unit ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String []teen ={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String []tens ={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int a=n;
        int count=1;
        if(n==0)
        return "zero";
          String k="";
        while(a!=0)
        {           
            int d=a%10;
            if(d==0)
            {
                count++;
                continue;
            }
            if(count==1)
            {         
                k=unit[d];
            }  
            if(count==2)
            {
                if(d==1)
                {
                    if(k.equals(""))
                        k="ten";
                    else
                    {
                        int index=0;
                        for(index=0;(index<unit.length && unit[index].trim().equals(k.trim()));index++);
                        k=teen[index];
                    }
                }
                else
                {
                    k=tens[d-2]+" "+k;
                }
            }
            if(count==3)
            {
                k=unit[d]+" hundred "+k;
            }
            count++;
            a/=10;
        }
        return k;
    }
    String numToWord(String k,int n)
    {        
        int numdig=(int)Math.log10(n)+1;
        if(numdig<=3)
        {
            k=k+tillHundred(n%1000);
        }
        else if(numdig>3 && numdig<=6)
        {
            k=k+tillHundred(n/1000)+" Thousand "+tillHundred(n%1000);           
        }
        else
        {
            k=tillHundred(n/1000000)+" million ";           
            return(numToWord(k,n%1000000));
        }
        return k;
    }
    public static void main(String [] args)
    {
        new NumWord().accept();
    }
   
}