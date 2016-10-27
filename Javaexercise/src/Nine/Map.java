package Nine;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by tekiyowa on 2016/10/16.
 */
public class Map {
    public static void main(String args[])
    {
        HashMap champion=new HashMap();
        champion.put(1996,"a");
        champion.put(2000,"b");
        champion.put(2004,"c");
        champion.put(2008,"d");
        champion.put(2012,"e");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(champion.containsKey(year))
        {
            System.out.println("该年的冠军是"+champion.get(year));
        }
        else
        {
            System.out.println("该年没有比赛");
        }
    }
}
