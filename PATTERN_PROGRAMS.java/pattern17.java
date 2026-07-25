/* for n=5
*****
*   *
*   *
*   *
*****
*/



import java.util. Scanner;
public class  pat7
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
              if(i==0||j==0||i==n-1||j==n-1)
              {
                  System.out.print("*");
              }
              else
              {
                  System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
