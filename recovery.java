import java.util.*;
class recovery
{
    public static void alarmm()
    {
        alarm2.choicee();
            
        switch(alarm2.option)
        {
            case 1 : saiCaptcha.Main();
                if(saiCaptcha.flag == 1)
                {
                    System.out.println("Thanks for using our alarm clock. Have a great day!");
                    System.out.println("Abitatha Roy, 2022. abitatharoy@gmail.com");
                    System.exit(24);
                }
                else
                {
                    System.out.println("Try again!");
                    alarmm();
                }
                break;
                    
            case 2 : try {
                Thread.sleep(30000);
                alarmm();
            }   
            catch(Exception e)
            {
                alarmm();
            }   
            default : System.out.println("Invalid Input!");
                alarmm();
        }
    }
}

/**
 * Created by Abitatha Roy.
 * abitatharoy@gmail.com
 */