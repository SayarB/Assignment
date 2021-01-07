
public class DerivedHcf extends BaseHcf{
    int r;
    DerivedHcf(int a,int b,int c)
    {
        super(a,b);
        r=c;
    }
    void show(int r)
    {
        
        System.out.println(super.hcf(this.r,r));
    }
    public static void main(String [] args)
    {
        int a,b,c;
        a=16;
        b=20;
        c=108;
        
        DerivedHcf ob=new DerivedHcf(12,16,20);
        System.out.printf("The HCF of %d, %d, %d is : ",a,b,c);
        ob.show(ob.hcf(ob.getP(),ob.getQ()));
        
    }
}
