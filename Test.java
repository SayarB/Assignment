class Test
{
    public static void main(String [] args)
    {
        new Test().print2(2000);
    }
    void print(int n)
    {
        if(n>4000)
        return;
        System.out.print(" "+n);
        print(2*n);
        System.out.print(" "+n);
    }
    void print2(int n)
    {
        if(n>4000)
        return;
        System.out.print(" "+n--);
        print(2*n);
        System.out.print(" "+n--);
    }
}