import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int n=r.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum += i;
            
        }
        System.out.println(sum);
    }
}