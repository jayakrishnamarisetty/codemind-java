import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        int d=r.nextInt();
        if(a>=10 && b>=10 && c>=10 && d>=10)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}