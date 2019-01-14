package master;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static void main(String[] args) {

        String[] mass = new String[10];

        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {

            mass[i] = i + "s";
        }

        for (String mas : mass) {

            System.out.println(mas);
        }

        System.out.println(mass.length);
        int i = 0;

        do {

            System.out.println(i++);

        } while (i < mass.length);



    }
}
