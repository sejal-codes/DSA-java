/*
*
**
***
****
*****
****
***
**
*

  for n=5 */

import java.util.Scanner;

public class pat9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int i, j;

        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        for (i = n - 1; i >= 1; i--) {
            
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        sc.close();
    }
}
