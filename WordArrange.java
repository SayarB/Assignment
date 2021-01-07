import java.util.*;
class WordArrange
{
    void accept()
    {
        System.out.println("Enter a Sentence");
        String k=new Scanner(System.in).nextLine();
        k=k.toUpperCase();
        char a=k.charAt(k.length()-1);
        if(".,?!".indexOf(a)<0)
        {
            System.out.println("Invalid Input");
            
        }
        else
        {
            k=k.substring(0,k.length()-1);
            
            fillArray(k);
        }
        
    }
    void fillArray(String a)
    {
        StringTokenizer st=new StringTokenizer(a);
        String arr[]=new String [st.countTokens()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=st.nextToken();
            
        }
        display(arr);
        arrange (arr);
        display(arr);
    }
    void arrange(String arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minIndex].length()>arr[j].length())
                {
                    minIndex=j;
                }else if(arr[minIndex].length()==arr[j].length())
                {
                    if(arr[minIndex].compareTo(arr[j])>0)
                        minIndex=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    void display(String t[])
    {
        for(int i=0;i<t.length;i++)
        {
            String ch=(i==(t.length)-1)?".":" ";
            System.out.print(t[i]+ch);
         
        }
        System.out.println();
    }
    
    public static void main(String [] args)
    {
        new WordArrange().accept();
    }
    
    
}
