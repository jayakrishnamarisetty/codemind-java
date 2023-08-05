import java.util.Scanner;
public class disk{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a,b;
        a=v.nextInt();
        b=(a*(a-1))/2;
       
        System.out.println(b);
    }
}