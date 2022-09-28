package sk.sosholic;
import java.util.Scanner;
public class hadaniecisla {

    public static void
    guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);


        int number = 1 + (int)(10000
                * Math.random());

        int K = 10;

        int i, guess;

        System.out.println(
                "Najdi cislo " + " 1 medzi 10 000." + "Typni cislo" + " Mas 10 pokusov .");
        for (i = 0; i < K; i++) {

            System.out.println(
                    "Typni cislo:");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println(
                        "Gratulujem!" + " Nasiel si cislo.");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "Cislo je " + "Vacsie ako " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "Cislo je " + " mensie nez " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                    "Vycerpal si pokusy " + " K trials.");

            System.out.println(
                    "Cislo je : " + number);
        }
    }

    public static void
    main(String arg[])
    {

        guessingNumberGame();
    }
}