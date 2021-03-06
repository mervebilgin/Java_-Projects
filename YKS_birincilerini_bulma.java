import java.util.Scanner;

abstract class Aday {
    
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;

    public Aday(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
        this.isim = isim;
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    abstract int puanHEsapla();
    
}


class Sayısal extends Aday {

    public Sayısal(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }
    

    @Override
    int puanHEsapla() {
        return getTurkce()*5 + getMatematik()*5 + getFizik()*4 + getEdebiyat()*1;
    }

}

class EşitAğırlık extends Aday {

    public EşitAğırlık(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }


    @Override
    public int puanHEsapla() {     
        return getTurkce()*5 + getMatematik()*5 + getFizik()*1 + getEdebiyat()*5;
    }
}

public class Test {
    public static void main(String[] args){
        System.out.println("**** YKS Birincilerini Bulma Programı ****");
        Scanner scan = new Scanner(System.in);
        
        String islemler = "İşlemler..\n" + 
                "1. Eşit Ağırlık öğrencileri birincisi: \n" +
                "2. Sayısal öğrencileri birincisi: ";
        
        System.out.println("*****************");
        System.out.println(islemler);
        System.out.println("******************");
        
        while(true){            
            System.out.println("Çıkış için q ya basınız.");
            String cevap = scan.nextLine();
            
            if(cevap.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            System.out.println("*************************")
            //Birinci Öğrenci...
            System.out.print("Birinci öğrenci ismi: ");
            String isim1 = scan.nextLine();
            
            System.out.println("Netler(Türkçe Matematik Edebiyat Fizik): ");
            
            int turkce1 = scan.nextInt();
            int matematik1 = scan.nextInt();
            int edebiyat1 = scan.nextInt();
            int fizik1 = scan.nextInt();
            scan.nextLine();
            
            //İkinci Öğrenci...
            System.out.print("İkinci öğrenci ismi: ");
            String isim2 = scan.nextLine();
            
            System.out.println("Netler(Türkçe Matematik Edebiyat Fizik): ");
            
            int turkce2 = scan.nextInt();
            int matematik2 = scan.nextInt();
            int edebiyat2 = scan.nextInt();
            int fizik2 = scan.nextInt();
            scan.nextLine();
            
            //Üçüncü Öğrenci...
            System.out.print("Üçüncü öğrenci ismi: ");
            String isim3 = scan.nextLine();
            
            System.out.println("Netler(Türkçe Matematik Edebiyat Fizik): ");
            
            int turkce3 = scan.nextInt();
            int matematik3 = scan.nextInt();
            int edebiyat3 = scan.nextInt();
            int fizik3 = scan.nextInt();
            scan.nextLine();
            
            System.out.println("İşlemi giriniz: ");
            String islem = scan.nextLine();
            
            
            if(islem.equals("1")) {
                
                EşitAğırlık ogrenci1 = new EşitAğırlık(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EşitAğırlık ogrenci2 = new EşitAğırlık(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EşitAğırlık ogrenci3 = new EşitAğırlık(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                EşitAğırlık birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                
                System.out.println("Birinci Eşit Ağırlık Öğrencisi: " + birinci.getIsim());
                System.out.println("Birinci Eşit Ağırlık Öğrencisi puanı: " + birinci.puanHEsapla());
  
            }
            
            else if (islem.equals("2")){
                Sayısal ogrenci1 = new Sayısal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayısal ogrenci2 = new Sayısal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayısal ogrenci3 = new Sayısal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Sayısal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                
                System.out.println("Birinci Sayısal Öğrencisi: " + birinci.getIsim());
                System.out.println("Birinci Sayısal Öğrencisi Puanı: " + birinci.puanHEsapla());
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    } 
    
    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        
        if(e1.puanHEsapla()> e2.puanHEsapla() && e1.puanHEsapla() > e3.puanHEsapla()){
            return e1;
        }
        
        else if(e2.puanHEsapla()> e1.puanHEsapla() && e2.puanHEsapla() > e3.puanHEsapla()){
            return e2;
        }
        
        else if(e3.puanHEsapla()> e2.puanHEsapla() && e3.puanHEsapla() > e1.puanHEsapla()){
            return e3;
        }
        else {
            return e1;
        }
    } 
}

