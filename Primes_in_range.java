import java.util.*;
public class rug{
    public static Boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}