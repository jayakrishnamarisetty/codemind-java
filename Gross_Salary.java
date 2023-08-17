import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        double b;
        if(a<=10000)
        {
            b=a+a*0.8+a*0.2;
            System.out.printf("%.2f",b);
        }
        else if(a<=20000)
        {
            b=a+a*0.9+a*0.25;
            System.out.printf("%.2f",b);
        }
        else if(a>20000)
        {
            b=a+a*0.95+a*0.3;
            System.out.printf("%.2f",b);
        }
    }
}