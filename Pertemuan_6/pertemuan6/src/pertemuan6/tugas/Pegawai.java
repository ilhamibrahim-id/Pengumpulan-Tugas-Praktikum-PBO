package pertemuan6.tugas;

public class Pegawai {

    public String nip, nama, alamat;
    public int gaji;

    public Pegawai(){
        
    }
 
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNip(){
        return this.nip;
    }
    public int getGaji(){        
        return 2000000;
    }
}
