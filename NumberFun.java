import java.io.IOException;
import java.util.Scanner;

public class NumberFun {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1 && n <=10000){

            for (int i=0; i<n; i++) {

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                // convert to double

                double doubleA = a;
                double doubleB = b;
                double doubleC = c;


                if ((doubleA + doubleB == doubleC) || (doubleA - doubleB == doubleC) || (doubleB - doubleA == doubleC || (doubleA * doubleB == doubleC) || (doubleA / doubleB == doubleC) || (doubleB / doubleA == doubleC))) {
                    System.out.println("Possible");
                } else {
                    System.out.println("Impossible");
                }
            }
        }
    }
}
