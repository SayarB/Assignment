public class DateTime {
    int hour;
    int min;
    int month;
    int day;
    static final int days[]= {31,28,31,30,31,30,31,31,30,31,30,31};
    public DateTime(String h,String m,String d,String mt){
        hour=Integer.parseInt(h);
        min=Integer.parseInt(m);
        month=Integer.parseInt(mt);
        day=Integer.parseInt(d);
        
    }
    static int[] diff(DateTime a,DateTime b){
        int hours=0;
        int minutes=0;
        int d=0;
        if(a.day>b.day)
            d=days[a.month-1]-a.day+b.day;        
        else        
            d=b.day-a.day;
        
        if(a.hour>b.hour){
            d--;
            hours=24-a.hour+b.hour;
        }
        else        
            hours=b.hour-a.hour;
        
        if(a.min>b.min)
        {
            hours--;
            minutes=60-a.min+b.min;
        }
        else        
            minutes=b.min-a.min;
        
            
        hours+= (24*d);
        
        
        return new int[]{hours,minutes};
    }
    static String format(int a,String regex,int b){
        String dif;
        if(a<10)
        {   
            dif="0"+ a+regex;
            
        }
        else
            dif= a+regex;
            
            
        if(b<10)
        {
            dif=dif+"0"+b;
        }
        else
        {
            dif=dif+""+b;
        }
        return dif;
    }
    public String get()
    {
        return (DateTime.format(hour, ":", min)+" "+DateTime.format(day, "-", month));
    }
    
}
