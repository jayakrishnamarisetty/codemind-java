import java.util.*;
public class rugveda{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int c=r.nextInt();
        int d=r.nextInt();
        int e=r.nextInt();
        int p=(a+b+c+d+e)/5;
        if(p>=90)
        {
            System.out.printf("Grade A");
        }
        else if(p>=80 && p<=90)
        {
            System.out.printf("Grade B");
        }
        else if(p>=70 && p<=80)
        {
            System.out.printf("Grade C");
        }
        else if(p>60 && p<70)
        {
            System.out.printf("Grade D");
        }
        else if(p>40 && p<60)
        {
            System.out.printf("Grade E");
        }
        else 
        {
            System.out.printf("Grade F");
        }
    }
}