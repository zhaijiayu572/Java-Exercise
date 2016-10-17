package Sixth;

/**
 * Created by tekiyowa on 2016/9/29.
 */
public class ShowDoor {
    public static void main(String args[])
    {
        Imen i=new Door();
        i.bulletproof();
        i.fireproof();
        i.rustproof();
        i.threfproof();
        i.waterproof();
        Door d=new Door();
        d.openDoor();
        d.closeDoor();
    }
}
interface Imen
{
    public void threfproof();
    public void waterproof();
    public void fireproof();
    public void bulletproof();
    public void rustproof();
}
class Door implements Imen
{
    public void threfproof()
    {
        System.out.println("我可以防盗");
    }
    public void waterproof()
    {
        System.out.println("我可以防水");
    }
    public void fireproof()
    {
        System.out.println("我可以防火");
    }
    public void bulletproof()
    {
        System.out.println("我可以防弹");
    }
    public void rustproof()
    {
        System.out.println("我可以防毒");
    }
    public void openDoor()
    {
        System.out.println("门开了");
    }
    public void closeDoor()
    {
        System.out.println("门关了");
    }
}
