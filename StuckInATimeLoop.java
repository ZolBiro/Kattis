import java.util.Scanner;

public class StuckInATimeLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int i;

        if (n >=1 && n <=100){
            for (i=1; i <=n; i++){
                System.out.println(i + " Abracadabra");
            }
        }

    }
}
