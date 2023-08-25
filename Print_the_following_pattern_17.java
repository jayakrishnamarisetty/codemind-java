import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int numbers = num;
        for(int i = 1; i <= num; i ++)
        {
            for(int j = 1; j <= num; j ++)
            {
                if(i == j || j == num - i + 1)
                {
                    System.out.print(numbers+" ");
                }
                else{
                    System.out.print(" ");
                }
            }numbers -= 1;
            System.out.println();
        }
	}
}
