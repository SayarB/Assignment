import java.util.*;
class LogMain
{
    public static void main(String [] args)
    {
        System.out.println("Number of users   :");
        int t=new Scanner(System.in).nextInt();
        String line[]=new String[t];
        LogRecords[] arr=new LogRecords[t];
        System.out.println("UserId\t\t" + "Login\t\t\t" + "Logout\t\t");
        System.out.println("\t\t"+"Time & Date\t"+"Time & Date\t");
        for(int i=0;i<t;i++)
        {
            String id,indate,intime,outdate,outtime;
            line[i]=new Scanner(System.in).nextLine();
            StringTokenizer st=new StringTokenizer(line[i]);
            id=st.nextToken();
            indate=st.nextToken();
            intime=st.nextToken();
            outdate=st.nextToken();
            outtime=st.nextToken();
            LogRecords a=new LogRecords(id,intime,indate,outtime,outdate);
            arr[i]=a;
        }
        
        
        System.out.println("UserId\t\t" + "Login\t\t" + "Logout\t\t"+"Duration");
        System.out.println("\t\t"+"Time & Date\t"+"Time & Date\t"+"Hours:Min");
        int max=0;
        int maxTime[]={0,0};
        for(int i=0;i<t;i++)
        {
            int a[]=DateTime.diff(arr[i].login,arr[i].logout);
            if(maxTime[0]<a[0])
            {
                max=i;
                maxTime[0]=a[0];
                maxTime[1]=a[1];
            }
            else if(maxTime[0] == a[0] && maxTime[1]<a[1])
            {
                max=i;
                maxTime[0]=a[0];
                maxTime[1]=a[1];
            }
            System.out.println(arr[i].userId+"\t\t"+arr[i].login.get()+"\t"+arr[i].logout.get()+"\t"+DateTime.format(a[0],":",a[1]));
        }
        System.out.println("The user who logged in for the longest duration:- ");
        
        System.out.println(arr[max].userId+"\t\t"+arr[max].login.get()+"\t"+arr[max].logout.get()+"\t"+DateTime.format(maxTime[0],":",maxTime[1]));
        
        
    }
}