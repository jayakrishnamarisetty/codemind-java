import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        if((a/30)>=b)
        {
            System.out.println("YES");
        }
        
        else{
            System.out.println("NO");
        }
    }
}