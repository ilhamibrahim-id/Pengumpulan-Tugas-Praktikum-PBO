package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ASUS GAMiNG
 */
public class Buku {
    private int idbuku;
    private Kategori kategori = new Kategori();
    private String judul, penerbit, penulis;

    public Buku() {
    }

    public Buku(Kategori kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku getById(int id){
        Buku buku = new Buku();
        
        String query = "SELECT "
                +"b.idbuku AS idbuku, "
                +"b.judul AS judul, "
                +"b.penerbit AS penerbit, "
                +"b.penulis AS penulis, "
                +"k.idkategori AS idkategori, "
                +"k.nama AS nama, "
                +"k.keterangan AS keterangan "
                +"FROM buku b "
                +"LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                +"WHERE b.idbuku = '" +id+ "'";
        ResultSet rs = DBHelper.selectQuery(query);
        
        try {
            while(rs.next()){
                buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return buku;
    }
    
    public ArrayList<Buku> getAll(){
        ArrayList<Buku> ListBuku = new ArrayList();
        String query = "SELECT b.idbuku AS idbuku, b.judul AS judul, b.penerbit AS penerbit, b.penulis AS penulis, k.idkategori AS idkategori, k.nama AS nama, k.keterangan AS keterangan "
                + "FROM buku AS b LEFT JOIN kategori AS k ON b.idkategori = k.idkategori";
        ResultSet rs = DBHelper.selectQuery(query);
        
        
        try {
            while(rs.next()){
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        
        return ListBuku;
    }
    
     public ArrayList<Buku> search(String keyword){
        ArrayList<Buku> ListBuku = new ArrayList();
        
        
        String query = "SELECT b.idbuku AS idbuku, b.judul AS judul, b.penerbit AS penerbit, b.penulis AS penulis, k.idkategori AS idkategori, k.nama AS nama, k.keterangan AS keterangan "
                + "FROM buku AS b LEFT JOIN kategori AS k ON b.idkategori = k.idkategori "
                + "WHERE b.judul LIKE '%" + keyword + "%'"
                +"OR b.penerbit LIKE '%" + keyword + "%'"
                +"OR b.penulis LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while(rs.next()){
                Buku buku = new Buku();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idkategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListBuku;
    }
     
     public void save(){
         if(getById(idbuku).getIdbuku() == 0){
             String SQL = "INSERT INTO buku (idkategori, judul, penerbit, penulis) VALUES("
                    + "'" + this.getKategori().getIdKategori() + "',"
                    + "'" + this.judul + "',"
                    + "'" + this.penerbit + "',"
                    +"'" + this.penulis + "'"
                    + ")";

             this.idbuku = DBHelper.insertQueryGetId(SQL);
         } else {
             String SQL = "UPDATE buku SET "
                     +"idkategori = '" + this.getKategori().getIdKategori() + "',"
                     +"judul = '" + this.judul + "',"
                     +"penerbit = '" + this.penerbit + "',"
                     +"penulis = '" + this.penulis + "'"
                     +"WHERE idbuku = '" + this.idbuku + "'";
            DBHelper.executeQuery(SQL);
         }
     }
     
     public void delete(){
         String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
         DBHelper.executeQuery(SQL);
     }
}