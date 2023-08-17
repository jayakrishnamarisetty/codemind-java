import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        if(a==0 && b%2==0) System.out.println("YES");
        else if(a!=0 && a%2==0 ) System.out.println("YES");
        else System.out.println("NO");
    }
}