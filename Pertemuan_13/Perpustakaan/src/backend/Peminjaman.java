
package backend;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS GAMiNG
 */
public class Peminjaman {
    private int idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam, tanggalKembali;

    public Peminjaman() {
    }

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    
       
    public Peminjaman getById(int id){
        Peminjaman pen = new Peminjaman();
        
        String query = "SELECT * FROM peminjaman p "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON b.idbuku = p.idbuku "
                +"WHERE p.idpeminjaman = '" +id+ "'";
        ResultSet rs = DBHelper.selectQuery(query);
        
        try {
            while(rs.next()){
                pen = new Peminjaman();
                Anggota ang = new Anggota();
                Buku buk = new Buku();
                pen.setAnggota(ang);
                pen.setBuku(buk);
                
                pen.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pen.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pen.setTanggalKembali(rs.getString("tanggalkembali"));
                pen.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                pen.getAnggota().setNama(rs.getString("nama"));
                pen.getAnggota().setAlamat(rs.getString("alamat"));
                pen.getAnggota().setTelepon(rs.getString("telepon"));
                pen.getBuku().setIdbuku(rs.getInt("idbuku"));
                pen.getBuku().setJudul(rs.getString("judul"));
                pen.getBuku().setPenerbit(rs.getString("penerbit"));
                pen.getBuku().setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pen;
    }
    
    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> Peminjaman = new ArrayList();
        String query = "SELECT * FROM peminjaman p "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON b.idbuku = p.idbuku";
        ResultSet rs = DBHelper.selectQuery(query);
                
            try {
                while(rs.next()){
                Peminjaman pen = new Peminjaman();
                Anggota ang = new Anggota();
                Buku buk = new Buku();
                pen.setAnggota(ang);
                pen.setBuku(buk);
                
                pen.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pen.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pen.setTanggalKembali(rs.getString("tanggalkembali"));
                pen.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                pen.getAnggota().setNama(rs.getString("nama"));
                pen.getAnggota().setAlamat(rs.getString("alamat"));
                pen.getAnggota().setTelepon(rs.getString("telepon"));
                pen.getBuku().setIdbuku(rs.getInt("idbuku"));
                pen.getBuku().setJudul(rs.getString("judul"));
                pen.getBuku().setPenerbit(rs.getString("penerbit"));
                pen.getBuku().setPenulis(rs.getString("penulis"));
                Peminjaman.add(pen);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Peminjaman;
    }
    
    public ArrayList<Peminjaman> search(String keyword){
        ArrayList<Peminjaman> Peminjaman = new ArrayList();
        String query = "SELECT * FROM peminjaman p "
                + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON b.idbuku = p.idbuku "
                + "WHERE a.nama LIKE '%" + keyword + "%'"
                +"OR a.alamat LIKE '%" + keyword + "%'"
                +"OR a.telepon LIKE '%" + keyword + "%'"
                +"OR b.judul LIKE '%" + keyword + "%'"
                + "OR b.penerbit LIKE '%" + keyword + "%'"
                + "OR b.penulis LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);
                
        try {
            while(rs.next()){
                Peminjaman pen = new Peminjaman();
                pen.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pen.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pen.setTanggalKembali(rs.getString("tanggalkembali"));
                pen.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                pen.getAnggota().setNama(rs.getString("nama"));
                pen.getAnggota().setAlamat(rs.getString("alamat"));
                pen.getAnggota().setTelepon(rs.getString("telepon"));
                pen.getBuku().setIdbuku(rs.getInt("idbuku"));
                pen.getBuku().setJudul(rs.getString("idbuku"));
                pen.getBuku().setPenerbit(rs.getString("penerbit"));
                pen.getBuku().setPenulis(rs.getString("penulis"));
                
                Peminjaman.add(pen);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Peminjaman;
    }
    
    public void save(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        
         if(getById(idPeminjaman).getIdPeminjaman() == 0){
             try {
                java.util.Date tanggalPinjam = format.parse(this.tanggalPinjam);
                java.sql.Date sqlTanggalPinjam = new java.sql.Date(tanggalPinjam.getTime());
                java.util.Date tanggalKembali = format.parse(this.tanggalKembali);
                java.sql.Date sqlTanggalKembali = new java.sql.Date(tanggalKembali.getTime());

             String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + "'" + this.getAnggota().getIdAnggota() + "',"
                    + "'" + this.getBuku().getIdbuku() + "',"
                    + "'" + sqlTanggalPinjam + "',"
                   + "'" + sqlTanggalKembali + "'"
                    + ")";

             this.idPeminjaman = DBHelper.insertQueryGetId(SQL);
             } catch (Exception e) {
                 e.printStackTrace();
             }
         } else {
             String SQL = "UPDATE peminjaman SET"
                    + " idanggota = '" + this.getAnggota().getIdAnggota()+ "',"
                    + " idbuku = '" + this.getBuku().getIdbuku() + "',"
                    + " tanggalpinjam = '" + this.tanggalPinjam + "',"
                    +" tanggalkembali ='" + this.tanggalKembali + "'"
                    + " WHERE idpeminjaman = '" + this.idPeminjaman + "'";
            DBHelper.executeQuery(SQL);
         }
     }
    
    public void delete(){
         String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idPeminjaman + "'";
         DBHelper.executeQuery(SQL);
     }
}
