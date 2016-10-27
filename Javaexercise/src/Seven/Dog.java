package Seven;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dog {
    public static void main(String args[]) {
        LittleDog mydog[]=new LittleDog[4];
        mydog[0]=new LittleDog("花花",4.5);
        mydog[1]=new LittleDog("白白",5.6);
        mydog[2]=new LittleDog("黑黑",7.8);
        mydog[3]=new LittleDog("红红",9.0);
        double avgWeight=(mydog[1].getWeght()+mydog[2].getWeght()+mydog[3].getWeght()+mydog[0].getWeght())/mydog.length;
        System.out.println("狗的平均体重是"+avgWeight);
        double maxWeight=mydog[0].getWeght();
        String maxName=mydog[0].getName();
        for(int i=1;i<mydog.length;i++)
        {
                if(maxWeight<mydog[i].getWeght())
                {
                    maxWeight=mydog[i].getWeght();
                    maxName=mydog[i].getName();
                }
        }
        System.out.println("最大狗的体重为"+maxWeight+"\n名字为"+maxName);
        double minWeight=mydog[0].getWeght();
        String minName=mydog[0].getName();
        for(int i=1;i<mydog.length;i++)
        {
            if(minWeight>mydog[i].getWeght())
            {
                minWeight=mydog[i].getWeght();
                minName=mydog[i].getName();
            }
        }
        System.out.println("最小狗的体重为"+minWeight+"\n名字为"+minName);
        System.out.println("请输入狗的名字");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String dogName= null;
        try {
            dogName = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0;i<mydog.length;i++)
        {
            if(dogName.equals(mydog[i].getName()))
            {
                System.out.println("狗的体重为"+mydog[i].getWeght());
            }
        }
    }
}
class LittleDog
{
    private String name;
    private double weight;
    public LittleDog(String name,double weight)
    {
        this.name=name;
        this.weight=weight;
    }
    public String getName()
    {
        return name;
    }
    double getWeght()
    {
        return weight;
    }
}
