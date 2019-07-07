import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();

        for (int i=0; i<n; i++){

            int p = sc.nextInt();
            sum += Math.pow(p/10, p%10);
            }

        System.out.println(sum);
        sc.close();
    }
}
