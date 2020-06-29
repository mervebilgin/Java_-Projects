
package beybladeprogrami;

import java.util.Scanner;

public class BeybladeProgrami {

    public static void main(String[] args) {
        
        // Polimorphism kullanarak beyblade programı ^_^ ...
        System.out.println("Beyblade programına hoşgeldiniz...");
        System.out.println("Çıkış için q ya basınız....");
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi beybladei üretmek istiyorsunuz: ");
            
            String islem = scan.nextLine();
            
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem); //Polimorphism..
                
                if (beyblade == null){
                    
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz: ");
                }
                else{
                    
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }               
            }
        }             
    }   
}
