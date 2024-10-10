import java.util.Scanner;

public class SiakadFor04soal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        int batasKelulusan = 60;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai; 
            }
            
            if (nilai < terendah) {
                terendah = nilai; 
            }
            
            if (nilai >= batasKelulusan) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);
    }
}
