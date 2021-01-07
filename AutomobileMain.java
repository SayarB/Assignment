class AutomobileMain
{
    public static void main(String[] args)
    {
        Wagon ob=new Wagon("WEST",1234,1405.5);
        ob.duty=ob.CalEx();
        ob.display();
    }
}