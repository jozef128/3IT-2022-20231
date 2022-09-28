package sk.sosholic;

import java.util.Scanner;

public class SystemIn1 {

        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            int exit = 1;
            while (exit!=0){
                System.out.println("Zadaj prve cislo a stlac enter: ");
                System.out.println("Zadaj druhe cislo a stlac enter: ");
                exit= scanner.nextInt();
            }



            Scanner scanner1 = new Scanner(System.in);
            int exits = 1;
            while (exits!=0){

                System.out.println("ukoncenie programu stlac 0 a enter: ");
                exits= scanner.nextInt();
            }



        }
      }

