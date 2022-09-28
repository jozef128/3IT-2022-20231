package sk.sosholic;

import java.util.Scanner;

public class VyberCisla {

    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);

        int exit = 1;

        while(exit!=0){


            System.out.println("Scitaj = 1 ");
            System.out.println("Odcitaj = 2 ");
            System.out.println("Vynasobenie = 3");
            System.out.println("Delenie = 4");

            int matematickaOperacia = scanner.nextInt();



        switch(matematickaOperacia) {
        case 1:
            System.out.println("Vloz cislo 1 : ");
            int cislo1 = scanner.nextInt();
            System.out.println("Vloz cislo 2 : ");
            int cislo2 = scanner.nextInt();
            System.out.println("Vysledok scitanca je " + " " + (cislo1= cislo1+cislo2));
            break;
        case 2:
            System.out.println("Vloz cislo 1 : ");
            int cislo3 = scanner.nextInt();
            System.out.println("Vloz cislo 2 : ");
            int cislo4 = scanner.nextInt();
            System.out.println("Vysledok odcitaj je " + " " + (cislo3= cislo3-cislo4));
            break;
        case 3:
            System.out.println("Vloz cislo 1 : ");
            int cislo5 = scanner.nextInt();
            System.out.println("Vloz cislo 2 : ");
            int cislo6 = scanner.nextInt();
            System.out.println("Vysledok vynasobenie je " + " " + (cislo5= cislo5*cislo6));
            break;
        case 4:
            System.out.println("Vloz cislo 1 : ");
            int cislo7 = scanner.nextInt();
            System.out.println("Vloz cislo 2 : ");
            int cislo8 = scanner.nextInt();
            System.out.println("Vysledok delenie je " + " " + (cislo7= cislo7/cislo8));
            break;
            default:
                System.out.println("!!!! Zly Vyber !!!! Zadaj Znova");
                continue;
        }
            System.out.println(" pre ukoncenie programu stlac 0 ");

            exit = scanner.nextInt();
        }
    }
}
