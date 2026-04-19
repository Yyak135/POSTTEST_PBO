public class Fotografi extends KaryaSeni {

    private String kamera;

    public Fotografi(String judul, String seniman, int tahun, String kamera) {
        super(judul, seniman, tahun);
        this.kamera = kamera;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis   : Fotografi");
        System.out.println("Kamera  : " + kamera);
        System.out.println("---------------------");
    }

    @Override
    public void infoTambahan() {
        System.out.println("Diambil dengan kamera: " + kamera);
    }

    @Override
    public void tampilDeskripsi() {
        System.out.println("Ini adalah karya seni fotografi.");
    }

    @Override
    public void kategoriKarya() {
        System.out.println("Kategori: Seni Digital");
    }
}