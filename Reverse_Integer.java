import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        int n=r.nextInt();
        int temp=0;
        while(n!=0)
        {
            int rem=n%10;
            temp=rem+temp*10;
            n=n/10;
        }
        System.out.print(temp+" ");
    }
}