package master;

import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String string = myScanner.next();
        int quantity = string.length();
        if (string.contains("a"))
        {System.out.println("input "+string);}

        char[] chars = new char[quantity];
        for (int i = 0; i < quantity; i++) {
            char c = string.charAt(i);
            chars[i] = c;
        }

        chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!Character.isAlphabetic(chars[i])) {
                System.out.println("letter - " + chars[i]);
            }
        }
    }

}

