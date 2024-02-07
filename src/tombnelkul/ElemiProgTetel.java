/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombnelkul;

import java.util.Scanner;

/**
 *
 * @author KovácsIstvánGábor(SZ
 */
public class ElemiProgTetel {
    /* Magyarázat */
    //int szam = 7;
    //String str1 = "asd";
    //String str2 = new String("asd");
    static Scanner  sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /* Magyarázat */
        //System.out.println("szám: ");
        //int s = sc.nextInt();
        //System.out.println("s = " + (s + 3));
        /* Összegzés */
        /* Python kód */
        int n = -1;
        while (n<0){
            System.out.println("szám: ");
            n = sc.nextInt();
            //n = int(input("N= ")
        }
        int ossz = 0;
        for (int i=0; i<n+1; i++){
            ossz += i;
        }
        //System.out.println("Az első n db szám összege:" + ossz);
        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);
        
        /* Megszámlálás */
        int db = 0;
        for (int i=10; i<100; i++){
            if(i % 2 == 0){
                db++;
            }
        }
        System.out.printf("Kétjegyű párosok száma: %d\n",db);
        
        /* szélsőérték */
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE; //2147483647;
        int szam;
        //VEGE = -1;
        System.out.print(VEGE+"-ra/re kilép: ");
        while((szam = sc.nextInt()) != VEGE){
            if(szam < min){
                min = szam;
            }
            db++; //db += 1;
        }
        System.out.printf("%d számból a legkisebb: %d\n", db, min);
        
    }//main vége
    
}//class vége
