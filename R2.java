import java.util.Scanner;

public class R2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int r1 = sc.nextInt();
         int s = sc.nextInt();
        System.out.println(r2(r1,s));


    }

    public static int r2 (int r1, int s) {
        if ((s >= -1000 || s >= 1000) || (r1 >=-1000 || r1 >=1000)){
            int r2 = (2 * s) - r1;
            return r2;
        }
        return -1;
    }
}
