import java.util.*;
public class rug{
    public static void main(String args[]){
        Scanner r= new Scanner(System.in);
        int a=r.nextInt();
        int x=r.nextInt();
        int y=r.nextInt();
        int b=x*1;
        int c=y*2;
        if((c+b)>=a)
        {
            System.out.println("Qualify");
        }
        else
        {
            System.out.println("Not Qualify");
        }
    }
}