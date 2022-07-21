import java.util.*;

import java.text.*;
public class alarm2
{
    static String note = "Wake Up!";
    static String path;
    static int option;
    static long snooze;
    static Scanner sc = new Scanner(System.in);
    
    public static boolean current()
    {
        //Scanner sc = new Scanner(System.in);
        Date currentDate = new Date();
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        datee.time2 = timeFormat.format(currentDate);
        //System.out.println(time2);
            
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        datee.date2 = dateFormat.format(currentDate);
        //System.out.println(date2);
            
        if(datee.date1.equals(datee.date2) && datee.time1.equals(datee.time2))
        {
            music.alarmm(path);
            return true;
        }
        else
            return false;
    }
    
    public static void choicee()
    {
        System.out.println(alarm2.note);
        System.out.println("1. Stop Alarm");
        System.out.println("2. Snooze");
        option = sc.nextInt();
    }
    
    public static void main(String args[])
    {
        datee.setDate();
        
        datee.setTime();

        System.out.println("Enter a wake up note ('Wake Up!' to skip) :");
        alarm2.note = sc.nextLine();
        System.out.println("Enter the path to the audio file you want to set as the alarm tone :");
        path = sc.nextLine();
        System.out.println("Enter the snooze duration each time you snooze the alarm (in seconds):");
        snooze = sc.nextInt() * 1000;
        System.out.println();

        //datee.setDate();
        
        while(current() == false)
            current();
    }
}


/**
 * Created by Abitatha Roy.
 * abitatharoy@gmail.com
 */