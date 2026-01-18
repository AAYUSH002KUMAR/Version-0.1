//Question1:In a program, input 3 numbers: A, B and C. You have to out put the average of these 3 numbers.
package basics;

import java.util.*;

public class basics_Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double average = (a + b + c) / 3;

        System.out.println("The average of 3 numbers is:" + average);

        sc.close();

    }
}
