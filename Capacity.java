import java.util.Scanner;
public class cap{
    public static void main(String args[])
    {
        Scanner v= new Scanner(System.in);
        int a,b,c,d;
        a=v.nextInt();
        b=v.nextInt();
        c=v.nextInt();
        d=a*b*c;
        System.out.printf("%d KB",d);
    }
}