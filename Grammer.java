
import java.util.Scanner;


public class Grammer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ozneListesi = {"ben", "sen", "hasan", "nur�ah", "elif", "abdulrezzak", "�ehribanu", "zeynelabidin", "naki"};
        String[] nesneListesi = {"bah�e", "okul", "park", "sinif", "yar�n", "pazartesi", "sal�", "�ar�amba", "per�embe", "cuma", "cumartesi", "pazar", "merkez", "ev", "kitap", "defter", "g�ne�", "beyda��"};
        String[] yuklemListesi = {"gitmek", "gelmek", "okumak", "yazmak", "y�r�mek", "g�rmek"};
        System.out.println("L�tfen c�mlenizi giriniz.");
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
                            System.out.println("�zne do�ru yaz�lm��t�r.");
                            dogru++;
                            oznekontrol++;
                        }
                    }
                    sayac++;
                }
                else if(sayac==1){
                    for(String p:nesneListesi){
                         if(grammer.equals(p)){
                            System.out.println("Nesne do�ru yaz�lm��t�r.");
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
                            System.out.println("Y�klem do�ru yaz�lm��t�r.");
                            dogru++;
                            yuklemkontrol++;
                        }
                    } 
                }   
        }
        if(yuklemkontrol==0){
          System.out.println("Y�klem yanl��.");
        }
                if(oznekontrol==0){
          System.out.println("Ozne yanl�� yanl��.");
        }
                        if(nesnekontrol==0){
          System.out.println("Nesne  yanl��.");
        }
        if(dogru==3){
            System.out.println("C�mle do�rudur.");
        }
        else{
            System.out.println("C�mle yanl��t�r.");
        }
        
        
    }
}
