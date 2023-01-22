/**
 Assignment 2
 Student Number : 109504501
 Course : CE1004-B
 */

import java.util.Scanner;

public class A2_109504501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a[] = sc.next().toCharArray();

        for(int i = 1; i < n; i++){
            System.out.print(" ".repeat(n-i));
            System.out.print(a[0]);
            for(int w = 1; w <= 2*(i-1); w++){
                System.out.print(a[1]);
            }

            System.out.print(a[0]);
            System.out.println();
        }
        for(int q = 1; q <= (2*n); q++){
            System.out.print(a[0]);
        }






    }
}
