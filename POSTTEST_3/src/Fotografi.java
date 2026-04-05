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
}