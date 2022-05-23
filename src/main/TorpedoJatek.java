
package main;

import java.util.Random;
import java.util.Scanner;

public class TorpedoJatek {

    public static void main(String[] args) {
        Random rnd = new Random();
        int kezd = rnd.nextInt(5);
        Hajo hajo = new Hajo(new int[]{kezd,(kezd+1),(kezd+2)});
        Scanner scn = new Scanner(System.in);
        int lovesSzam = 0;
        int talalat = 0;
        do {
            
            System.out.println("Adjon meg egy szám 1-7 között:");
            int beTipp = scn.nextInt();
            /*scanner int után string beolvásásra megoldás*/
//            scn.skip("\n");
//            System.out.println("be szöveg");
//            String a = scn.nextLine();
            
            
            
            lovesSzam++;
            String valasz = hajo.talalat(beTipp);
            System.out.println(valasz);
            if(valasz.equals("talált")){
                talalat++;
            }
        } while (!(talalat == 3));
        System.out.printf("Süllyedt %d lövésből\n", lovesSzam);
    }
    
}
