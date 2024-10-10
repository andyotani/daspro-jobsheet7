import java.util.Scanner;

public class KafeDoWhile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi:");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti:");
            roti = sc.nextInt();

            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti + hargaRoti);
            System.out.println("Total yang harus dibayar: Rp" + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");

    }
}