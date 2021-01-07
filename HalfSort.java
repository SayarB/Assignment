class HalfSort
{
    void halfSort(int a[])
    {
        int mid=(a.length-1)/2;
        
        for(int i=0;i<mid;i++)
        {
            for(int j=0;j<mid-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            
        }
        for(int i=mid+1;i<a.length;i++)
        {
            for(int j=mid+1;j<a.length-i+mid;j++)
            {
                if(a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        
    }
    void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
    
}