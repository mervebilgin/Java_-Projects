
package beybladeprogrami;

public class BeybladeFabrikasi {
    
    public Beyblade beybladeUret(String beybladeTuru){
        
        if(beybladeTuru.equals("Dragon")){
            
            return new Dragon("Mavi Ejderha", "Kutsal canavarla konuşma ", "Takao", 800, 300);
        }
        
        else if(beybladeTuru.equals("Dranza")){
            
            return new Dranza( "Kırmızı Anka Kuşu ", "Kai", 600, 400);
        }
        
        else if(beybladeTuru.equals("Drayga")){
            
            return new Drayga( "Beyaz Kaplan ","Rei", 800, 250);
        }
        
        else if(beybladeTuru.equals("Draciel")){
            
            return new Draciel("Kara Kaplumbağa ","Max", 400, 1000);
        }
        
        else {
            
            return null;
        }    
    }
    
}
