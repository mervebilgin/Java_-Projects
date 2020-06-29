/*Java tabanlı nesneye yönelimli bir oyun yazılmak istenmektedir.
  Bu oyun kendi içerisinde oyuncu ve düşmanlara sahiptir.
  Oyun içerisinde aşağıdaki sınıflar tanımlanmalıdır. ^_^
    -Oyuncu -Düşman -Kurşun -AnaOyun(FPS_Oyun)  :)  */

class kursun {
    int isabetOrani;
    int etkiOrani;
    
}
class oyuncu {
    private int silahTipi;
    private int can;
    
    oyuncu() {
        silahTipi = (int)(1+Math.random()*5);
        can = (int)(1+Math.random()*100);
    }
    
    oyuncu(int can) {
        this(); //yapılandırıcının yapılandırıcıyı çağırması
        //silahTipi = (int)(1+Math.random()*5);
        this.can = can;
        
    }
    
    oyuncu(int can, int silahTipi) {
        this.can = can;
        this.silahTipi = silahTipi;
    }
    
    kursun atesEt(){ //1- geriye kurşun nesnesini dönderir
        kursun k = new kursun();
        k.isabetOrani = (int)(1+Math.random()*100);
        k.etkiOrani = (int)(1+Math.random()*100);
        return k;  
    }
    
    void isabetAl(kursun k) {
        int atesEtkisi = (k.isabetOrani + k.etkiOrani)/4;
        this.can = this.can - atesEtkisi;  
    }
    
    void durum() {
        System.out.println("Can: " + this.can);
        System.out.println("Silah Tipi: " + this.silahTipi);
    }  
}

class dusman {
    private int silahTipi;
    private int can;
    
    dusman() {
        silahTipi = (int)(1+Math.random()*5);
        can = (int)(1+Math.random()*100);
    }
    
    dusman(int can) {
        this(); //yapılandırıcının yapılandırıcıyı çağırması
        //silahTipi = (int)(1+Math.random()*5);
        this.can = can;
        
    }
    
    dusman(int can, int silahTipi) {
        this.can = can;
        this.silahTipi = silahTipi;
    }
    
    kursun atesEt(){ //1- geriye kurşun nesnesini ddöderir
        kursun k = new kursun();
        k.isabetOrani = (int)(1+Math.random()*100);
        k.etkiOrani = (int)(1+Math.random()*100);
        return k;  
    }
    
    void isabetAl(kursun k) {
        int atesEtkisi = (k.isabetOrani + k.etkiOrani)/4;
        this.can = this.can - atesEtkisi;  
    }
    
    void durum() {
        System.out.println("Can: " + this.can);
        System.out.println("Silah Tipi: " + this.silahTipi);
    }
}
public class FPS_Oyunu {

    public static void main(String[] args){
        oyuncu o = new oyuncu();
        dusman d1 = new dusman();
        dusman d2 = new dusman();
        dusman d3 = new dusman(75);
        dusman d4 = new dusman(30, 2);
        o.isabetAl(d1.atesEt());
        o.isabetAl(d2.atesEt());
        o.durum();  
    }
}