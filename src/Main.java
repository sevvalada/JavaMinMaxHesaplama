import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1, n, c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz:");
        n = scan.nextInt();

        // İlk sayıyı al ve hem min hem max olarak başlat
        System.out.print(i + ". sayıyı giriniz: ");
        c = scan.nextInt();
        int min = c;
        int max = c;
        i++;

        // Geri kalan sayıları do-while ile al
        do {
            System.out.print(i + ". sayıyı giriniz: ");
            c = scan.nextInt();

            if (c < min) min = c;
            if (c > max) max = c;

            i++;
        } while (i <= n);

        // Sonuçları yazdır
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        scan.close();
    }
}
