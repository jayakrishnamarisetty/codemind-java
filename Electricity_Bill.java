import java.util.Scanner;
public class rug
  {
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        String d=r.nextLine();
        String e=r.nextLine();
        int a=r.nextInt();
        double c,t;
        if(a<200)
        {
            c=(a*1.20)+100;
        }
        else if(a>=200 && a<400)
        {
            c=(a*1.50)+100;
        }
        else if(a>=400 && a<600)
        {
            c=a*1.80;
            c=c+((c*15)/100);
        }
        else
        {
            c=a*2.00;
            c=c+((c*15)/100);
        }
        System.out.printf("%.2f",c);
    }
}