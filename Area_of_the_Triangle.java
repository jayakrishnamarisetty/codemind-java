import java.util.Scanner;
public class tri{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        double a,b,c;
        double s, d;
        
        a=v.nextInt();
        b=v.nextInt();
        c=v.nextInt();
        s=(a+b+c)/2;
        d=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",d);
    }
}