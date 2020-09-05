

public class smartphoneGaming extends smartphone{
    private String pad , pendingin,speedup;    
    public void pad(String newValue) {
        pad = newValue;
    }
    public void pendingin(String newValue) {
        pendingin = newValue;
    }
    public void speedup(String newValue) {
        speedup = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Pad : " + pad);
        System.out.println("Pendingin : " + pendingin);
        System.out.println("Speed up : " + speedup);
    }
}
