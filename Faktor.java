import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i = sc.nextInt()-1;
        int min = (a * i)+1;
        System.out.println(min);
    }
}
