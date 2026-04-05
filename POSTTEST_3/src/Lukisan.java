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
}