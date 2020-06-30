import java.util.Scanner;

interface YurtDisiKurallari {
    
    boolean yurtDisiHarciKontrol();
    boolean siyasiYasakKontrol();
    boolean vizeDurumuKontrol();
    
}
class Yolcu implements YurtDisiKurallari {
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() { // içi boş, değerleri kullanıcıdan alıcaz ^_^...
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Yatırdığınınız harç bedeli: ");
        this.harc = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Siyasi yasağınız bulunuyor mu (evet ya da hayır)?");
        String cevap1 = scan.nextLine();
        if (cevap1.equals("evet")){
            this.siyasiYasak = false;
        }
        else{            
            this.siyasiYasak = true;
        }
        
        System.out.println("Vizeniz bulunuyor mu (evet ya da hayır) ?");
        String cevap2 = scan.nextLine();
        if (cevap2.equals("evet")){
            this.vizeDurumu = true;
        }
        else{            
            this.vizeDurumu = false;
        }
    } 

    @Override
    public boolean yurtDisiHarciKontrol() {
        
        if(this.harc<15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın...");
            return false;   
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam.");
            return true;
        }
        
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak == false) {
            System.out.println("Siyasi yasağınız bulunuyor yurt dışına çıkamazsınız..");
            return false;   
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
       if(this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam...");
            return true;   
        }
        else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır.");
            return false;
        }
    }
    
}

public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("###Sabiha Gökçen Havalimanına Hoşgeldiniz ^_^... ###");
        
        String sartlar = "Yurtdışı çıkış kuralları... \n" +
                "Herhangi bir siyasi yasağın bulunmaması gerekiyor...\n" +
                "15 tl harç bedelini tam olarak yatırmanız gerekiyor...\n" +
                "Gideceğiniz bölgeye vizenizin bulunması gerekiyor...";
        
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor. ";
        
        while(true) {
            
            System.out.println("*********************");
            System.out.println(sartlar);
            System.out.println("*********************");
            
            Yolcu yolcu = new Yolcu(); //objemizi oluşturduk ve boş constractorumuzu çağırdık ^_^...
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000); //programımız 3 sn duruyor ^_^...
            
            if(yolcu.yurtDisiHarciKontrol() == false) {
                System.out.println(message);
                continue; 
                /* Biz burda alttakilerin hiçbirini yapmak istemediğimizi 
                    söylüyoruz, böylece continue yapıyoruz*/
            }
            
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.siyasiYasakKontrol() ==  false) {
                System.out.println(message);
                continue;   
            }
            
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.vizeDurumuKontrol() ==  false) {
                System.out.println(message);
                continue;   
            }
            
            System.out.println("İşleminiz tamam! Yurtdışına çıkabilirsiniz...");
            break;
            //Yurtdışına çıkabildiğime için break ile döngüyü sonlandırmalıyız. 
 
        }                  
    }  
}

