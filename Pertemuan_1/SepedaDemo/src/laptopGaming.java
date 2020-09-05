

public class laptopGaming extends laptop{

    private String keyboard,speedup;

    public void keyboard(String newValue) {
        keyboard = newValue;
    }
    public void speedup(String newValue){
        speedup = newValue;
    }
            
    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe Keyboard : " + keyboard);
        System.out.println("Speed up : " + speedup);
    }
}
