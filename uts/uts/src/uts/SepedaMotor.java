package uts;

public class SepedaMotor extends Mesin {

    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor(String merekMotor, String merekMesin) {
        super.setMerek(merekMesin);
        this.merekMotor = merekMotor;

    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public String getMerekMesin() {
        return getMerek();
    }

    public void tambahKecepatanMotor() {
        if (kecepatan == 100) {
            System.out.println("Kecepatan Maksimum");
        } else {
            if (merekMotor.equalsIgnoreCase("Vario")) {
                super.kecepatan += 10;
                System.out.println(kecepatan + " Km/jam");
            } else {
                tambahKecepatan();
            }
        }
    }

    public void kurangiKecepatanMotor() {
        if (kecepatan == 100) {
            System.out.println("Kecepatan Maksimum");
        } 
        else {
            if (merekMotor.equalsIgnoreCase("Vario")) {
                super.kecepatan -= 5;
                System.out.println(kecepatan + " Km/jam");
            } else {
                kurangiKecepatan();
            }
        }
    }
}
