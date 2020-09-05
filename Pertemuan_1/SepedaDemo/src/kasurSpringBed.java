

public class kasurSpringBed extends kasur {

    private String pegas;

    public void pegas(String newValue) {
        pegas = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Pegas : " + pegas);
    }
}
