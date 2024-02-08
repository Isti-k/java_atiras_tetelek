package tombnelkul;

import java.util.Scanner;

public class ElemiProgtetel {

	/*
	Az osztály (Scanner) egy példánya (sc), az objektum (sc).
	A példányosítás a konstruktor függvénnyel (Scanner()) történik.
	A konstruktor megegyezik az osztály nevével és a new operátor mögött áll.
	*/
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* ÖSSZEGZÉS */
        /** Python kód: */
//        n = -1
//        while n < 0:
//            n = int(input("N= "))
//        }
//        ossz = 0
//        for i in range(n+1):
//            ossz += i
//
//        print(ossz)
        /** Java kód: */
        //bekérés, nem a tétel része:
        int n = -1;
        while (n < 0){
            System.out.print("N=");
            n = sc.nextInt();
        }
        //tétel:
        int ossz = 0;
        for (int i = 0; i < n+1; i++){
            ossz += i;
        }
        
        /* kiírások lehetőségei: */
        /*a*///System.out.println("Az első n szám összege: " + ossz);
        /*b*///System.out.println("Az első "+n+" szám összege: " + ossz);
        /*c*///System.out.print("Az első ");
        //System.out.print(n);
        //System.out.println(" szám összege: " + ossz);
        /*d*/System.out.printf("Az első %d szám összege: %d\n", n, ossz);
        
        /* ÖSSZEGZÉS vége*/
/*--------------------------------------------------*/
        /* MEGSZÁMLÁLÁS */
        /** Python kód: */
//        db = 0
//        for i in range(10, 100)):
//            if i % 2 == 0: 
//                db++;
//        print(db)
        /** Java kód: */
        int db = 0;
        for(int i=10; i<100; i++){
            if(i % 2 == 0){ 
                db++;
            }
        }
        
        System.out.printf("kétjegyű párosak száma: %d\n",db);
        /* MEGSZÁMLÁLÁS vége*/
/*--------------------------------------------------*/
        /* MINIMUMKIVÁLASZTÁS - Szélsőérték keresése */
        /** Python kód: */
//        VEGE = 0
//        db = 0
//        min = 2147483647
//        while (szam := int(input("N="))) != VEGE:
//            if szam < min:
//                min = szam    
//            db += 1
//
//        print(f"{db} számból a legkisebb: {min}")
        /** Java kód: */
        final int VEGE = 0;//konstans, inicializálás után nem változtatható
        //VEGE = -1;//konstans érték nem változtatható
        db = 0;//korábban már deklaráltuk, ezért nincs int
        int min = Integer.MAX_VALUE; //2147483647;
        int szam;
        System.out.print("0-ra kilép: ");
        while((szam = sc.nextInt()) != VEGE){
            if(szam < min){
                min = szam;
            }
            db++; //db += 1;
        }
        System.out.printf("%d számból a legkisebb: %d\n",db, min);
        
        /* MINIMUMKIVÁLASZTÁS vége */
/*--------------------------------------------------*/
        /* ELDÖNTÉS - legalább EGY adott (T) tulajdonságú */
        /** Python kód: */
//        import math
//
//        n: int = int(input("\nszám: "))
//        prim: bool
//
//        if n < 2:
//            prim = False
//        else:
//            i = 2
//            while i <= math.sqrt(n) and n % i != 0:
//                i += 1
//            prim = i > math.sqrt(n)
//
//        if prim == True:
//            print("Prím")
//        else:
//            print("Nem prím")
        
        /** Java kód: */
        System.out.print("\nszám: ");
        n = sc.nextInt();
        boolean prim;

        if(n < 2){
            prim = false;
        }else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % i != 0){
                i++; //i += 1;
            }
            prim = i > Math.sqrt(n);
        }
        //if(prim == true){ 
        if(prim){ 
            System.out.println("Prím");
        }
        else{
            System.out.println("Nem prím");
        }
        /* ELDÖNTÉS vége */
        
        /* kiválasztás */
        prim = false;
        n = 9999;
        /* bekér */
        System.out.println("alsó: ");
        int also = sc.nextInt();
        System.out.println("felső: ");
        int felso = sc.nextInt();
        
        /* tetel */
        while(!prim){
            n++;
            int i = 2;
            while(i<=Math.sqrt(n)&& n % i !=0){
                i++;
            }
            prim = i > Math.sqrt(n);
        }
        System.out.printf("Prímszám %d\n",n);
        
        /* lineáris keresés */
        /*int also = 42, int felso = 67;*/
        int i = also;
        while( i <= felso && !(i % 10 == 0)){
            i++;
        }
        boolean van = i <= felso;
   
        //System.out.printf("%d és %d között van", also, felso);
         /* Használjuk a String osztály megfelelő metódusát */
        //String kimenet = String.format("%d és %d között van", also, felso);
        /* Használjunk egy String OBJECTUM megfelelő (nem static) metódusát */
        String kimenet = "%d és %d között van".formatted(also,felso);
        if (van){
            System.out.println("van 0-ra végződő szám: " + i );
        }else{
            System.out.println("\"nincs 0-ra végződő");
        }
        System.out.println(kimenet);
        
    }//main vége
    
}//class vége
