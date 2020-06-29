
package beybladeprogrami;

public class Draciel extends Beyblade {
    
    private String kutsalCanavar;

    public Draciel(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(this.getBeybladeci() + " " + kutsalCanavar + "ortaya çıkarıyor...");
        System.out.println(this.getBeybladeci() + "ın savunması: Kale savunması"); 
    }
      
}
