import java.util.*;
public class rug{
    public static void main(String args[])
    {
        Scanner r = new Scanner(System.in);
        int a=r.nextInt();
        if(a%9==0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}