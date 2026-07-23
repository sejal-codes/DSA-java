/* 
*********
 *******
  *****
   ***
    *
*/

import java.util.Scanner;
public class  pat6
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
              System.out.print(" ");
             
            }
          for(k=0;k<2*(n-i)-1;k++)
            {
              System.out.print("*");
            }
            System.out.println();
        }
    }
}
