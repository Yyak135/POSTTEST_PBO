public class KaryaSeni {

    String judul;
    String seniman;
    int tahun;

    KaryaSeni(String judul, String seniman, int tahun) {
        this.judul = judul;
        this.seniman = seniman;
        this.tahun = tahun;
    }

    void tampilData() {
        System.out.println("Judul   : " + judul);
        System.out.println("Seniman : " + seniman);
        System.out.println("Tahun   : " + tahun);
        System.out.println("---------------------");
    }
}