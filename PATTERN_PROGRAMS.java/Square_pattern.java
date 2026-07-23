/*this program prints the following pattern(for n=4):
* * * *
* * * *
* * * *
* * * *    */  
import java.util. Scanner;
public class  pat1
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
                System.out.print("* ");
              }
            System.out.println();
          }
    }
}
            
