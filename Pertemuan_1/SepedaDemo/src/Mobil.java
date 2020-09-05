
public class Mobil {

    private String merek, nopol, warna;
    private String tipeMobil, keperluan;
    private int orang;
    private int no_mesin;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void nopol(String newValue) {
        nopol = newValue;
    }

    public void no_mesin(int newValue) {
        no_mesin = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Nopol : " + nopol);
        System.out.println("No mesin : " + no_mesin);
        System.out.println("Tipe Mobil : " + tipeMobil);
        System.out.println("Untuk Orang : " + orang);
        System.out.println("Keperluan : " + keperluan);
    }

    public void tipeMobil(String newValue) {
        tipeMobil = newValue;
    }

    public void orang(int newValue) {
        orang = newValue;
    }

    public void keperluan(String newValue) {
        keperluan = newValue;
    }

    public static void main(String[] args) {
        Mobil mbl1 = new Mobil();
        mobilCityCar mbl2 = new mobilCityCar();
        mobilSUV mbl3 = new mobilSUV();

        mbl1.setMerek("Inova");
        mbl1.nopol("L 09 BS");
        mbl1.no_mesin(92742);
        mbl1.tipeMobil("MPV");
        mbl1.orang(8);
        mbl1.keperluan("Mudik");
        mbl1.cetakStatus();
        System.out.println();
        mbl2.setMerek("Corola");
        mbl2.nopol("R 1291 TA");
        mbl2.no_mesin(92322);
        mbl2.tipeMobil("City Car");
        mbl2.orang(6);
        mbl2.keperluan("Untuk Didalam Kota");
        mbl2.tipeBan("Halus");
        mbl2.cetakStatus();
        System.out.println();
        mbl3.setMerek("pajero");
        mbl3.nopol("M 0924 RS");
        mbl3.no_mesin(92542);
        mbl3.tipeMobil("SUV");
        mbl3.orang(5);
        mbl3.keperluan("Melwati Berbagai Rintangan off-road/on-road");
        mbl3.pengerak("4WD");
        mbl3.cetakStatus();
    }
}
