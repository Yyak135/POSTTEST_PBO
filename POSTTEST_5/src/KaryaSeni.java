public abstract class KaryaSeni implements Deskripsi {

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

    // METHOD BIASA
    public void tampilData() {
        System.out.println("Judul   : " + judul);
        System.out.println("Seniman : " + seniman);
        System.out.println("Tahun   : " + tahun);
    }

    // OVERLOADING
    public void tampilData(boolean detail) {
        tampilData();
        if (detail) {
            System.out.println("Menampilkan detail tambahan...");
        }
    }

    public void tampilData(String prefix) {
        System.out.println(prefix + "Judul   : " + judul);
        System.out.println(prefix + "Seniman : " + seniman);
        System.out.println(prefix + "Tahun   : " + tahun);
    }

    // ABSTRACT METHOD
    public abstract void infoTambahan();
}