import java.util.*;
public class Traversal {
    int arr[][];//array to store elements
    int sumA=0;//sum of elements visited by Mr. A
    
    int sumB=0;//sum of elements visited by Mr. B
    public Traversal()//constructor
    {
        arr=new int[4][4];
        
    }
    void accept()
    {
        System.out.println("Enter a position");
        String[] a=new Scanner(System.in).nextLine().split(",");
        a[0].trim();
        a[1].trim();
        int i=Integer.parseInt(a[0]);
        int j=Integer.parseInt(a[1]);
        System.out.println("Enter another position");
        String[] b = new Scanner(System.in).nextLine().split(",");
        b[0].trim();
        b[1].trim();
        int k=Integer.parseInt(b[0]);
        int l=Integer.parseInt(b[1]);
        //now setting up the preferences for traversal
        int apath[];
        int bpath[];
        if(i>k)
        
            apath=Apath(k,l,i,j);//elements visited by Mr. A
            
        
        else if(i==k)
        {
            if(j<l)
                apath=Apath(i,j,k,l);
            else
                apath=Apath(k,l,i,j);  
        }
        else
            apath=Apath(i,j,k,l);
        if(j<l)
            bpath=Bpath(i,j,k,l);
        else if(l==j)
            if(i<k)
                bpath=Bpath(i,j,k,l);
            else
                bpath=Bpath(k,l,i,j);
        else
            bpath=Bpath(k,l,i,j);
        sumA=sumB=0;
        System.out.println("The Numbers visited by Mr. A ==>");
        for(int m=0;m<apath.length;m++)
        {
            System.out.print(apath[m]+",");
            sumA+=apath[m];
        }
        System.out.println("\n Sum of numbers visited:"+sumA);
        System.out.println("The Numbers visited by Mr. B ==>");
        for(int m=0;m<bpath.length;m++)
        {
            System.out.print(bpath[m]+",");
            sumB+=bpath[m];
        }
        System.out.println("\n Sum of numbers visited:"+sumB);
        System.out.println("the numbers visited by both are:");
        for(int m=0;m<apath.length;m++)
        {
            if(found(apath[m],bpath))
            {
                System.out.println(apath[m]);
            }
        }
        
    }
    boolean found(int n,int[] a)//linear search
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
                return  true;
        }
        return false;
    }
    void fillArray()//to fill the matrix
    {
        System.out.println("Enter the elements of array without repetition");
        for(int i=0;i<arr.length;i++)
        {
            String[] a = new Scanner(System.in).nextLine().split(" ");
            for(int j=0;j<a.length && j<arr[i].length;j++)
            {
                arr[i][j]=Integer.parseInt(a[j].trim());
            }
        }
        
    }
    
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
    int[] Apath(int i,int j,int k,int l)//finds path of Mr. A
    {
        int a[]=new int[(5-j+l)+((k-i-1)*4)];
        int count=0;
        for(int m=j-1;m<4;m++)
        {
            a[count++]=arr[i-1][m];
        }
        for(int m=i;m<k-1;m++)
        {
            for(int n=0;n<4;n++)
            {
                a[count++]=arr[m][n];
            }
        }
        for(int m=0;m<l;m++)
        {
            a[count++]=arr[k-1][m];
        }
        return a;
    }
    int[] Bpath(int i,int j,int k,int l)//finds path of Mr. B
    {
        
        System.out.println(i+" "+j+" "+k+" "+l);
        int a[]=new int[(5-i+k)+(l-j-1)*4];
        int count=0;
        for(int m=i-1;m<4;m++)
        {
            a[count++]=arr[m][j-1];
        }
        for(int m=j;m<l-1;m++)
        {
            
            for(int n=0;n<4;n++)
            {
                a[count++]=arr[n][m];
            }
        }
        for(int m=0;m<k;m++)
        {
            a[count++]=arr[m][l-1];
        }
        return a;
    }
    public static void main(String[] args)//main method
    {
        Traversal ob=new Traversal();
        ob.fillArray();
        ob.accept();
    }
}//end of class
    
    