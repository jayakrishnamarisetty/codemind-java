import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r= new Scanner(System.in);
        int n=r.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}