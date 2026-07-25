/* prints the following pattern:
**********    for n=5
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
import java.util.Scanner;

public class pat10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        int i,j,k;
        int ini = 0;
        for (i=0;i<n;i++) {
            for(j=1;j<=n-i;j++) {
                System.out.print("*");
            }
            for(k=0;k<ini;k++) { 
                System.out.print(" ");
            }
            for(j=1;j<=n-i;j++) {
                System.out.print("*");
            }
            ini+=2;
            System.out.println();
        }
       
        int inis=2*(n-1); 
        
        for(i=1;i<=n;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(k=0;k<inis;k++) { 
                System.out.print(" ");
            }
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            inis-=2; 
            System.out.println();
        }
       
    }
}
