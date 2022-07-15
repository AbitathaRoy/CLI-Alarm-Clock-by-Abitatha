import java.util.*;

class saiCaptcha
{
    static Scanner sc = new Scanner(System.in);
    static char cc[][];
    static String ss[];
    static int flag;
    
    public static boolean Captcha()
    {
        char ran = cc[randomise2()][randomise2()];
        
        int c = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(ran == cc[i][j])
                {
                    c++;
                }
            }
        }
        
        ss = new String[c];
        int t = 0;
        while(t < c)
        {
            for(int i = 0; i < 5; i++)
            {
                for(int j = 0; j < 5; j++)
                {
                    if(ran == cc[i][j])
                    {
                        ss[t] = (i+1) + "." + (j+1);
                        t++;
                    }
                }
            }
        }
        
        System.out.println("Enter all the positions where character " + ran + " is located in the matrix.");
        System.out.println("Eg. Enter 1.1 for row 1 column 1, 2.4 for row 2 column 4.");
        
        t = 3;
        int u = 0;
        outer :
        while(t > 0)
        {
            String str = sc.nextLine();
            for(int i = 0; i < c; i++)
            {
                if(u == (c-1))
                {
                    System.out.println("Captcha successful!");
                    flag = 1;
                    return true;
                }
                
                //System.out.println(str);
                //System.out.println(ss[i]);
                
                if(str.equals(ss[i]))
                {
                    u++;
                    ss[i] = "abcdefghijkl";
                    continue outer;
                }
            }
            
            System.out.println("Your entry is either wrong or repeated. You have " + --t + " chances left.");
        }

        sc.close();
        
        System.out.println("Captcha failed!");
        flag = 0;
        return false;

    }
    
    public static void input()
    {
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                int t = randomise();
                cc[i][j] = (char)(t);
            }
        }
    }
    
    public static int randomise()
    {
        while(true)
        {
            int t = (int)(Math.random() * 100);
            if(t >= 65 && t <= 90)
                return t;
            else 
                continue;
        }
    }
    
    public static int randomise2()
    {
        while(true)
        {
            int t = (int)(Math.random() * 10);
            if(t >= 0 && t <= 4)
                return t;
            else 
                continue;
        }
    }
    
    public static void display()
    {
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 5; j++)
            {
                if(i == 0 && j == 0)
                {
                    System.out.print("   ");
                    continue;
                }
                else if(i == 0 && j != 0)
                {
                    System.out.print(j + "  ");
                }
                else if(i != 0 && j == 0)
                {
                    System.out.print(i + "  ");
                }
                else
                {
                    System.out.print(cc[i-1][j-1] + "  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    
    public static void Main()
    {
        cc = new char[5][5];
        
        input();
        display();
        Captcha();
    }
    
    public static void main(String args[])
    {
        Main();
    }
}

/** saiCaptcha 1.0
 * Designed by Abitatha Roy.
 * abitatharoy@gmail.com
 */