//Question2:In a program, input the side of a square. You have to output the are a of the square.
package basics;

import java.util.*;

public class basics_Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of a square");

        int a = sc.nextInt();

        int b = a * a;

        System.out.println("The area of circle is:" + b);

        sc.close();

    }
}
