/*
1        1
12      21
123    321
1234  4321
1234554321
for n=5
  */

import java.util. Scanner;
public class  pat1
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j;
        int space=2*(n-1);
        for(i=1;i<=n;i++)
        {
             for(j=1;j<=i;j++)
        {
             System.out.print(j);
            
        }
            for(j=1;j<=space;j++)
            { 
            System.out.print(" ");

        }
        for(j=i;j>=1;j--)
        {
             System.out.print(j);
            
        }
        System.out.println();
        space-=2;
               }
            }
}
