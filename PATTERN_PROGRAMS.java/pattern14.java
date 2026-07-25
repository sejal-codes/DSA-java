/*
 A
 A B
 A B C
 A B C D
 A B C D E
*/


import java.util. Scanner;
public class  pat3
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j;
        
        for(i=1;i<=n;i++)
        {
            char a=65;
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+a);
                a+=1;
            }
             System.out.println();

        }
    }
}
