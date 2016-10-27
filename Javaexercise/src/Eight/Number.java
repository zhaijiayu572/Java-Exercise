package Eight;

import java.util.Scanner;

/**
 * Created by tekiyowa on 2016/10/11.
 */
public class Number {
    public static void main(String args[])
    {
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                Scanner scanner=new Scanner(System.in);
                a[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
