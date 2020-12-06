package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ASUS GAMiNG
 */
public class Kategori {
    private int idkategori;
    private String nama, keterangan;
    public String toString(){
        return nama;
    }
    public Kategori() {
    }

    public Kategori(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdKategori() {
        return idkategori;
    }

    public void setIdKategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
       
    public Kategori getById(int id){
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori WHERE idkategori = '" + id + "'");                
        try {
            while(rs.next()){
                kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }
    
    public ArrayList<Kategori> getAll(){
        ArrayList<Kategori> ListKategori = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");
        
        try {
            while (rs.next()) {                
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public ArrayList<Kategori> search(String keyword){
        ArrayList<Kategori> ListKategori = new ArrayList();
        String sql = "SELECT * FROM kategori WHERE "
                + "nama LIKE '%" + keyword + "%'"
                + "OR keterangan LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while (rs.next()) {                
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save(){
        if(getById(idkategori).getIdKategori() == 0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + "'" + this.nama + "',"
                    + "'" + this.keterangan + "'"
                    + ")";
            this.idkategori = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kategori set "
                    + " nama = '" + this.nama + "', "
                    + " keterangan = '" + this.keterangan + "'"
                    + " WHERE idkategori = '" + this.idkategori + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper.executeQuery(SQL);
    }
}