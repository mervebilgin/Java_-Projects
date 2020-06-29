
package çalışanlarprogramı;

import java.util.Scanner;

public class ÇalışanlarProgramı {

    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz....");
        
        String islemler = "İşlemler... \n"
                + "1. Yazılımcı işlemleri \n"
                + "2. Yönetic işlemleri \n"
                + "Çıkış için q ya basınız...";
       
        System.out.println("*****************");
        System.out.println(islemler);
        System.out.println("*****************");
        
        OUTER:
        while (true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = scan.nextLine();
            switch (islem) {
                case "q":
                    System.out.println("Programdan çıkılıyor....");
                    break ;
                case "1":
                    Yazilimci yazilimci = new Yazilimci("Merve","Bilgin", 567,"Python, C, Java");
                    String yazilimci_islem = "a. Format At \n"
                            + "b. Bilgileri Göster \n "
                            + "Çıkış için q ya basınız...";
                    System.out.println(yazilimci_islem);
            OUTER_1:
            while (true) {
                System.out.println("İşlemi seçiniz..");
                String y_islem = scan.nextLine();
                switch (y_islem) {
                    case "q":
                        System.out.println("Yazilimci ilemlerinden çıkılıyor...");
                        break OUTER_1;
                    case "a":
                        System.out.println("İşletim sistemi: ");
                        String isletim_sistemi = scan.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        break;
                    case "b":
                        yazilimci.bilgileriGoster();
                        break;
                    default:
                        System.out.println("Geçersiz yazılımcı işlemi...");
                        break;
                }
            }
System.out.println("\n");
                    break;
                case "2":                
                    Yonetici yonetici = new Yonetici("Saynur", "Yiğit", 800, 10);
                    String yonetici_islem = "a. Zam yap \n"
                            + "b. Bilgileri Göster \n"
                            + "Çıkış için q ya basın...";
                    System.out.println(yonetici_islem);
            OUTER_2:
            while (true) {
                System.out.print("İşlemi seçiniz: ");
                String t_islem = scan.nextLine();
                switch (t_islem) {
                    case "q":
                        System.out.println("Yönetici islemlerinden çıkılıyor...");
                        break OUTER_2;
                    case "a":
                        System.out.println("Yöneticinin yaptığı zam miktarı: ");
                        int zam_miktarı = scan.nextInt();
                        scan.nextLine();
                        yonetici.zam_yap(zam_miktarı);
                        break;
                    case "b":
                        yonetici.bilgileriGoster();
                        break;
                    default:
                        System.out.println("Geçersiz Yönetici işlemi...");
                        break;
                }
            }
break;
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }
        } 
    }    
}
