import java.util.Scanner;

public class Task5 {
    public static void isPolindrome(String str)
    {
        str = str.toLowerCase();


        if (isCheck(str) == 1)
        {
            System.out.println("Is polindrome");
        }
        else
        {
            System.out.println("Is not polindrome");
        }

    }
    public static int isCheck(String str)
    {
        char c =  str.charAt(0);
        int j = 0;
        for (int i = str.length() - 1; i >= str.length() / 2; i--)
        {
            if  (str.charAt(j) != str.charAt(i))
            {
                return 0;
            }
            j++;
        }
        return 1;
    }

}
