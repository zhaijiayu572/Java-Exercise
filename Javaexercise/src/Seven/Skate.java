package Seven;

/**
 * Created by tekiyowa on 2016/10/8.
 */
public class Skate {
    public static void main(String args[])
    {

        int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,0,3};
        int c=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                c++;
            }
        }
        int b[] = new int[c];
        int j=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                b[j]=a[i];
                System.out.println(b[j]);
                j++;
            }
        }
    }
}
