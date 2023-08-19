import java.util.*;
public class rug{
    public static void main(String args[]){
        Scanner r = new Scanner (System.in);
        int n=r.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
}