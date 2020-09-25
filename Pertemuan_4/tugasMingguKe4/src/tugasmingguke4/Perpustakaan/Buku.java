package tugasmingguke4.Perpustakaan;

import java.util.*;

/**
 *
 */
public class Buku {
    Buku(){
        
    }
    private String judulBuku;
    private String terbit;

    public void setJudul(String judul) {
        this.judulBuku = judul;
    }

    public String getJudul() {
        return judulBuku;
    }

    public void setTerbit(String terbit) {
        this.terbit = terbit;
    }

    public String getTerbit() {
        return terbit;
    }
}
