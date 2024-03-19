
import java.util.Scanner;


public class Grammer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ozneListesi = {"ben", "sen", "hasan", "nurþah", "elif", "abdulrezzak", "þehribanu", "zeynelabidin", "naki"};
        String[] nesneListesi = {"bahçe", "okul", "park", "sinif", "yarýn", "pazartesi", "salý", "çarþamba", "perþembe", "cuma", "cumartesi", "pazar", "merkez", "ev", "kitap", "defter", "güneþ", "beydaðý"};
        String[] yuklemListesi = {"gitmek", "gelmek", "okumak", "yazmak", "yürümek", "görmek"};
        System.out.println("Lütfen cümlenizi giriniz.");
        String cumle=sc.nextLine();
        String grammer="";
        int sayac=0;
        int dogru=0;
        int yuklemkontrol=0;
        int nesnekontrol=0;
        int oznekontrol=0;
        for(char c:cumle.toCharArray()){ 
            if(c==' ' || c=='.'|| c==','||c==':'||c==';'){
                if(sayac==0){
                    for(String h:ozneListesi){
                        if(grammer.equals(h)){
                            System.out.println("Özne doðru yazýlmýþtýr.");
                            dogru++;
                            oznekontrol++;
                        }
                    }
                    sayac++;
                }
                else if(sayac==1){
                    for(String p:nesneListesi){
                         if(grammer.equals(p)){
                            System.out.println("Nesne doðru yazýlmýþtýr.");
                            dogru++;
                            nesnekontrol++;
                        }   
                    }
                    sayac++;
                   }
                grammer="";
                continue;
            }
            grammer+=c;
             if(sayac==2){
                 
                    for(String l:yuklemListesi){
                         if(grammer.equals(l)){
                            System.out.println("Yüklem doðru yazýlmýþtýr.");
                            dogru++;
                            yuklemkontrol++;
                        }
                    } 
                }   
        }
        if(yuklemkontrol==0){
          System.out.println("Yüklem yanlýþ.");
        }
                if(oznekontrol==0){
          System.out.println("Ozne yanlýþ yanlýþ.");
        }
                        if(nesnekontrol==0){
          System.out.println("Nesne  yanlýþ.");
        }
        if(dogru==3){
            System.out.println("Cümle doðrudur.");
        }
        else{
            System.out.println("Cümle yanlýþtýr.");
        }
        
        
    }
}
