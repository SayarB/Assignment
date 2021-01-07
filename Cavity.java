import java.util.*;
public class Cavity {//satrting class
    void accept(){//start method        
        int m=new Scanner(System.in).nextInt();
        int n=new Scanner(System.in).nextInt();
        int arr[][]=new int[m][n];
        System.out.print("Input Array: ");
        for(int i=0;i<m;i++)
        {
            String k=new Scanner(System.in).nextLine();
            StringTokenizer st=new StringTokenizer(k);
            for(int j=0;j<n;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        int ans=0;
        System.out.println("Output:");       
        for(int i=0;i<m;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
                
                if(isCavity(i,j,arr))
                {
                    ans++;
                }
            }
            System.out.println();
        }
        System.out.println("\nNo. of Cavity= "+ans);      
    }
    boolean isCavity(int i,int j,int arr[][]){//starting method
        int m=arr.length;
        int n=arr[0].length;
        if(i>0 && j>0 && arr[i-1][j-1]<=arr[i][j])
        {
            return false;
        }
        if(i>0  && arr[i-1][j]<=arr[i][j])
        {
            return false;
        }if(i>0 && j<n-1 && arr[i-1][j+1]<=arr[i][j])
        {
            return false;
        }if(j>0 && arr[i][j-1]<=arr[i][j])
        {
            return false;
        }if(j<n-1 && arr[i][j+1]<=arr[i][j])
        {
            return false;
        }if(i<m-1 && j>0 && arr[i+1][j-1]<=arr[i][j])
        {
            return false;
        }if(i<m-1  && arr[i+1][j]<=arr[i][j])
        {
            return false;
        }if(i<m-1 && j<n-1 && arr[i+1][j+1]<=arr[i][j])
        {
            return false;
        }
        return true;
    }//end the method
    public static void main(String args[])//starting main method
    {
        new Cavity().accept();
    }//end the main method
}//end the class
