
public class Complex {//start class
	double real;
	double imag;
	
	Complex(double real,double imag)//constructor
	{
		this.real=real;
		this.imag=imag;
	}
	double abs()
	{
		return Math.sqrt((real*real)+(imag*imag));
	}
	double Re()
	{
		return real;
	}
	double Im()
	{
		return imag;
	}
	public String toString()
	{
		return Double.toString(real)+" + i"+Double.toString(imag);
	}
	Complex plus(Complex b)
	{
		return new Complex(b.real+this.real,b.imag+this.imag);
	}
	Complex times(Complex b)
	{
		return new Complex((b.real*this.real)-(b.imag*this.imag),(this.real*b.imag)+(this.imag*b.real));
	}
	public static void main(String [] args)//main method
	{
		Complex a=new Complex(2.0,2.0);
		Complex b=new Complex(-2.0,-2.0);
		Complex sum=a.plus(b);
		Complex times=a.times(b);
		System.out.println("A= "+a.toString()+
		"\nMagnitude= "+a.abs()+
		"\nB= "+b.toString()+
		"\nMagnitude="+b.abs()+
		"\nSum= "+sum.toString()+
		"\nMultiply= "+times.toString());
	}//end of the main method

}//end of the class
