package pertemuan7.tugas;

public class pc extends komputer {
    public int ukuranMonitor;

    public pc(){

    }
    public pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("=================PC================");
        super.tampilData();
        System.out.println("Ukuran monitor      :"+ukuranMonitor);
    }

}