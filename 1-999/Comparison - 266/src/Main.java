import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        int value = A.compareTo(B);
        if(value == 1)
            System.out.println(">");
        else if(value == 0)
            System.out.println("=");
        else
            System.out.println("<");
    }
}