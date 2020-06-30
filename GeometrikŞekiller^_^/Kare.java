
public class Kare extends Sekil {
    
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (kenar*kenar) + " dır.");
    }
    
    public void cevreHesapla(){
        System.out.println(getIsim() + " in cevresi " + (4*kenar) + " dır.");
        
    }
    
}
