import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        int matematikNotu = scanner.nextInt();

        System.out.print("Fizik notunu girin: ");
        int fizikNotu = scanner.nextInt();

        System.out.print("Türkçe notunu girin: ");
        int turkceNotu = scanner.nextInt();

        System.out.print("Kimya notunu girin: ");
        int kimyaNotu = scanner.nextInt();

        System.out.print("Müzik notunu girin: ");
        int muzikNotu = scanner.nextInt();



        // Notlar 0 ile 100 arasında ise ortalama hesapla
        if (matematikNotu >= 0 && matematikNotu <= 100 && fizikNotu >= 0 && fizikNotu <= 100
                && turkceNotu >= 0 && turkceNotu <= 100 && kimyaNotu >= 0 && kimyaNotu <= 100
                && muzikNotu >= 0 && muzikNotu <= 100) {

            double ortalama = (matematikNotu + fizikNotu + turkceNotu + kimyaNotu + muzikNotu) / 5.0;

            System.out.println("Ortalama: " + ortalama);

            // Ortalama geçme notundan büyük veya eşitse öğrenci geçer.
            if (ortalama >= 55) {
                System.out.println("Öğrenci geçti!");
            } else {
                System.out.println("Öğrenci kaldı.");
            }
        } else {
            System.out.println("Geçersiz not girişi. Notlar 0 ile 100 arasında olmalıdır.");
        }
    }
}
