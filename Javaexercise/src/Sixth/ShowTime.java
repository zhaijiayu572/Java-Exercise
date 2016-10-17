package Sixth;

/**
 * Created by tekiyowa on 2016/9/29.
 */
public class ShowTime {
    public static void main(String args[])
    {
        MyTime time=new MyTime(14,2,35);

        time.display();
        int a=10;
        time.addsecond(a);
        time.display();
    }
}
class MyTime
{
    private int hour;
    private int minute;
    private int second;
    MyTime(int hour,int minute,int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void display()
    {
        System.out.println(hour+":"+minute+":"+second);
    }
    public void addhour()
    {
        this.hour++;
    }
    public void addminute()
    {
        this.minute++;
    }
    public void addsecond(int a)
    {
        this.second=a;
    }

    public void subhour()
    {
        this.hour--;
    }
    public void subminute()
    {
        this.minute--;
    }
    public void subsecond()
    {
        this.second--;
    }
}