import java.io.*;
import javax.sound.sampled.*;

class music
{
    public static void alarmm(String alarmPath)throws IllegalArgumentException
    {
        try
        {
            File musicPath = new File(alarmPath);
            
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                
                alarm2.choicee();
            
                switch(alarm2.option)
                {
                    case 1 : saiCaptcha.Main();
                        if(saiCaptcha.flag == 1)
                        {
                            clip.stop();
                            System.out.println("Thanks for using our alarm clock. Have a great day!");
                            System.out.println("Abitatha Roy, 2022. abitatharoy@gmail.com");
                            System.exit(24);
                        }
                        else
                        {
                            clip.stop();
                            System.out.println("Try again!");
                            alarmm(alarm2.path);
                        }
                        break;
                    
                    case 2 : try {
                        clip.stop();
                        Thread.sleep(alarm2.snooze);
                        alarmm(alarm2.path);
                    }   
                    catch(Exception e)
                    {
                        clip.stop();
                        alarmm(alarm2.path);
                    }   
                    default : System.out.println("Invalid Input!");
                        clip.stop();
                        alarmm(alarm2.path);
                }
            }
            else
            {
                System.out.println("Can't find audio file.");
                recovery.alarmm();
                alarmm(alarm2.path);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

/**
 * Created by Abitatha Roy.
 * abitatharoy@gmail.com
 */