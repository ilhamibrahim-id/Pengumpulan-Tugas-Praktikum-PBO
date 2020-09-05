

public class kasur {

    private String merek, tipe, ukuran;
    private int orang;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void orang(int newValue) {
        orang = newValue;
    }

    public void tipe(String newValue) {
        tipe = newValue;
    }

    public void ukuran(String newValue) {
        ukuran = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe Kasur : " + tipe);
        System.out.println("Untuk Orang : " + orang);
        System.out.println("Ukuran : " + ukuran);
    }

    public static void main(String[] args) {
        kasur ks = new kasur();
        kasurSpringBed ksb = new kasurSpringBed();
        ks.setMerek("King Koil");
        ks.tipe("Queen");
        ks.orang(2);
        ks.ukuran("160cm X 200cm");
        ks.cetakStatus();
        System.out.println();
        ksb.setMerek("Spring Latex");
        ksb.tipe("Single");
        ksb.orang(1);
        ksb.ukuran("90cm X 200cm");
        ksb.pegas("Pocket Spring");
        ksb.cetakStatus();
    }
}
