import java.util.*;
class Hex_add
{
    String n1;
    String n2;
    Hex_add()
    {
        n1="";
        n2="";
        
    }
    void accept()
    {
        do{
            System.out.println("Enter Two Hexadecimal numbers");
            n1=new Scanner(System.in).nextLine();
            n2=new Scanner(System.in).nextLine();
        }while(!check(n1)||!check(n2));        
        add();        
    }
    boolean check(String n)
    {
        for(int i=0;i<n.length();i++)
        {
            if("1234567890ABCDEF".indexOf(n.charAt(i))<0)
                return false;            
        }
        return true;
    }
    void add()
    {
        int sum=(Integer.parseInt(hex_dec(n1)))+(Integer.parseInt(hex_dec(n2)));
        System.out.println("Sum= "+ dec_hex(sum));
    }
    String hex_dec(String n)
    {
        int a=0;
        for(int i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if("1234567890".indexOf(c)>=0)
            a+=Math.pow(16,n.length()-1-i)*Integer.parseInt(Character.toString(c));
            else
            {
                a+=Math.pow(16,n.length()-1-i)*((int)c - 55);
                
            }
        }
        return Integer.toString(a);        
    }
    String dec_hex(int x)
    {
        String rev="";
        while(x!=0)
        {
            if(x%16<=9)
            rev += x%16;
            else
            rev+=(char)((x%16)+55);            
            x/=16;
        }        
        String hex="";
        for(int i=rev.length()-1;i>=0;i--)
        {
            hex+=rev.charAt(i);            
        }
        return hex;
    }
    public static void main(String [] args)
    {
        new Hex_add().accept();
        
    }
}