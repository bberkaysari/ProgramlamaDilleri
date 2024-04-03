package odev2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    int x;
    int y;
    int b;
    String dosyayolu;
    int dizi[];
    int asıldizi[];

    public void dosyaolustur() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen dosya adını giriniz:");
        dosyayolu = scanner.next();
        File file = new File(dosyayolu);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);
        String line;
        BufferedReader br = new BufferedReader(fr);
        int boyut = 0;
        while ((line = br.readLine()) != null) {
            boyut += 1;
        }
        b = boyut;
        br.close();
    }

    public void dosyaOku() throws IOException {
        String line;
        File filee = new File(dosyayolu);
        FileReader frr = new FileReader(filee);
        BufferedReader sr = new BufferedReader(frr);
        int index = 0;
        dizi = new int[b];
        while ((line = sr.readLine()) != null) {
            dizi[index] = Integer.parseInt(line);
            index++;
        }
    }

    public void dizeEkle() {
        asıldizi = new int[b];
        for (int i = 0; i < b; i++) {
            asıldizi[i] = i;
            System.out.println("Sayı:" + dizi[i] + " Adres: " + asıldizi[i]);
        }
    }

    public void diziYazdir() {
        Arrays.sort(dizi);
        Arrays.sort(asıldizi);
        System.out.println("Sıralanmış Hali: ");
        for (int i = 0; i < b; i++) {
            System.out.println("Sayı:" + dizi[i] + " Adres: " + asıldizi[i]);
        }
    }

}
