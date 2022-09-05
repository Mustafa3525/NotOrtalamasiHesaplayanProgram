import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değiskenleri olustur
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();


        int total = (matematik + fizik + kimya + turkce + tarih + muzik);
        double result = total / 6.0;

        int a = 60 ;
        boolean finaly = result >= a ;
        System.out.println("Ortalamanız : " + result);
        String str = (finaly) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print(str);


    }
}
