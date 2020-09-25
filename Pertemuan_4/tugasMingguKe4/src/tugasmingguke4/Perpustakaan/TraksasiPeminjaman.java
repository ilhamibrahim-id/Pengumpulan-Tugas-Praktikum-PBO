package tugasmingguke4.Perpustakaan;

import java.util.*;

/**
 *
 */
public class TraksasiPeminjaman {

    public Buku pinjamanBuku;
    public Mahasiswa peminjam;
    public Petugas petugas;

    public void traksasiPinjam(Mahasiswa mahasiswa, Buku buku, Petugas petugas) {
        this.peminjam = mahasiswa;
        this.pinjamanBuku = buku;
        this.petugas = petugas;
    }

    public String info() {
        String p = "";
        p += "=======================================================================\n";
        p += "=======================Traksasi Peminjaman=============================\n";
        p += "=======================================================================\n";
        p += "||Peminjam\t: " + peminjam.getNama() + "\t||nim : " + peminjam.getNim() + "||\n";
        p += "||Meminjam Buku\t: " + pinjamanBuku.getJudul() + "\t||Penerbit : " + pinjamanBuku.getTerbit() + "||\n";
        p += "||Dilayani\t: Petugas " + petugas.getNamaPetugas() + "\t||NIP : " + petugas.getNIP() + "||\n";
        p += "=======================================================================";
        return p;
    }

}
