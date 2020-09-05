

public class smartphone {

    private String merek, prosesor, tipe;
    private int ram, internal, kamera_depan, kamera_belakang;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void tipe(String newValue) {
        tipe = newValue;
    }

    public void prosesor(String newValue) {
        prosesor = newValue;
    }

    public void ram(int newValue) {
        ram = newValue;
    }

    public void internal(int newValue) {
        internal = newValue;
    }

    public void kamera_depan(int newValue) {
        kamera_depan = newValue;
    }

    public void kamera_belakang(int newValue) {
        kamera_belakang = newValue;
    }
    public void cetakStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Tipe Smartphone : " + tipe);
        System.out.println("Prosesor : " + prosesor);
        System.out.println("Ram : " + ram + " GB");
        System.out.println("Internal : " + internal + " GB");
        System.out.println("Kamera_depan : " + kamera_depan + " MP");
        System.out.println("kamera belakang : " + kamera_belakang + " MP");
    }
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        smartphoneGaming spg = new smartphoneGaming();
        sp.setMerek("Samsung");
        sp.tipe("Standard");
        sp.prosesor("SnapDragon 450");
        sp.ram(3);
        sp.internal(32);
        sp.kamera_depan(5);
        sp.kamera_belakang(16);
        sp.cetakStatus();
        System.out.println();
        spg.setMerek("ROG Phone 3");
        spg.tipe("Untuk Gaming");
        spg.prosesor("SnapDragon 865+");
        spg.ram(16);
        spg.internal(256);
        spg.kamera_depan(24);
        spg.kamera_belakang(24);
        spg.pad("Game Pad by ROG");
        spg.pendingin("cooling pad remax");
        spg.speedup("Game Turbo");
        spg.cetakStatus();
    }
}
