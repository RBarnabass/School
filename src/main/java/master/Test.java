package master;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int number = 10, ddd = 20;                // 4 byte
        long l = 1000000000000000L;     // 8 byte
        byte b = -128;
        short s = 32700;

        float f = 10.1F; // 4 byte
        double p = 10.1; // 8 byte

        char c = 'q';
        boolean b1 = true;

        String line = "Kate";

        int eee = (int) 101.200;

        int x = -10;
        int y = 20;
        boolean boo = ((x > 5) ^ (x < 10));

        int result = x >>> 1; // 00101001010

        double ttt = 10 % 2;


        System.out.println(ttt);
    }
}
