package Backend;

import java.util.ArrayList;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Rental {

    private int idRental;
    private Customer customer;
    private MobilManual manual;
    private MobilMatic matic;
    private String tanggalPinjam, tanggalKembali;
    private int totalBayar;

    public Rental() {
    }

    public Rental(Customer customer, MobilManual manual, MobilMatic matic, String tanggalPinjam, String tanggalKembali, int penanda) {
        this.customer = customer;
        if (penanda == 0) {
            this.manual = manual;
        } else {
            this.matic = matic;
        }
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public void setIdRental(int idRental) {
        this.idRental = idRental;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setManual(MobilManual manual) {
        this.manual = manual;
    }

    public void setMatic(MobilMatic matic) {
        this.matic = matic;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    public int getIdRental() {
        return idRental;
    }

    public Customer getCustomer() {
        return customer;
    }

    public MobilManual getManual() {
        return manual;
    }

    public MobilMatic getMatic() {
        return matic;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public Rental getById(int id) {
        Rental ren = new Rental();

        String query = "SELECT * FROM rental r "
                + "LEFT JOIN customer c ON r.idcustomer = c.idcustomer "
                + "LEFT JOIN mobil m ON m.idmobil = r.idmobil "
                + "WHERE r.idrental = '" + id + "'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                ren = new Rental();
                Customer cus = new Customer();
                ren.setCustomer(cus);
                MobilManual mob1 = new MobilManual();
                ren.setManual(mob1);
                MobilMatic mob2 = new MobilMatic();
                ren.setMatic(mob2);

                ren.setIdRental(rs.getInt("idrental"));
                ren.setTanggalPinjam(rs.getString("tanggalpinjam"));
                ren.setTanggalKembali(rs.getString("tanggalkembali"));
                ren.setTotalBayar(rs.getInt("totalbayar"));
                ren.getCustomer().setIdCustomer(rs.getInt("idcustomer"));
                ren.getCustomer().setNama(rs.getString("nama"));
                ren.getCustomer().setAlamat(rs.getString("alamat"));
                ren.getCustomer().setNik(rs.getString("nik"));
                ren.getManual().setIdMobil(rs.getInt("idmobil"));
                ren.getManual().setMerek(rs.getString("merek"));
                ren.getManual().setPlat(rs.getString("plat"));
                ren.getManual().setCc(rs.getString("cc"));
                ren.getManual().setBahanBakar(rs.getString("bahanbakar"));
                ren.getManual().setJenisMesin(rs.getString("jenismesin"));
                ren.getManual().setHarga(rs.getInt("harga"));
                ren.getMatic().setIdMobil(rs.getInt("idmobil"));
                ren.getMatic().setMerek(rs.getString("merek"));
                ren.getMatic().setPlat(rs.getString("plat"));
                ren.getMatic().setCc(rs.getString("cc"));
                ren.getMatic().setBahanBakar(rs.getString("bahanbakar"));
                ren.getMatic().setJenisTransmisi(rs.getString("jenistransmisi"));
                ren.getMatic().setHarga(rs.getInt("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ren;
    }

    public ArrayList<Rental> getAll() {
        ArrayList<Rental> Rental = new ArrayList();
        String query = "SELECT * FROM rental r "
                + "LEFT JOIN customer c ON r.idcustomer = c.idcustomer "
                + "LEFT JOIN mobil m ON m.idmobil = r.idmobil";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Rental ren = new Rental();
                Customer cus = new Customer();
                ren.setCustomer(cus);
                MobilManual mob1 = new MobilManual();
                ren.setManual(mob1);
                MobilMatic mob2 = new MobilMatic();
                ren.setMatic(mob2);

                ren.setIdRental(rs.getInt("idrental"));
                ren.setTanggalPinjam(rs.getString("tanggalpinjam"));
                ren.setTanggalKembali(rs.getString("tanggalkembali"));
                ren.setTotalBayar(rs.getInt("totalbayar"));
                ren.getCustomer().setIdCustomer(rs.getInt("idcustomer"));
                ren.getCustomer().setNama(rs.getString("nama"));
                ren.getCustomer().setAlamat(rs.getString("alamat"));
                ren.getCustomer().setNik(rs.getString("nik"));
                ren.getManual().setIdMobil(rs.getInt("idmobil"));
                ren.getManual().setMerek(rs.getString("merek"));
                ren.getManual().setPlat(rs.getString("plat"));
                ren.getManual().setCc(rs.getString("cc"));
                ren.getManual().setBahanBakar(rs.getString("bahanbakar"));
                ren.getManual().setJenisMesin(rs.getString("jenismesin"));
                ren.getManual().setHarga(rs.getInt("harga"));
                ren.getMatic().setIdMobil(rs.getInt("idmobil"));
                ren.getMatic().setMerek(rs.getString("merek"));
                ren.getMatic().setPlat(rs.getString("plat"));
                ren.getMatic().setCc(rs.getString("cc"));
                ren.getMatic().setBahanBakar(rs.getString("bahanbakar"));
                ren.getMatic().setJenisTransmisi(rs.getString("jenistransmisi"));
                ren.getMatic().setHarga(rs.getInt("harga"));
                Rental.add(ren);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Rental;
    }

    public ArrayList<Rental> search(String keyword) {
        ArrayList<Rental> Rental = new ArrayList();
        String query = "SELECT * FROM rental r "
                + "LEFT JOIN customer c ON r.idcustomer = c.idcustomer "
                + "LEFT JOIN mobil m ON m.idmobil = r.idmobil "
                + "WHERE c.nama LIKE '%" + keyword + "%'"
                + "OR c.alamat LIKE '%" + keyword + "%'"
                + "OR c.nik LIKE '%" + keyword + "%'"
                + "OR m.merek LIKE '%" + keyword + "%'"
                + "OR m.plat LIKE '%" + keyword + "%'"
                + "OR m.cc LIKE '%" + keyword + "%'"
                + "OR m.bahanbakar LIKE '%" + keyword + "%'"
                + "OR m.jenismesin LIKE '%" + keyword + "%'"
                + "OR m.jenistransmisi LIKE '%" + keyword + "%'"
                + "OR m.harga LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Rental ren = new Rental();
                Customer cus = new Customer();
                ren.setCustomer(cus);
                MobilManual mob1 = new MobilManual();
                ren.setManual(mob1);
                MobilMatic mob2 = new MobilMatic();
                ren.setMatic(mob2);

                ren.setIdRental(rs.getInt("idrental"));
                ren.setTanggalPinjam(rs.getString("tanggalpinjam"));
                ren.setTanggalKembali(rs.getString("tanggalkembali"));
                ren.setTotalBayar(rs.getInt("totalbayar"));
                ren.getCustomer().setIdCustomer(rs.getInt("idcustomer"));
                ren.getCustomer().setNama(rs.getString("nama"));
                ren.getCustomer().setAlamat(rs.getString("alamat"));
                ren.getCustomer().setNik(rs.getString("nik"));
                ren.getManual().setIdMobil(rs.getInt("idmobil"));
                ren.getManual().setMerek(rs.getString("merek"));
                ren.getManual().setPlat(rs.getString("plat"));
                ren.getManual().setCc(rs.getString("cc"));
                ren.getManual().setBahanBakar(rs.getString("bahanbakar"));
                ren.getManual().setJenisMesin(rs.getString("jenismesin"));
                ren.getManual().setHarga(rs.getInt("harga"));
                ren.getMatic().setIdMobil(rs.getInt("idmobil"));
                ren.getMatic().setMerek(rs.getString("merek"));
                ren.getMatic().setPlat(rs.getString("plat"));
                ren.getMatic().setCc(rs.getString("cc"));
                ren.getMatic().setBahanBakar(rs.getString("bahanbakar"));
                ren.getMatic().setJenisTransmisi(rs.getString("jenistransmisi"));
                ren.getMatic().setHarga(rs.getInt("harga"));
                Rental.add(ren);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Rental;
    }

    public void save(int penanda) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        if (getById(idRental).getIdRental() == 0) {
            try {
                java.util.Date tanggalPinjam = format.parse(this.tanggalPinjam);
                java.sql.Date sqlTanggalPinjam = new java.sql.Date(tanggalPinjam.getTime());
                java.util.Date tanggalKembali = format.parse(this.tanggalKembali);
                java.sql.Date sqlTanggalKembali = new java.sql.Date(tanggalKembali.getTime());
                String SQL;
                if (penanda == 0) {
                    SQL = "INSERT INTO rental (idcustomer, idmobil, tanggalpinjam, tanggalkembali, totalbayar) VALUES("
                            + "'" + this.getCustomer().getIdCustomer() + "',"
                            + "'" + this.getManual().getIdMobil() + "',"
                            + "'" + sqlTanggalPinjam + "',"
                            + "'" + sqlTanggalKembali + "',"
                            + "'" + this.totalBayar + "'"
                            + ")";
                } else {
                    SQL = "INSERT INTO rental (idcustomer, idmobil, tanggalpinjam, tanggalkembali, totalbayar) VALUES("
                            + "'" + this.getCustomer().getIdCustomer() + "',"
                            + "'" + this.getMatic().getIdMobil() + "',"
                            + "'" + sqlTanggalPinjam + "',"
                            + "'" + sqlTanggalKembali + "',"
                            + "'" + this.totalBayar + "'"
                            + ")";
                }

                this.idRental = DBHelper.insertQueryGetId(SQL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (penanda == 0) {
                String SQL = "UPDATE rental SET"
                        + "idcustomer = '" + this.getCustomer().getIdCustomer() + "',"
                        + "idmobil = '" + this.getManual().getIdMobil() + "',"
                        + "tanggalpinjam = '" + this.tanggalPinjam + "',"
                        + "tanggalkembali ='" + this.tanggalKembali + "',"
                        + "totalbayar ='" + this.totalBayar + "'"
                        + ")";
                DBHelper.executeQuery(SQL);
            } else {
                String SQL = "UPDATE rental SET"
                        + "idcustomer = '" + this.getCustomer().getIdCustomer() + "',"
                        + "idmobil = '" + this.getMatic().getIdMobil() + "',"
                        + "tanggalpinjam = '" + this.tanggalPinjam + "',"
                        + "tanggalkembali ='" + this.tanggalKembali + "',"
                        + "totalbayar ='" + this.totalBayar + "'"
                        + ")";
                DBHelper.executeQuery(SQL);
            }
        }
    }

    public void delete() {
        String SQL = "DELETE FROM rental WHERE idrental = '" + this.idRental + "'";
        DBHelper.executeQuery(SQL);
    }
}
