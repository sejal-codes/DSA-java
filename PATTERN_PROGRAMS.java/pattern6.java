/* this program prints the following pattern (for n=5)
    *
   ***
  *****
 *******
*********

  */

import java.util. Scanner;
public class  pat2
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
          {
            for(j=1;j<=n-i-1;j++)
              {
                System.out.print(" ");
              }
            for(k=0;k<2*i+1;k++)
              {
                System.out.print("*");
              }
            System.out.println();
          }
    }
}
