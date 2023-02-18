package OrtalamaHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double matematik, fizik, turkce, kimya, music, ortalama, toplam = 0;
        double i = 0;
        int gecmeNotu = 55;

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik, Fizik, Türkçe, Kimya, Müzik ders notlarınızı sırasıyla giriniz : ");
        matematik = scan.nextDouble();
        fizik = scan.nextDouble();
        turkce = scan.nextDouble();
        kimya = scan.nextDouble();
        music = scan.nextDouble();
        if ((matematik >= 0) && (matematik <= 100)){
            toplam += matematik;
            i++;
        }
        if ((fizik >= 0) && (fizik <= 100)){
            toplam += fizik;
            i++;
        }
        if ((turkce >= 0) && (turkce <= 100)){
            toplam += turkce;
            i++;
        }
        if ((kimya >= 0) && (kimya <= 100)){
            toplam += kimya;
            i++;
        }
        if ((music >= 0) && (music <= 100)){
            toplam += music;
            i++;
        }
        ortalama = toplam / i;
        System.out.println("Ortalamanız : " + ortalama);
        if (ortalama >= 55){
            System.out.println("Sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız!");
        }
    }
}
