import java.util.*;
public class rug{
    public static void main(String args[]){
        Scanner r = new Scanner (System.in);
        int n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
}