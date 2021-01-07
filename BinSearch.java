import java.util.*;
class BinSearch
{
    int arr[];
    int n;
    BinSearch(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for(int i=0;i<n;i++)
        {
            int max=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[max]>arr[j])
                    max=j;
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        
    }
    int bin_search(int l,int u,int v)
    {
        int mid=(l+u)/2;
        if(arr[mid]==v)
            return (mid+1);
        else if(mid==l)
            return -1;
        else if(arr[mid]<v)
            return bin_search(mid,u,v);
        else 
            return bin_search(l,mid,v);
           
            
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        BinSearch ob=new BinSearch(sc.nextInt());
        System.out.println("Enter the elements of the array");
        ob.fillarray();
        ob.sort();
        System.out.println("Enter the element to be searched");
        int a=ob.bin_search(0,ob.n,sc.nextInt());
        
        if(a==-1)
            System.out.println("The element was not found");
        else
        System.out.println("The index of element is "+a);
    }   
}