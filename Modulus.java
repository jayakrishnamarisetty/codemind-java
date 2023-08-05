import java.util.Scanner;
public class disk{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a,b,c;
        a=v.nextInt();
        b=v.nextInt();
        c=a%b;
       
        System.out.println(c);
    }
}