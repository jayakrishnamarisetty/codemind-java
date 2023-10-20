import java.util.Scanner;
public class rug{
    public static void main(String[]Args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int pos = (int) n / 2;
        String ans = "False";
        for(int i = 0; i < pos; i++){
            for(int j = 0; j <pos; j++){
                if(i == j){
                    continue;
                }
                if(i * i + j * j == n){
                    ans = "True";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}