/*
A
BB
CCC
DDDD
EEEEE
  */
import java.util. Scanner;
public class  pat15
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j;
        
        for(i=0;i<n;i++)
        {
            char ch=(char)('A'+i);
            for(j=0;j<=i;j++)
            
            {
                System.out.print(ch);
               
            }
             System.out.println();

        }
    }
}
