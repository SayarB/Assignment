import java.util.*;
class Mix
{
    String wrd;
    int len;
    Mix()
    {
        wrd="";
        len=0;
    }
    void feedword()
    {
        String k="";
        do{
            System.out.println("Enter Word");
            k=new Scanner(System.in).nextLine();
        }while(!k.toUpperCase().equals(k));
        wrd=k;
        len=wrd.length();
    }
    void mix_word(Mix P,Mix Q)
    {
        String a=(P.len<=Q.len)?P.wrd:Q.wrd;
        String k="";
        String b=(Q.len<P.len)?P.wrd:Q.wrd;
        for(int i=0;i<a.length();i++)
        {
            k=k+Character.toString(a.charAt(i))+Character.toString(b.charAt(i));
        }
        k+=b.substring(a.length(),b.length());
        this.wrd=k;
    }
    void display()
    {
        System.out.println(this.wrd);
    }
    public static void main(String[] args)
    {
        Mix ob1=new Mix();
        ob1.feedword();
        Mix ob2=new Mix();
        ob2.feedword();
        Mix mix=new Mix();
        mix.mix_word(ob1,ob2);
        mix.display();
    }
}