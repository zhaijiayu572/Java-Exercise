package Sixth;

/**
 * Created by tekiyowa on 2016/9/29.
 */
public class ShowVehicle {
    public static void main(String args[])
    {
        Vehicle v=new Vehicle(20,200);
        v.setSpeed(100);
        v.speedUp();
        v.speedDown();
    }
}
class Vehicle
{
    private int speed;
    private int size;
    Vehicle(int speed,int size)
    {
        this.size=size;
        this.speed=speed;
        System.out.println("现在速度是"+speed+"\n现在大小是"+size);
    }
    public void setSpeed(int speed)
    {
        this.speed=speed;
        System.out.println("现在速度是"+speed);
    }
    public void speedUp()
    {
        this.speed++;
        System.out.println("现在速度是"+speed);
    }
    public void speedDown()
    {
        this.speed--;
        System.out.println("现在速度是"+speed);
    }
}
