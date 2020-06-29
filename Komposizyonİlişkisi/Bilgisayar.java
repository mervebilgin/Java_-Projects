
public class Bilgisayar {
    
    private Monitor monitor;   // Komposizyon
    private Kasa kasa;         // Komposizyon
    private AnaKart anakart;   // Komposizyon

    public Bilgisayar(Monitor monitor, Kasa kasa, AnaKart anakart) {
        this.monitor = monitor;
        this.kasa = kasa;
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }

    public AnaKart getAnakart() {
        return anakart;
    }

    public void setAnakart(AnaKart anakart) {
        this.anakart = anakart;
    }
}
