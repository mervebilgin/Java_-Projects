
package dortıslem;

import java.util.Scanner;

public class DortIslem {

    public static void main(String[] args) {
        
        double toplama, cikartma, carpma, bolme;
        String islemler = "1-Toplama \n"+
                "2-Çıkartma\n"+
                "3-Çarpma\n"+
                "4-Bölme\n"+
                "Çıkış için q ya basınız...";   
        
        System.out.println("A ve B değerlerini giriniz...");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("A: ");
        double a =  scan.nextDouble();
        System.out.print("B: ");
        double b = scan.nextDouble();
        
        System.out.println("*****************");
        System.out.println(islemler);
        System.out.println("*****************");
        
    
        
        while(true){
            
            System.out.print("İşlemi seçiniz: ");
            islemler = scan.nextLine();
            
            if(islemler.equals("q")){  
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islemler.equals("1")){ 
                System.out.println("A+B =" + (a+b));
            }
            else if (islemler.equals("2")){
                System.out.println("A+B="+ (a-b));
            }
            else if (islemler.equals("3")){
                System.out.println("A*B="+ (a*b));
            }
            else if (islemler.equals("4")){
                System.out.println("A/B="+ (a/b));
            }    
            else{  
                System.out.println("Geçersiz işlem...");
            }             
        }
  
    }      
}
