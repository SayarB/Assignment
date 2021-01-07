import java.util.*;
class Wagon extends Automobile
{
    protected double weight;
    protected double duty;
    Wagon(String r,int l,double w)
    {
        super(r,l);
        weight=w;
        duty=0.0;
    }
    double CalEx()
    {
        double d=0.0;
        if(super.RName.equalsIgnoreCase("WEST"))
        {
            d= weight*0.095;
        }
        else if(super.RName.equalsIgnoreCase("EAST"))
        {
            d= weight*0.069;
        }
        else if(super.RName.equalsIgnoreCase("NORTH"))
        {
            d= weight*0.038;
        }
        else if(super.RName.equalsIgnoreCase("SOUTH"))
        {
            d= weight*0.088;
        }
        return d;
    }
    
    void display()
    {
        super.display();
        System.out.println("Weight - "+weight);
        System.out.printf("Duty - %.2f",duty);
    }
    
}