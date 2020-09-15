package koperasigettersetter;

public class Anggota {

    private String noKTP;
    private String nama, alamat;
    private int limit;
    private int temp;
    private float simpanan;

    public Anggota(String noKTP, String nama, int limit) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = limit;
    }
    
    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimit() {
        return limit;
    }

    public int getJumlahPinjam() {
        return temp;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void limit(int limit) {
        this.limit = limit;
    }

    public void setLimitPinjam(int limit) {
        this.limit = limit;
    }

    public void setor(float uang) {
        simpanan += uang;
    }

    public void setJumlahPinjam(int temp) {
        this.temp = temp;
    }

    public int pinjam(int pinjam) {
        if (pinjam < limit) {
            temp += pinjam;
        } else {
            defa();
        }
        return temp;
    }

    public void pinjam2(float uang) {
        simpanan -= uang;
    }

    public int angsur(int angsur) {
        if (angsur < (limit * 10) / 100) {
            System.out.println("Maaf, angsuran	harus 10% dari jumlah pinjaman");
        } else {
            temp -= angsur;
            return temp;
        }
        return temp;
    }

    public void defa() {
        String ami = "maaf, jumlah pinjaman melebihi batas";
        System.out.println(ami);
    }
}
