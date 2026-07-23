/* this program prints the following pattern (for n=5)
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */

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
            for(j=1;j<=i;j++)
              {
                System.out.print(i+" ");
              }
            System.out.println();
          }
    }
}
