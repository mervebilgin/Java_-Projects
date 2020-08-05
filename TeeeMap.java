
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
   public static void main(String[] args) {
       //TreeMap kullanarak bir Stringin içindeki harflerin frekansını bulma...
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Cümleyi giriniz: ");
       String cumle =  scan.nextLine();
       
       /*
       Oluşturduğumuz cümlenin üzerinde herbir karakter için gezineceğiz 
       ve bir karakterin kaç defa olduğunu bulmaya çalışacaz...
       */
       Map<Character, Integer> frekans = new TreeMap<Character, Integer>();
       
       /*
       Stringimizin üzerinde geziniceğiz ve herbir karakteri burda Map'a atamış olucaz
       ve eğer daha önce o karakterimiz varsa o karakterin değerini bir attıracağız...
       */
       for(int i=0; i<cumle.length(); i++) {
           char c = cumle.charAt(i); //Cümlmizin o andaki kaakteri..
           if(frekans.containsKey(c)) {
               frekans.replace(c, frekans.get(c)+1); // O Key'e karşılık gelen Value'yi  arttırıyoruz.. 
           }
           else{ // O karakter ile daha önce karşılaşmammışsak..
               frekans.put(c, 1); // O karakter bir defa geçti şeklinde başlatıyoruz...  
           } 
       }

       /*
       Map'i bastıralım ve bir karakterin kaç defa geçtiğini bulalım...
       */
       for(Map.Entry<Character, Integer> entry : frekans.entrySet()) {
           System.out.println("Karakter: " + entry.getKey() + " " + entry.getValue() + " kadar geçiyor...");
       }
   } 
}
