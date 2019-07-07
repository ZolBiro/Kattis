import java.util.Scanner;

public class QuadrantSelection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(quadrant(x,y));
    }

    public static int quadrant (int x, int y){

        if ( (x ==0 || x <-1000 || x >1000) || (y ==0 || y <-1000 || y >1000)){
            return 0;
        } else if ( x >0 && y >0){
            return 1;
        } else if ( x <0 && y >0){
            return 2;
        } else if ( x <0 && y <0){
            return 3;
        } else {
            return 4;
        }


    }
}


