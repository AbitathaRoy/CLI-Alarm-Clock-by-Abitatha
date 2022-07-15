import java.util.*;
class datee
{
    static int di, moi, yi;
    static String date1, date2;
    static int hi, mi, si;
    static String time1, time2;
    static int aa[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 20, 31};
    static int bb[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 20, 31};
    static Scanner sc = new Scanner(System.in);
    
    public static void setDate()
    {
        //Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the date of alarm (DD/MM/YYYY):");
        di = sc.nextInt();
        moi = sc.nextInt();
        yi = sc.nextInt();
        
        if(di >= 1 && di <= leapcheck() && moi >= 1 && moi < 13)
        {
            System.out.println("Alarm set on :");
            System.out.println(finDate(di, moi, yi));
            System.out.println();
        }
        else if(di == -1 && moi == -1 && yi == -1)
            System.exit(24);
        else
        {
            System.out.println("Invalid time! Try again. Or enter DD = -1, MM = -1 & YYYY = -1 to exit the app.");
            setDate();
        }

        //sc.close();
    }
    
    public static String finDate(int d, int mo, int y)
    {
        date1 = String.format("%02d/%02d/%04d", d, mo, y);
        return date1;
    }
    
    public static int leapcheck()
    {
        if(yi % 4 == 0 || yi % 400 == 0)
            return bb[moi];
        else
            return aa[moi];
    }

    public static void setTime()
    {
        //Scanner in = new Scanner(System.in);
        
        System.out.println("Set the alarm at (HH/MM/SS)?");

        hi = sc.nextInt();
        mi = sc.nextInt();
        si = sc.nextInt();
        
        if(hi >= 0 && hi < 24 && mi >= 0 && mi < 60 && si >= 0 && si < 60)
        {
            System.out.println("Alarm set at :");
            System.out.println(finTime(hi, mi, si));
            System.out.println();
        }
        else if(hi == -1 && mi == -1 && si == -1)
            System.exit(24);
        else
        {
            System.out.println("Invalid time! Try again. Or enter HH = -1, MM = -1 & SS = -1 to exit the app.");
            setTime();
        }

        //in.close();
    }

    public static String finTime(int h, int m, int s)
    {
        time1 = String.format("%02d:%02d:%02d", h, m, s);
        return time1;
    }
}

/**
 * Created by Abitatha Roy.
 * abitatharoy@gmail.com
 */