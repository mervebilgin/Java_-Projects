/* Girilen herhangi bir sayiyiyi yüzler basamağı ekrana yazdırılacak
    eğer yüzler basamağı yok ise 0 yazdırılacak^_^... 
*/

import java.util.Scanner;

public class basamak {
    public static void main (String[] args){
        int sayi, yuzb, sonuc, onb;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = scan.nextInt();
        
        //sonuc = sayi%1000;
        // yuzb = sonuc / 100;
        yuzb=(sayi/100)%10;
        onb=(sayi/10)%10;  // eğer onlar basamağını da bulmak istiyorsakk..
        
        System.out.println("Sayinin yüzler basamağı: " + yuzb);
        System.out.println("Sayinin onlar basamağı: " + onb);
    }   
}
