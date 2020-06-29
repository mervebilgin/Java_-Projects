
package çalışanlarprogramı;

class Yonetici extends Calisan {
    
    private final int sorumlu_kisi_sayisi;
    
    public Yonetici(String ad, String soyad,int id, int sorumlu_kisi_sayisi ){
        
        super(ad,soyad,id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayisi: " + sorumlu_kisi_sayisi);
    }
    
    public void zam_yap(int zam_miktari){
        System.out.println(getAd() + " Çalışanlara " + zam_miktari + " kadar zam yapılıyor...");
    }   
}
