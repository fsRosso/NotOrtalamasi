import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, turkce, kimya, fizik, tarih, muzik;
        Scanner inp=new Scanner(System.in);

        System.out.println("Matematik Notunuz:");
        mat= inp.nextInt();

        System.out.println("Türkçe Notunuz:");
        turkce= inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya= inp.nextInt();

        System.out.println("Fizik Notunuz");
        fizik=inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih= inp.nextInt();

        System.out.println("Müzik Notunuz:");
        muzik= inp.nextInt();

        int toplam= (mat+turkce+kimya+fizik+tarih+muzik);
        double sonuc= (toplam/6);
        System.out.println(sonuc);

        String durum = (sonuc >= 60) ? "Geçti" : "Kaldı";
        System.out.println("Sonuç: " + durum);
    }
}