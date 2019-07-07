import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userKing = 1- sc.nextInt();
        int userQueen = 1 - sc.nextInt();
        int userRooks = 2 - sc.nextInt();
        int userBishops = 2 - sc.nextInt();
        int userKnights = 2 - sc.nextInt();
        int userPawns = 8 - sc.nextInt();

        sc.close();
        System.out.println(userKing+" "+userQueen+" "+userRooks+" "+userBishops+" "+userKnights+" "+userPawns);
    }
}
