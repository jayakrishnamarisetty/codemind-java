import java.util.*;
public class rug{
    public static void main(String[] args)
    {
        Scanner r= new Scanner(System.in);
        int a,b,x;
        a=r.nextInt();
        b=r.nextInt();
        x=r.nextInt();
        if(a>b)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println((x/(b-a))+1);
        }
    }
} 