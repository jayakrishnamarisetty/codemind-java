import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int n=r.nextInt();
        String[] a=new String[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = r.next();
        }
        int c=0;
        for (String element : a) {
            if (element.length() % 2 == 0) 
            {
                c++;
            } 
        }
        System.out.println(c);
    }
}