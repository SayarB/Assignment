import java.util.*;
class MatrixOctal
{
    void accept()//accepting input
    {
        int m,n,a[][];
        System.out.print("M = ");
        m=new Scanner(System.in).nextInt();
        System.out.println("\nN = ");
        n=new Scanner(System.in).nextInt();
        a=new int[m][n];
        if(m<=0 || m>=10 || n<2 || n>5)
        System.out.println("Out Of Range");
        else
        fillArray(a);
    }
    void fillArray(int a[][])// to fill the matrix
    {
        String arr[]=new String [a.length];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter Elements For Row "+(i+1)+": ");
            String k=new Scanner(System.in).nextLine();
            if(k.indexOf('8')>-1 || k.indexOf('9')>-1)
            {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            StringTokenizer st=new StringTokenizer(k);
            int n=st.countTokens();
            if(n!=a[i].length)
            {
                System.out.println("Array Out Of Bounds");
                i--;
            }else
            arr[i]=k;
        }
        for(int i=0;i<a.length;i++)
        {
            StringTokenizer st=new StringTokenizer(arr[i]);
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        System.out.println("Array>>>");
        display(a);
    }
    int octToDec(int a[])//changing the row of matrix to decimal from octal
    {
        int oct=0;
        for(int i=0;i<a.length;i++)
        {
            oct += a[i]*(int)Math.pow(8,a.length-i-1);
        }
        return oct;
    }
    void display(int a[][])//displaying the matrix
    {
        System.out.println("Filled Matrix\t\t\tDecimal Equivalent");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\t\t\t\t"+octToDec(a[i]));
        }       
    }
    public static void main(String [] args)
    {
        new MatrixOctal().accept();
    }
}//end the class