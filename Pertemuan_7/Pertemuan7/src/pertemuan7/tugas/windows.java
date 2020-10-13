package pertemuan7.tugas;

public class windows extends laptop{
    public String fitur;

    public windows(){

    }
    public windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("=================LAPTOP WINDOWS================");
        super.tampilLaptop();
        System.out.println("Fitur               : "+fitur);
    }
}