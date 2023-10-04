
import java.util.*;
public class rug{
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        int b=r.nextInt();
        int max=0;
        int ved=0;
        for(int i=a;i<=b;i++){
           int n=i;
           int c=0;
            while(n!=1){
                if(n%2==0){
                    n/=2;
                    c++;
                }
                else{
                    n=3*n+1;
                    c++;
                }
            }
            if(max<c){
                    max=c;
                    ved=i;
                }
        }
        System.out.println(ved);
    }
}