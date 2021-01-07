import java.util.*;
class Convert
{
    String sen;
    Convert(String s)
    {
        sen=s;
    }
    char[] longest()
    {
        StringTokenizer st=new StringTokenizer(sen);
        char[] ch;
        String longest=st.nextToken();
        while(st.hasMoreTokens())
        {
            String t=st.nextToken();
            if(t.length()>longest.length())
                longest=t;
        }
        ch=new char[longest.length()];
        for(int i=0;i<longest.length();i++)
        {
            ch[i]=longest.charAt(i);
        }
        return ch;
    }
    byte[] toByte()
    {
        char[] ch=longest();
        byte[] uni=new byte[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            uni[i]=(byte)ch[i];
        }
        return uni;
    }
    int indexOf(String regex,int from)
    {
        StringTokenizer st=new StringTokenizer(sen);
        String longest=st.nextToken();
        while(st.hasMoreTokens())
        {
            String t=st.nextToken();
            if(t.length()>longest.length())
                longest=t;
        }
        for(int i=from;i<longest.length()-regex.length()+1;i++)
        {
            if(longest.substring(i,i+regex.length()).equals(regex))
                return i;
        }
        return -1;
        
    }
    public static void main(String args[])
    {
        System.out.println("Sentence");
        Convert ob=new Convert(new Scanner(System.in).nextLine());
        char ch[]=ob.longest();
        byte[] uni=ob.toByte();
        System.out.println("Enter regex and from");
        String regex=new Scanner(System.in).nextLine();
        int from=new Scanner(System.in).nextInt();
        int index=ob.indexOf(regex,from);
        for(int i=0;i<uni.length;i++)
        {
            System.out.println("Character= "+ch[i]+"   Unicode= "+uni[i]);
        }
        System.out.println("Index is "+index);
    }
}