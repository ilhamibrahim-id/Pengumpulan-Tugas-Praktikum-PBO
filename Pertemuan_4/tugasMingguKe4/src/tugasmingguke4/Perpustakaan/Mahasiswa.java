package tugasmingguke4.Perpustakaan;

import java.util.*;

public class Mahasiswa {

    public Mahasiswa(String nama,String nim) {
        this.namaMahasiswa = nama;
        this.nim = nim;
    }
    private String nim;
    private String namaMahasiswa;

    public void setNama(String nama) {
        this.namaMahasiswa = nama;
    }

    public String getNama() {
        return namaMahasiswa;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;

    }

}
