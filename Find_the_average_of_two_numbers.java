import java.util.Scanner;
public class avg{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int a,b;
        float c;
        a=v.nextInt();
        b=v.nextInt();
        c=(float)(a+b)/2;
        System.out.println(String.format("%.4f",c));
        
    }
}