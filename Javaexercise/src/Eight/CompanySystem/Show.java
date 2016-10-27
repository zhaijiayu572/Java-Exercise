package Eight.CompanySystem;

/**
 * Created by tekiyowa on 2016/10/11.
 */
public class Show {
    public static void main(String args[])
    {
        Emplyee e1=new Emplyee(1,"xiaoli",100);
        Emplyee e2=new Emplyee(2,"xiaowang",300);
        Emplyee e3=new Emplyee(3,"xiaozhang",200);
        Company mycompany=new Company();
        mycompany.add(e1);
        mycompany.add(e2);
        mycompany.add(e3);
        mycompany.showinfo(2);
        mycompany.showavg();
        mycompany.setWage(3,200);
        mycompany.showinfo(3);
        mycompany.sortEmpylee();

    }
}
