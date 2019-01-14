package master;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();
        int z = myScanner.nextInt();
        int result;

        result = x*100+y*10+z;


        System.out.print(result);
    }
}
