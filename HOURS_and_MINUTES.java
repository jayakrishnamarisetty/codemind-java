import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        int a=r.nextInt();
        int b=a/60;
        int c=a%60;
        System.out.printf("%d Hour(s) %d Minute(s)",b,c);
    }
}