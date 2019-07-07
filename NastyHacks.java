import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NastyHacks {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(bf.readLine());

        while (cases != 0){
            cases--;

            String [] input;

            input = bf.readLine().split(" ");

            int noAdvertise = Integer.parseInt(input[0]);
            int advertise = Integer.parseInt(input[1]);
            int advertiseCost = Integer.parseInt(input[2]);

            int difference = advertise - advertiseCost;

            if (noAdvertise < difference){
                System.out.println("advertise");
            } else if (noAdvertise == difference){
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
         bf.close();
    }
}
