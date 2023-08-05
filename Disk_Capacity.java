import java.util.Scanner;
public class disk{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a,b,c,d;
        a=v.nextInt();
        b=v.nextInt();
        c=v.nextInt();
        d=a*b*c*512*2;
        System.out.println(d);
    }
}