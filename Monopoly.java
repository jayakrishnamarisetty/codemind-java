import java.util.Scanner;
public class tri{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int jk=v.nextInt();
        for(int i=0;i<jk;i++)
        {
            int a=v.nextInt();
            int b=v.nextInt();
            int c=v.nextInt();
            if(a>b+c||b>c+a||c>b+a)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
    }
}