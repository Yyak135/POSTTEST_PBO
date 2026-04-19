public class Lukisan extends KaryaSeni {

    private String media;

    public Lukisan(String judul, String seniman, int tahun, String media) {
        super(judul, seniman, tahun);
        this.media = media;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis   : Lukisan");
        System.out.println("Media   : " + media);
        System.out.println("---------------------");
    }

    @Override
    public void infoTambahan() {
        System.out.println("Lukisan menggunakan media: " + media);
    }

    @Override
    public void tampilDeskripsi() {
        System.out.println("Ini adalah karya seni lukisan.");
    }

    @Override
    public void kategoriKarya() {
        System.out.println("Kategori: Seni Visual");
    }
}