package sk.sosholic;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class SystemIn {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("zadaj meno a stlac enter");
        MojeMeno mojeMeno = new MojeMeno("Jozef ", "Pradlovsky");

        String meno = scanner.nextLine();

        System.out.println("Priezvisko");
        String Priezvisko = scanner.nextLine();


        for(int y = 1;y<11;y++){

            if(y%2==0){
                System.out.println(meno + " " + Priezvisko + " " + y + " ");
            }
        }

    }
}
