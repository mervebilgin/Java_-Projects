
public class AnaKart {
    
    private String model;
    private String üretici;
    private int yuva_sayisi;
    private String isletim_sistemi;

    public AnaKart(String model, String üretici, int yuva_sayisi, String isletim_sistemi) {
        this.model = model;
        this.üretici = üretici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sistemi = isletim_sistemi;
    }
    
    public void isletim_sistemi_yükle(String isletim_sistemi){
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("İsletim sistemi yüklendi: " + isletim_sistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletim_sistemi() {
        return isletim_sistemi;
    }

    public void setIsletim_sistemi(String isletim_sistemi) {
        this.isletim_sistemi = isletim_sistemi;
    }
 
}
