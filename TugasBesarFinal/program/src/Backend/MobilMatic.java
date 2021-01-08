package Backend;

import java.sql.*;
import java.util.ArrayList;

public class MobilMatic extends Mobil implements Harga {

    private String jenisTransmisi;
    private int harga;

    public MobilMatic() {
    }

    public MobilMatic(String jenisTransmisi, int harga, String merek, String plat, String cc, String bahanBakar) {
        super(merek, plat, cc, bahanBakar);
        this.jenisTransmisi = jenisTransmisi;
        this.harga = harga;
    }

    public void setJenisTransmisi(String jenisTransmisi) {
        this.jenisTransmisi = jenisTransmisi;
    }

    public String getJenisTransmisi() {
        return jenisTransmisi;
    }

    @Override
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public MobilMatic getById(int id) {
        MobilMatic mob = new MobilMatic();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM mobil WHERE idmobil = '" + id + "'");

        try {
            while (rs.next()) {
                mob = new MobilMatic();
                mob.setIdMobil(rs.getInt("idmobil"));
                mob.setMerek(rs.getString("merek"));
                mob.setPlat(rs.getString("plat"));
                mob.setCc(rs.getString("cc"));
                mob.setBahanBakar(rs.getString("bahanbakar"));
                mob.setJenisTransmisi(rs.getString("jenistransmisi"));
                mob.setHarga(rs.getInt("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mob;
    }

    public ArrayList<MobilMatic> getAll() {
        ArrayList<MobilMatic> ListMobilMatic = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM mobil");

        try {
            while (rs.next()) {
                MobilMatic mob = new MobilMatic();
                mob.setIdMobil(rs.getInt("idmobil"));
                mob.setMerek(rs.getString("merek"));
                mob.setPlat(rs.getString("plat"));
                mob.setCc(rs.getString("cc"));
                mob.setBahanBakar(rs.getString("bahanbakar"));
                mob.setJenisTransmisi(rs.getString("jenistransmisi"));
                mob.setHarga(rs.getInt("harga"));

                ListMobilMatic.add(mob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMobilMatic;
    }

    public ArrayList<MobilMatic> search(String keyword) {
        ArrayList<MobilMatic> ListMobilMatic = new ArrayList();
        String sql = "SELECT * FROM mobil WHERE "
                + "merek LIKE '%" + keyword + "%'"
                + "OR jenistransmisi LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                MobilMatic mob = new MobilMatic();
                mob.setIdMobil(rs.getInt("idmobil"));
                mob.setMerek(rs.getString("merek"));
                mob.setPlat(rs.getString("plat"));
                mob.setCc(rs.getString("cc"));
                mob.setBahanBakar(rs.getString("bahanbakar"));
                mob.setJenisTransmisi(rs.getString("jenistransmisi"));
                mob.setHarga(rs.getInt("harga"));

                ListMobilMatic.add(mob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMobilMatic;
    }

    @Override
    public void save() {
        if (getById(idMobil).getIdMobil() == 0) {
            String SQL = "INSERT INTO mobil (merek, plat, cc, bahanbakar, jenistransmisi, harga, jenismesin) VALUES("
                    + "'" + this.merek + "',"
                    + "'" + this.plat + "',"
                    + "'" + this.cc + "',"
                    + "'" + this.bahanBakar + "',"
                    + "'" + this.jenisTransmisi + "',"
                    + "'" + this.harga + "',"
                    + "'-'"
                    + ")";
            this.idMobil = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE mobil set "
                    + "merek = '" + this.merek + "', "
                    + "plat = '" + this.plat + "',"
                    + "cc = '" + this.cc + "',"
                    + "jenistransmisi = '" + this.jenisTransmisi + "',"
                    + "harga = '" + this.harga + "',"
                    + "bahanbakar = '" + this.bahanBakar + "'"
                    + " WHERE idmobil = '" + this.idMobil + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM mobil WHERE idmobil = '" + this.idMobil + "'";
        DBHelper.executeQuery(SQL);
    }
}
