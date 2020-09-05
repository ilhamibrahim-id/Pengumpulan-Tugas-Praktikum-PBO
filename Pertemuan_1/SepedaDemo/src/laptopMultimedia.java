

public class laptopMultimedia extends laptop {

    private String multivga;

    public void multivga(String newValue) {
        multivga = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Vga : " + multivga);
    }
}
