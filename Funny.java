import java.util.*;
public class Funny {
    boolean isFunny(String n)
    {
        String r=reverse(n);    
        int[] arr1=diff(n);
        int[] arr2=diff(r);
        if(isEqual(arr1,arr2))
        {
            return true;
        }
        return false;       
    }
    String reverse(String n)
    {
        String rev="";
        for(int i=n.length()-1;i>-1;i--)
        {
            rev=rev+n.charAt(i);
        }
        return rev;     
    }
    boolean isPalin(String n)
    {
        if(reverse(n).equals(n))
            return true;
        return false;   
    }
    int[] diff(String n)
    {
        int []arr=new int[n.length()-1];
        for(int i=0;i<n.length()-1;i++)
        {
            arr[i]=Math.abs(n.charAt(i)-n.charAt(i+1));
        }
        return arr;
    }
    boolean isEqual(int []arr1,int []arr2)
    {
        if(arr1.length!=arr2.length)
            return false;
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]!=arr2[i])
                return false;           
        }       
        return true;
    }
    void accept()
    {
        String a=new Scanner(System.in).nextLine();
        if(".!?".indexOf(a.charAt(a.length()-1))<=-1)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }else
        {
            a=a.substring(0, a.length()-1);
            StringTokenizer st=new StringTokenizer(a);
            String arr[]=new String[st.countTokens()];          
            Arrays.fill(arr,"");
            int count=0;
            while(st.hasMoreTokens())
            {
                String k=st.nextToken();            
                if(isFunny(k))
                {
                    int check=0;
                    for(int i=0;i<count;i++)
                    {
                        if(arr[i].equals(k))
                            check=1;
                    }
                    if(check==0)
                    arr[count++]=k;                 
                }               
            }
            for(int i=0;i<arr.length && arr[i]!=null;i++)
            {
                if(arr[i]!=null)
                System.out.println(arr[i]);
            }   
            System.out.println("Funny Strings which are not palindrome");
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=null && !isPalin(arr[i]))
                    System.out.print(arr[i]+" ");
            }
        }                
    }
    public static void main(String args[])
    {
        new Funny().accept();
    }    
}
