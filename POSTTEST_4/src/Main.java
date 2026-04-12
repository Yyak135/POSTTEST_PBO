import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String inputHuruf(Scanner input, String pesan) {
        String data;
        while (true) {
            System.out.print(pesan);
            data = input.nextLine();

            if (data.isEmpty()) {
                System.out.println("Tidak boleh kosong!");
            } else if (data.matches("[a-zA-Z ]+")) {
                return data;
            } else {
                System.out.println("Input hanya boleh huruf!");
            }
        }
    }

    public static int inputAngka(Scanner input, String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<KaryaSeni> daftarKarya = new ArrayList<>();

        daftarKarya.add(new Lukisan("Mona Lisa", "Leonardo", 1503, "Cat Minyak"));
        daftarKarya.add(new Lukisan("Starry Night", "Van Gogh", 1889, "Cat Minyak"));
        daftarKarya.add(new Patung("David", "Michelangelo", 1504, "Marmer"));
        daftarKarya.add(new Patung("The Thinker", "Rodin", 1904, "Perunggu"));
        daftarKarya.add(new Fotografi("Sunrise", "Ansel Adams", 1941, "Canon"));

        int pilihan;

        do {

            System.out.println("\n=== MENU GALERI SENI ===");
            System.out.println("1. Tambah Karya");
            System.out.println("2. Lihat Semua Karya");
            System.out.println("3. Update Karya");
            System.out.println("4. Hapus Karya");
            System.out.println("5. Keluar");

            pilihan = inputAngka(input, "Pilih menu: ");

            switch (pilihan) {

                case 1:
                    System.out.println("1. Lukisan");
                    System.out.println("2. Patung");
                    System.out.println("3. Fotografi");

                    int jenis = inputAngka(input, "Pilih jenis: ");

                    String judul = inputHuruf(input, "Judul: ");
                    String seniman = inputHuruf(input, "Seniman: ");
                    int tahun = inputAngka(input, "Tahun: ");

                    if (jenis == 1) {
                        String media = inputHuruf(input, "Media: ");
                        daftarKarya.add(new Lukisan(judul, seniman, tahun, media));

                    } else if (jenis == 2) {
                        String bahan = inputHuruf(input, "Bahan: ");
                        daftarKarya.add(new Patung(judul, seniman, tahun, bahan));

                    } else if (jenis == 3) {
                        String kamera = inputHuruf(input, "Kamera: ");
                        daftarKarya.add(new Fotografi(judul, seniman, tahun, kamera));

                    } else {
                        System.out.println("Jenis tidak valid!");
                        break;
                    }

                    System.out.println("Karya berhasil ditambahkan!");
                    break;

                case 2:
                    if (daftarKarya.isEmpty()) {
                        System.out.println("Tidak ada data!");
                    } else {
                        System.out.println("\n=== DAFTAR KARYA ===");
                        for (int i = 0; i < daftarKarya.size(); i++) {
                            System.out.println("No: " + (i + 1));

                            // POLYMORPHISM (OVERRIDING)
                            daftarKarya.get(i).tampilData();

                            // TAMBAHAN OVERRIDE
                            daftarKarya.get(i).infoTambahan();
                        }
                    }
                    break;

                case 3:
                    if (daftarKarya.isEmpty()) {
                        System.out.println("Data kosong!");
                        break;
                    }

                    int update = inputAngka(input, "Masukkan nomor karya: ");

                    if (update < 1 || update > daftarKarya.size()) {
                        System.out.println("Nomor tidak valid!");
                        break;
                    }

                    KaryaSeni ks = daftarKarya.get(update - 1);

                    ks.setJudul(inputHuruf(input, "Judul baru: "));
                    ks.setSeniman(inputHuruf(input, "Seniman baru: "));
                    ks.setTahun(inputAngka(input, "Tahun baru: "));

                    System.out.println("Data berhasil diupdate!");
                    break;

                case 4:
                    if (daftarKarya.isEmpty()) {
                        System.out.println("Data kosong!");
                        break;
                    }

                    int hapus = inputAngka(input, "Masukkan nomor karya: ");

                    if (hapus < 1 || hapus > daftarKarya.size()) {
                        System.out.println("Nomor tidak valid!");
                    } else {
                        daftarKarya.remove(hapus - 1);
                        System.out.println("Data berhasil dihapus!");
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 5);
    }
}