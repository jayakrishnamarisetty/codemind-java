import java.util.*;
public class rugveda{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        char ch=r.next().charAt(0);
        
        if(ch>='A' && ch<='Z')
        {
            System.out.println("uppercase alphabet");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("lowercase alphabet");
        }
        else
        {
            System.out.println("not an alphabet");
        }
    }
}