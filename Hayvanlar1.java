/* Hayvan isimlerini ve konuşma biçimlerini 
   kalıtım yoluyla ekrana yazan program. ^_^
*/

class Hayvan {
    
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus(){
        return " Hayvan konuşuyor...";
    }
}
    
class Kedi extends Hayvan {
        
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyorr...";            
    }
}
    
class Kopek extends Hayvan{
            
    public Kopek(String isim) {
        super(isim);
    }

   @Override
    public String konus() {
        return this.getIsim() + " havlıyorrr.. "; 
    }
}
    
class At extends Hayvan {
    
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyorr..";
    }
}

public class Main {
    
    public static void main(String[] args){
        
        Hayvan hayvan1 = new Kedi("Satürn");
        Hayvan hayvan2 = new Kopek("Şila");
        Hayvan hayvan3 = new At("Şahbatur");
        
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
    }  
}

