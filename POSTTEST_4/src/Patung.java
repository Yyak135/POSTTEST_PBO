public class Patung extends KaryaSeni {

    private String bahan;

    public Patung(String judul, String seniman, int tahun, String bahan) {
        super(judul, seniman, tahun);
        this.bahan = bahan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jenis   : Patung");
        System.out.println("Bahan   : " + bahan);
        System.out.println("---------------------");
    }

    @Override
    public void infoTambahan() {
        System.out.println("Patung terbuat dari: " + bahan);
    }
}