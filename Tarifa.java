import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // megaBytes per month
        int x = sc.nextInt();
        //number of month
        int n = sc.nextInt();

        int sum = 0;

        for (int i=0; i<n; i++){

            int p = sc.nextInt();

            sum += x-p;
        }
        System.out.println(x + sum);
        sc.close();
    }
}
