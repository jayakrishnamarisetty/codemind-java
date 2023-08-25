import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int i=0;i<n;i++)
        {
            String a=r.next();
            int d=Integer.parseInt(a,8);
            System.out.println(Integer.toString(d,2));
        }
    }
}