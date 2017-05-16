import java.util.Scanner;

public class Design1 {
	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rows=column");
        int n = s.nextInt();
        int i, j;
        s.close();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else if (j == n - (i - 1)) {
                    System.out.print("*");
                } else 
                {
                	
                    System.out.print("_");
                }
            }
            System.out.println();
            
        }}}