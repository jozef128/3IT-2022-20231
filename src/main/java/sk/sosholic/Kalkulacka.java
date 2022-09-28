package sk.sosholic;

import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Toto je moj prvy program s nazvom kalkulacka");
        System.out.println("tento program spocita dve zadane cisla");
        int exit = 1;
        while (exit != 0) ;
        {
            System.out.print("zadaj prve cislo a stlac enter: ");
            int scitanec1 = scanner.nextInt();
            System.out.print("zadaj druhe cislo a stlac enter: ");
            int scitanec2 = scanner.nextInt();
            System.out.println("vysledok scitania je: " + (scitanec1 + scitanec2));
            System.out.println("ukoncenie programu stlac 0 a enter.Pre pokracovanie stlac 1");
            exit = scanner.nextInt();
        }
    }
}