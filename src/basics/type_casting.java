package basics;

import java.util.*;

public class type_casting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = 9.55f;

        int b = (int) a;

        System.out.println(b);

        char c = 'A';

        int d = (int) c;

        System.out.println(d);

        sc.close();
    }
}
