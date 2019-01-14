package master;

public class Triangle {

    private int a;
    private int b;
    private int c;
    private int square;

    public int getSquare() {

        return calcSquare();
    }

    private int calcSquare() {

        square = a * b * c;

        return square;
    }
}
