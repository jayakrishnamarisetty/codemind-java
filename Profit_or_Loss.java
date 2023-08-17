import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        if(a<b)
        {
            System.out.println("Profit");
        }
        else if(a==b)
        {
            System.out.println("No profit and No loss");
        }
        else{
            System.out.println("Loss");
        }
    }
}