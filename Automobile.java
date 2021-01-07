import java.util.*;
class Automobile
{
    protected String RName;
    protected int LNum;
    Automobile(String r,int l)
    {
        RName=r;
        LNum=l;
    }
    void display()
    {
        System.out.println("Region Name - "+RName);
        System.out.println("License Number - "+LNum);
    }
}