import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variabel
        int baris, jarak = 1, i, j;
        // scanner
        Scanner sc = new Scanner(System.in);
        // minta input
        System.out.print("mau berapa lebar? : ");
        // input
        baris = sc.nextInt();
        // menentukan jarak yang dimulai dari baris -1
        jarak = baris - 1;
        // loop untuk memuat banyak baris segitiga
        for (j = 1; j <= baris; j++) {
            // lopp untuk memuat jarak dari kiri dalam baris
            for (i = 1; i <= jarak; i++) {
                System.out.print("   ");
            }
            // jarak harus berkurang agar berbentuk segitiga
            jarak--;
            // loop untuk memuat element setelah jarak; contoh "*"
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print(" ^ ");
            }
            // penutup baris
            System.out.println();

        }
        // jarak yang di loop sebelumnya = 0 , di ubah kembali agar bintang di pojok
        // kiri tidak tumpul
        jarak = 1;
        // loop untuk memuat banyak baris segitiga kebalik
        for (j = 1; j <= baris - 1; j++) {
            // loop untuk membuat jarak dari kiri dalam baris
            for (i = 1; i <= jarak; i++) {
                System.out.print("   ");
            }
            // jarak bertambah agar jadi segitiga terbalik
            jarak++;
            // loop untuk memuat elemetn "*" dalam baris
            // i di loop selama 2*(baris-j ) -1 agar "*" terus ada sampai baris tertutup
            for (i = 1; i <= 2 * (baris - j) - 1; i++) {
                System.out.print(" ^ ");
            }
            // penutup baris
            System.out.println();

        }

    }
}
