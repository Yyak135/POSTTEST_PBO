public class KaryaSeni {

    private String judul;
    private String seniman;
    private int tahun;

    public KaryaSeni(String judul, String seniman, int tahun) {
        this.judul = judul;
        this.seniman = seniman;
        this.tahun = tahun;
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getSeniman() { return seniman; }
    public void setSeniman(String seniman) { this.seniman = seniman; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    // METHOD UTAMA
    public void tampilData() {
        System.out.println("Judul   : " + judul);
        System.out.println("Seniman : " + seniman);
        System.out.println("Tahun   : " + tahun);
    }

    // OVERLOADING 1
    public void tampilData(boolean detail) {
        tampilData();
        if (detail) {
            System.out.println("Menampilkan detail tambahan...");
        }
    }

    // OVERLOADING 2
    public void tampilData(String prefix) {
        System.out.println(prefix + "Judul   : " + judul);
        System.out.println(prefix + "Seniman : " + seniman);
        System.out.println(prefix + "Tahun   : " + tahun);
    }

    // METHOD UNTUK OVERRIDE
    public void infoTambahan() {
        System.out.println("Tidak ada info tambahan");
    }
}