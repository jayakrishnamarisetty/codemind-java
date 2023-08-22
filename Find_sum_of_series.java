import java.util.*;
public class series{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        double a=r.nextInt();
        double sum=0,m;
        for(double i=1;i<=a;i++)
        {
            m=1/i;
            sum+=m;
        }
        System.out.printf("%.2f",sum);
        
    }
}