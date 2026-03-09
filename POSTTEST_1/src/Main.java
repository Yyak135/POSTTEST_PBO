import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<KaryaSeni> daftarKarya = new ArrayList<>();

        int pilihan;

        do {

            System.out.println("\n=== MENU GALERI SENI ===");
            System.out.println("1. Tambah Karya");
            System.out.println("2. Lihat Semua Karya");
            System.out.println("3. Update Karya");
            System.out.println("4. Hapus Karya");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("Judul karya: ");
                    String judul = input.nextLine();

                    System.out.print("Nama seniman: ");
                    String seniman = input.nextLine();

                    System.out.print("Tahun dibuat: ");
                    int tahun = input.nextInt();
                    input.nextLine();

                    KaryaSeni karyaBaru = new KaryaSeni(judul, seniman, tahun);

                    daftarKarya.add(karyaBaru);

                    System.out.println("Karya seni berhasil ditambahkan.");
                    break;

                case 2:

                    if (daftarKarya.isEmpty()) {

                        System.out.println("Belum ada karya seni.");

                    } else {

                        for (int i = 0; i < daftarKarya.size(); i++) {

                            System.out.println("Index: " + i);
                            daftarKarya.get(i).tampilData();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Masukkan index karya yang ingin diupdate: ");
                    int indexUpdate = input.nextInt();
                    input.nextLine();

                    if (indexUpdate < daftarKarya.size()) {

                        System.out.print("Judul baru: ");
                        String judulBaru = input.nextLine();

                        System.out.print("Seniman baru: ");
                        String senimanBaru = input.nextLine();

                        System.out.print("Tahun baru: ");
                        int tahunBaru = input.nextInt();
                        input.nextLine();

                        daftarKarya.set(indexUpdate, new KaryaSeni(judulBaru, senimanBaru, tahunBaru));

                        System.out.println("Data berhasil diupdate.");

                    } else {

                        System.out.println("Index tidak ditemukan.");
                    }

                    break;

                case 4:

                    System.out.print("Masukkan index karya yang ingin dihapus: ");
                    int indexHapus = input.nextInt();

                    if (indexHapus < daftarKarya.size()) {

                        daftarKarya.remove(indexHapus);

                        System.out.println("Data berhasil dihapus.");

                    } else {

                        System.out.println("Index tidak ditemukan.");
                    }

                    break;

                case 5:

                    System.out.println("Program selesai.");
                    break;

                default:

                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilihan != 5);

    }
}