/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
*/

import java.util. Scanner;
public class  pat2
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j,num=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
              System.out.print(" "+num);
              num+=1;
            }
            System.out.println();
        }
    }
}
