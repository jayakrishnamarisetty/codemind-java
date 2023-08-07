import java.util.Scanner;
public class clim{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int t,i;
        t=v.nextInt();
        for(i=0;i<t;i++)
        {
            int a,b;
            a=v.nextInt();
            b=v.nextInt();
            if(a%b==0)
            {
                System.out.println(a/b);
            }
            else{
                int c=(int)a%b;
                System.out.println(c+(a/b));
            }
        }
    }
}