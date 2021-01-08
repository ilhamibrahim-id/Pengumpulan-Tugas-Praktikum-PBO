package Backend;

import java.sql.*;
import java.util.ArrayList;

public class MobilManual extends Mobil implements Harga {

    private String jenisMesin;
    private int harga;

    public MobilManual() {
    }

    public MobilManual(String jenisMesin, int harga, String merek, String plat, String cc, String bahanBakar) {
        super(merek, plat, cc, bahanBakar);
        this.jenisMesin = jenisMesin;
        this.harga = harga;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public String getJenisMesin() {
        return jenisMesin;
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

    public MobilManual getById(int id) {
        MobilManual mob = new MobilManual();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM mobil WHERE idmobil = '" + id + "'");

        try {
            while (rs.next()) {
                mob = new MobilManual();
                mob.setIdMobil(rs.getInt("idmobil"));
                mob.setMerek(rs.getString("merek"));
                mob.setPlat(rs.getString("plat"));
                mob.setCc(rs.getString("cc"));
                mob.setBahanBakar(rs.getString("bahanbakar"));
                mob.setJenisMesin(rs.getString("jenismesin"));
                mob.setHarga(rs.getInt("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mob;
    }

    public ArrayList<MobilManual> getAll() {
        ArrayList<MobilManual> ListMobilManual = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM mobil");

        try {
            while (rs.next()) {
                MobilManual mob = new MobilManual();
                mob.setIdMobil(rs.getInt("idmobil"));
                mob.setMerek(rs.getString("merek"));
                mob.setPlat(rs.getString("plat"));
                mob.setCc(rs.getString("cc"));
                mob.setBahanBakar(rs.getString("bahanbakar"));
                mob.setJenisMesin(rs.getString("jenismesin"));
                mob.setHarga(rs.getInt("harga"));

                ListMobilManual.add(mob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMobilManual;
    }

    public ArrayList<MobilManual> search(String keyword) {
        ArrayList<MobilManual> ListMobilManual = new ArrayList();
        String sql = "SELECT * FROM mobil WHERE "
                + "merek LIKE '%" + keyword + "%'"
                + "OR jenismesin LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                MobilManual mob = new MobilManual();
                mob.setIdMobil(rs.getInt("idmobil"));
                mob.setMerek(rs.getString("merek"));
                mob.setPlat(rs.getString("plat"));
                mob.setCc(rs.getString("cc"));
                mob.setBahanBakar(rs.getString("bahanbakar"));
                mob.setJenisMesin(rs.getString("jenismesin"));
                mob.setHarga(rs.getInt("harga"));

                ListMobilManual.add(mob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListMobilManual;
    }

    @Override
    public void save() {
        if (getById(idMobil).getIdMobil() == 0) {
            String SQL = "INSERT INTO mobil (merek, plat, cc, bahanbakar, jenismesin, harga, jenistransmisi) VALUES("
                    + "'" + this.merek + "',"
                    + "'" + this.plat + "',"
                    + "'" + this.cc + "',"
                    + "'" + this.bahanBakar + "',"
                    + "'" + this.jenisMesin + "',"
                    + "'" + this.harga + "',"
                    + "'-'"
                    + ")";
            this.idMobil = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE mobil set "
                    + "merek = '" + this.merek + "', "
                    + "plat = '" + this.plat + "',"
                    + "cc = '" + this.cc + "',"
                    + "jenismesin = '" + this.jenisMesin + "',"
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
