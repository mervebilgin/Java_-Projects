
import java.util.Scanner;

class fkyrdm {
    public static int faktoriyel(int sayi){
        int fakt = 1;
        for(int i=1; i<=sayi; i++){
            fakt = fakt*i;
        }
        return fakt;
    }  
    
    public static void main(String[] args){
        /*System.out.println("Sonuc: " + faktoriyel(5));
         * Consolda..
         * Sonuc: 120
         */
     
        int sayi, faktoriyel=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = scan.nextInt();
        
        faktoriyel = faktoriyel(sayi);
        System.out.println(sayi + " sayisinin faktöriyeli = " + faktoriyel);
                
    }
}
