import java.util.Scanner;

public class Ladder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int v = sc.nextInt();
        sc.close();

        // Convert to radians
        double vRadian = Math.toRadians(v);

        if ((h >=1 && h <=10000) && (v >=1 && v <=89) ){

            double length = h/Math.sin(vRadian);

            System.out.println((int)Math.ceil(length));
        } else {
            System.out.println("Error");
        }
    }
}
