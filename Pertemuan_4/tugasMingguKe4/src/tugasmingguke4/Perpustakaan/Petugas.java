package tugasmingguke4.Perpustakaan;

import java.util.*;

public class Petugas {

    public Petugas(String nama, String nip) {
        this.namaPetugas = nama;
        this.NIP = nip;
    }
    private String NIP;
    private String namaPetugas;

    public void setNIP(String nip) {
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }
}
