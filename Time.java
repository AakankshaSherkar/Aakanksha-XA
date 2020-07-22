class Time
{
    private long hrs,min,sec,second;
    void accept(long hours,long minutes,long seconds)
    {
        hrs=hours;
        min=minutes;
        sec=seconds;
    }
    void Convert()
    {
        second=((hrs*3600)+(min*60)+(sec));
    }
    void showResult()
    {
        System.out.println("Time="+hrs+":"+min+":"+sec);
        System.out.println("Time in seconds="+second);
    }
    public static void main(String args[])
    {
        Time obj=new Time();
        obj.accept(2,30,1);
        obj.Convert();
        obj.showResult();
    } 
}  