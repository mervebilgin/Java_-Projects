import java.util.Scanner;
class mayinTarlasi {
    
    private int [][]Tarla = new int[10][10];
    private int sutun=0, satir=0;

    mayinTarlasi() {
        mayinYerlestir(10);
    }
    
    mayinTarlasi(int adet) {
        mayinYerlestir(adet);
    }
    
    public void mayinYerlestir(int adet){
        for(int i=0; i<adet; i++){
            sutun = (int)(Math.random()*10);
            satir = (int)(Math.random()*10);
            if(Tarla[satir][sutun]==0){
                Tarla[satir][sutun]=1;
            }else{
                i--;
            }          
        }
    }
    public boolean tarlaKontrol(int satir, int sutun){
        if(Tarla[satir][sutun]==1){ 
            return true;
        }
        else{
            return false;
        }
    } 
    /*Yaptığımız işi görebilmek ve 
    yaptığımız işin doğruluğunu tespit edebilmek amacıyla
    */
    public void yazdir(){
        System.out.println("yazdirma işlemi: ");
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                System.out.print(Tarla[i][j]);
            }
            System.out.print("\n");
        }
    }
}

public class MayinTarlasiOyunu{
    public static void main(String[] args){
        int satir, sutun, dogruTahminSayisi = 0;
        boolean cikis = false;
        mayinTarlasi m = new mayinTarlasi();
        m.yazdir(); //uygulama açılır açılmaz elimizdeki mayın tarlası bilgilerini bir defa yaz
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Satir numarasını giriniz: ");
            satir = scan.nextInt();
            System.out.println("Sütun numarasını giriniz: ");
            sutun = scan.nextInt();
            if(m.tarlaKontrol(satir, sutun)){
                cikis = true;
            }else{
                cikis = false;
                dogruTahminSayisi++;
            }
            System.out.println("Tahmin: " + satir +"-" + sutun);
        }while(cikis == false);  //true olsaydı mantık hatası olurdu
        System.out.println("Puanınız: " + dogruTahminSayisi);
    }
    
}
