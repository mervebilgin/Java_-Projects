
package beybladeprogrami;

public class Dragon extends Beyblade {
    
    private String kutsalCanavar;
    private String gizli_yetenek;

    public Dragon(String kutsalCanavar, String gizli_yetenek, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizli_yetenek = gizli_yetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(this.getBeybladeci() + " " + kutsalCanavar + "ortaya çıkarıyor...");
        System.out.println(this.getBeybladeci() + "ın saldırısı: Hayalet kasırgası"); 
    }
    
    
    
    
}
