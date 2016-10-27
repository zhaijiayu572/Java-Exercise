package Eight.CompanySystem;

import java.util.*;

/**
 * Created by tekiyowa on 2016/10/11.
 */
public class Company {
    private ArrayList emplyeeinfo=new ArrayList();
    private Emplyee emplyee;
    //emplyeeinfo=new ArrayList();
    public void add(Emplyee emplyee)
    {

        emplyeeinfo.add(emplyee);
    }
    public void showinfo(int number)
    {
        for(int i=0;i<emplyeeinfo.size();i++)
        {
            Emplyee a=(Emplyee)emplyeeinfo.get(i);
            if(number==a.getNumber())
            {
                System.out.println("员工的姓名是"+a.getName()+"\n员工的工资为"+a.getWage());
            }
        }
    }
    public void setWage(int number,int wage)
    {
        for(int i=0;i<emplyeeinfo.size();i++)
        {
            Emplyee a=(Emplyee)emplyeeinfo.get(i);
            if(number==a.getNumber())
            {
                a.setWage(wage);
            }
        }
    }
    public void deleteEmplyee(int number)
    {
        for(int i=0;i<emplyeeinfo.size();i++)
        {
            Emplyee a=(Emplyee)emplyeeinfo.get(i);
            if(number==a.getNumber())
            {
                emplyeeinfo.remove(i);
            }
        }
    }
    public void sortEmpylee()
    {
        Emplyee empty=new Emplyee();
        int max=0;
        for(int i=0;i<emplyeeinfo.size()-1;i++)
        {
            Emplyee a=(Emplyee) emplyeeinfo.get(i);
            Emplyee b=(Emplyee) emplyeeinfo.get(i+1);
            for (int j=0;j<emplyeeinfo.size()-i-1;j++)
            {
                if(a.getWage()>b.getWage())
                {
//                    System.out.println(a.getWage());
//                    empty=a;
//                    a=b;
//                    b=empty;
                    emplyeeinfo.set(i,b);
                    emplyeeinfo.set(i+1,a);
                }
            }
        }
        for (int i=0;i<emplyeeinfo.size();i++)
        {
            Emplyee a=(Emplyee)emplyeeinfo.get(i);
            System.out.println(a.getNumber());
        }
    }
  public void showavg()
  {
      int sum = 0;
      for(int i=0;i<emplyeeinfo.size();i++)
      {
          Emplyee a=(Emplyee)emplyeeinfo.get(i);
          sum=sum+a.getWage();
      }
      double avg=sum/emplyeeinfo.size();
      System.out.println("平均工资为"+avg);
  }
  public void showMax()
  {
      int max = 0;
      for(int i=0;i<emplyeeinfo.size();i++)
      {
          Emplyee a=(Emplyee)emplyeeinfo.get(i);
          if(a.getWage()>max)
          {
              max=a.getWage();
          }
      }
      System.out.println("最高工资为"+max);
  }
}
