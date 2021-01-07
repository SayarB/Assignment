import java.util.*;
public class LogRecords {
	int userId;
	DateTime login;
	DateTime logout;
	LogRecords(String id,String indate,String intime,String outdate,String outtime)
	{
		userId=Integer.parseInt(id);
		String a[]=indate.split("-");
		String b[]=outdate.split("-");
		String c[]=intime.split(":");
		String d[]=outtime.split(":");
		login=new DateTime(c[0],c[1],a[0],a[1]);
		logout=new DateTime(d[0],d[1],b[0],b[1]);
		
		
		
	}
	public void print()
	{
		System.out.println(userId+"\t\t"+login.get()+"\t"+logout.get()+"\t"+DateTime.diff(login,logout));
	}
	
}
