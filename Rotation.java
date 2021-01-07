/*
 * Assignment 11
 * Date 30.06.2020
 */
import java.util.Scanner;
public class Rotation 
{
    void accept()
    {
        String s1,s2;
        do {
            System.out.println("Enter two Strings");
            s1=new Scanner(System.in).nextLine();
            s2=new Scanner(System.in).nextLine();
        }while(s1.equals("") || s2.equals(""));
        s1.toUpperCase();
        s2.toUpperCase();
        if(check(s1,s2))
        {
            System.out.println("The string "+s1+" is the rotation of "+ s2);
            
        }
        else
            System.out.println("Not");
    }
    boolean check(String a,String b)
    {
        if(a.equals(b))
    
        return false;
        if(a.length()!=b.length())
            return false;
        for(int i=0;i<a.length();i++)
        {
            if(b.indexOf(a.charAt(i))<0)
            
                return false;
            
                
        }
        int rotindex=a.indexOf(b.charAt(b.length()-1));
        String s1=a.substring(0, rotindex+1);
        String s2=a.substring(rotindex+1, b.length());
        if(s2.equals(b.substring(0,s2.length())) && s1.equals(b.substring(s2.length(),b.length())))
            return true;
        return false;
        
    }
    public static void main(String [] args)
    {
        new Rotation().accept();
    }
}
