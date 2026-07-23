/*  *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *   for n=5*/


import java.util.Scanner;

public class pat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        int i, j, k;
        for (i = 0; i < n; i++) {
            
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (k = 0; k < (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 0; i--) {
            
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
