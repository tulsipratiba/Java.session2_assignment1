import java.util.Scanner;

public class Design1 {
	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter the number of rows=column"); // 
        
        int n = s.nextInt();
        
        int i, j; // variable of type intezer
        s.close();
        for (i = 1; i <= n; i++)  //increment the value of i till n
        {
            for (j = 1; j <= n; j++) // for loop begins when j=0 and runs till j <=n
            {
                if (j == i) 
                {
                    System.out.print("*"); //  if j=i then * will be output
                } else if (j == n - (i - 1)) 
                {
                    System.out.print("*");
                } else 
                {
                	
                    System.out.print("_");
                }
            }
            System.out.println();
            
        }}}