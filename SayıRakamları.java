/* Dışarıdan girilen sayının rakamlarını 
   alt altta yazdıran program ^_^ */

import java.util.Scanner;
public class Alistirma8 {

    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayiyi giriniz: ");
        sayi = scan.nextInt();
        
        while(sayi>0){ //Sayının 10 a bölümü 0 dan büyük olana kadar bölme işlemi devam..
            
            System.out.println(sayi%10);
            sayi = sayi/10;
            
        }
    }   
}
