import java.util.Scanner;
import java.util.StringTokenizer;
class LongestSubstring
{
    void accept()
    {
        String a=new Scanner(System.in).nextLine();
        
        if(".?!".indexOf(a.charAt(a.length()-1))==-1)
        {
            System.out.println("Invalid Sentence");
        }
        else{
            String b[]=a.split(" ");
            find(b);
        }
    }
    void find(String b[])
    {
        String longest=b[0];
        int len=0;
        for(int i=1;i<b.length;i++)
        {
            for(int j=b[i].length();j>0;j--)
            {
                for(int k=0;k<=b[i].length()-j;k++)
                {
                    if(longest.contains(b[i].substring(k,k+j)) && (b[i].substring(k,k+j).length()>len))
                    {
                        longest=b[i].substring(k,k+j);
                        len=longest.length();
                    }
                }
                
            }
                
            
        }
        System.out.println(longest);
                
    }
    public static void main(String [] args)
    {
        new LongestSubstring().accept();
    }
}