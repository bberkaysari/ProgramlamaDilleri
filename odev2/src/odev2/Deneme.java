package odev2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Deneme {
	int x;
	int y;
	int b;
	String dosyayolu;
	int dizi[];
	int asýldizi[];
	public void dosyaolustur() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dosya adýný giriniz:");
		 dosyayolu=scanner.next();
		File file=new File(dosyayolu);
		if(!file.exists()) {
			file.createNewFile();
		}
		FileReader fr=new FileReader(file);
		String line;
		BufferedReader br=new BufferedReader(fr);
		int boyut=0;
		while((line=br.readLine())!=null) {
			boyut+=1;
		}
		b=boyut;
		br.close();
		
		
		
	}
	public void dosyaOku() throws IOException {
		String line;
		File filee=new File(dosyayolu);
		FileReader frr=new FileReader(filee);
		BufferedReader sr=new BufferedReader(frr);
		int index=0;
		dizi=new int[b];
		while((line=sr.readLine())!=null) {
			dizi[index]=Integer.parseInt(line);
			index++;
			
		}
		
	}
	public void dizeEkle() {
		int[] adres=new int[b];
		int indeks=0;
		asýldizi=new int[b];
		for(int c=0;c<b;c++) {
			adres[c]=-1;
		}
		for(int i=0;i<b;i++) {
			x=dizi[i];
			y=0;
			for(int j=0;j<b;j++) {
				if(j==i) {
					continue;
				}
				if(dizi[i]>dizi[j]) {
					y++;
				}
			}
			for(int a=0;a<b;a++) {
				if(adres[a]==y) {
					y++;
				}
			}
			adres[indeks]=y;
			indeks++;
			asýldizi[y]=x;
			System.out.println("Sayi:"+x+"--->"+"Adres:"+y);
		}
	}
        
	public void diziYazdýr() {
            System.out.println("Siralanmis Hali: ");
		for(int i=0;i<b;i++) {
                    
			System.out.println("Sayi:" + asýldizi[i] + "Adres: " +i );
			
		}
	}
}
