package Sixth;

/**
 * Created by tekiyowa on 2016/9/29.
 */
public class ShowPeople {
    public static void main(String args[])
    {
        Employeee em=new Employeee();
        Employeee em2=new Employeee(30);
        em.play();
        em.sing();
        Manager m=new Manager();
        System.out.println(m.vehicle);
    }
}
abstract class Role
{
    private String name;
    private String sex;
    int age;
    Role(){}
    Role(int age)
    {
        this.age=age;
        System.out.println("年龄为"+age);
    }
    public void setRole(String name,String sex,int age)
    {
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    public void getRole()
    {
        System.out.println("这是一个"+age+"岁名字为"+name+"的"+sex+"人");
    }
    abstract void play();
}
class Employeee extends Role
{
    static private int ID=1;
    Employeee()
    {
        super(20);
        ID++;
        System.out.println("不带参数的年龄"+age);
        System.out.println("我是静态变量，我的值是"+ID);
    }
    Employeee(int age)
    {
        this.age=age;
        ID++;
        System.out.println("带参数的年龄"+age);
        System.out.println("我是静态变量，我的值是"+ID);

    }
    public void play()
    {
        System.out.println("我是新的play函数");
    }
    final void sing()
    {
        System.out.println("我是final方法，无法被更改，也无法被继承");
    }
}
class Manager extends Employeee
{
    final int vehicle=1;
}
