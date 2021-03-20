import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int [] frekvence = new int[7];

        for(int i=0; i<100; i++){
            ++frekvence[random.nextInt(7)];

        }
        int g=0;
        for (int j=0;j<frekvence.length;j++){
            System.out.println(frekvence[j]);
            g+=frekvence[j];
        }
        System.out.println(g);


        for (char let = 'A'; let<='Z'; let++){
            String l = "" + let + "";
            System.out.print(let + "" + l.toLowerCase() + " ");
        }

        System.out.println();
        char k = 65;
        System.out.println(k);
    }


}
