package uts;

public class Mesin {

    private String merek;
    public double kecepatan;

    public Mesin() {

    }

    public void setMerek(String merekMesin) {
        this.merek = merekMesin;
    }

    public String getMerek() {
        return merek;
    }

    public Double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        kecepatan += 15;
        System.out.println(kecepatan + " Km/jam");
    }

    public void kurangiKecepatan() {
        if (kecepatan == 0) {
            System.out.println("Tidak Bisa dikurangi");
        } else {
            kecepatan -= 10;
            System.out.println(kecepatan + " Km/jam");
        }
    }
    }
