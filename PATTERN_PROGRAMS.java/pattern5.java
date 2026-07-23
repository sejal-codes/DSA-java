/* this program prints the following pattern (for n=5)
* * * * *
* * * *
* * * 
* * 
*       */

import java.util. Scanner;
public class  pat2
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
          {
            for(j=0;j<n-i+1;j++)
              {
                System.out.print("* ");
              }
            System.out.println();
          }
    }
}
