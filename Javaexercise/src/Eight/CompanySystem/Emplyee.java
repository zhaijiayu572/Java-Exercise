package Eight.CompanySystem;

/**
 * Created by tekiyowa on 2016/10/11.
 */
public class Emplyee {
    private int number;
    private String name;
    private int wage;
    public Emplyee()
    {

    }
    public Emplyee(int number,String name,int wage)
    {
        this.number=number;
        this.name=name;
        this.wage=wage;
    }
    public void setWage(int wage)
    {
        this.wage=wage;
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }
    public int getWage()
    {
        return wage;
    }
}
