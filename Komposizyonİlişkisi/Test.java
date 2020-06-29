
public class Test {
    
    public static void main(String[] args){
        
        Resolution resolution = new Resolution(1920,1080); 
        //Resolution objesi oluşturduk ^_^ ...
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        
        AnaKart anakart = new AnaKart("B250-Pro", "Asus", 10, "windows 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yükle("Ubuntu 16.04"); 
        
        monitor.bilgileriGoster();
    }
    
}
