

public class laptop {

    private String merek, warna, prosesor, tipe;
    private int ram, memori;

    public void Merek(String newValue) {
        merek = newValue;
    }

    public void warna(String newValue) {
        warna = newValue;
    }

    public void ram(int newValue) {
        ram = newValue;
    }

    public void memori(int newValue) {
        memori = newValue;
    }

    public void prosesor(String newValue) {
        prosesor = newValue;
    }

    public void tipe(String newValue) {
        tipe = newValue;
    }

    public void cetakStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Warna : " + warna);
        System.out.println("Ram : " + ram + " GB");
        System.out.println("Memory Penyimpanan : " + memori + " GB");
        System.out.println("Prosesor : " + prosesor);
        System.out.println("Tipe Laptop : " + tipe);
    }

    public static void main(String[] args) {
        laptop lp = new laptop();
        laptopGaming lg = new laptopGaming();
        laptopMultimedia lgm = new laptopMultimedia();
        lp.Merek("Lenovo IdeaPad");
        lp.tipe("Laptop Standar Multimedia");
        lp.warna("Hitam Pekat");
        lp.prosesor("Amd A9 7th gen");
        lp.ram(4);
        lp.memori(500);
        lp.cetakStatus();
        System.out.println();
        lg.Merek("Asus ROG Strix");
        lg.tipe("Laptop Gaming");
        lg.warna("Hitam");
        lg.ram(16);
        lg.memori(1000);
        lg.prosesor("Intel i7 Gen 10");
        lg.keyboard("full colour");
        lg.speedup("Game Turbo");
        lg.cetakStatus();
        System.out.println();
        lgm.Merek("Asus Zenbook");
        lgm.tipe("Laptop Multimedia");
        lgm.warna("Biru");
        lgm.ram(16);
        lgm.memori(2000);
        lgm.prosesor("Intel i7 Gen 10");
        lgm.multivga("dual vga gt force");
        lgm.cetakStatus();
    }
}
