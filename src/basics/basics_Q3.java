//Question3:Enter cost of 3 items from the user (using float data type)- a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
package basics;

import java.util.*;

public class basics_Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of a pencil");
        float a = sc.nextFloat();

        System.out.println("Enter the cost of a pen");
        float b = sc.nextFloat();

        System.out.println("Enter the cost of a eraser");
        float c = sc.nextFloat();

        double sum = a + b + c;

        double bill = sum + (sum * 0.18);

        System.out.println("The total bill (Inclusive of 18% gst): " + bill);

        sc.close();
    }
}
