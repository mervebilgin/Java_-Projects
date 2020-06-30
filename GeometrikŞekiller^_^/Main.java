
public class Main {
    
    public static void main(String[] args){
        
        Kare kare1  = new Kare("Kare",5);
        Daire daire1  = new Daire("Daire",5);
        
        kare1.alan_hesapla();
        kare1.cevreHesapla();
        daire1.alan_hesapla();
        
        Sekil  sekil;
        sekil = new Kare("Kare", 6);
        sekil.alan_hesapla(); 
        
    }
    
}
