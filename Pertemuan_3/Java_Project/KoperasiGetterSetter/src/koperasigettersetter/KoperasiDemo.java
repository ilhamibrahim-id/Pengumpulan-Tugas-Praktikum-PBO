package koperasigettersetter;
public class KoperasiDemo {
    public static void main(String[] args) {
        AnggotaKoperasiDemo anggota1 = new AnggotaKoperasiDemo("Ilham","JL Bulak Banteng Lor 4/67");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        anggota1.setNama("Ilham Ibrahim");
        anggota1.setAlamat("JL Bulak Banteng Lor 4/67");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
        
    }
    
}
