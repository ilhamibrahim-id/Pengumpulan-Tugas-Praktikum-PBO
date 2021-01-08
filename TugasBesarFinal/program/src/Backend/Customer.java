package Backend;

import java.sql.*;
import java.util.ArrayList;

public class Customer implements CRUD {

    private int idCustomer;
    private String nama, alamat, nik;

    public Customer() {
    }

    public Customer(String nama, String alamat, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNik() {
        return nik;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public Customer getById(int id) {
        Customer cus = new Customer();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer WHERE idcustomer = '" + id + "'");

        try {
            while (rs.next()) {
                cus = new Customer();
                cus.setIdCustomer(rs.getInt("idcustomer"));
                cus.setNama(rs.getString("nama"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNik(rs.getString("nik"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cus;
    }

    public ArrayList<Customer> getAll() {
        ArrayList<Customer> ListCustomer = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM customer");

        try {
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setIdCustomer(rs.getInt("idcustomer"));
                cus.setNama(rs.getString("nama"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNik(rs.getString("nik"));

                ListCustomer.add(cus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListCustomer;
    }

    public ArrayList<Customer> search(String keyword) {
        ArrayList<Customer> ListCustomer = new ArrayList();
        String sql = "SELECT * FROM customer WHERE "
                + "nama LIKE '%" + keyword + "%'"
                + "OR alamat LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Customer cus = new Customer();
                cus.setIdCustomer(rs.getInt("idcustomer"));
                cus.setNama(rs.getString("nama"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNik(rs.getString("nik"));

                ListCustomer.add(cus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListCustomer;
    }

    @Override
    public void save() {
        if (getById(idCustomer).getIdCustomer() == 0) {
            String SQL = "INSERT INTO customer (nama, alamat, nik) VALUES("
                    + "'" + this.nama + "',"
                    + "'" + this.alamat + "',"
                    + "'" + this.nik + "'"
                    + ")";
            this.idCustomer = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE customer set "
                    + "nama = '" + this.nama + "', "
                    + "alamat = '" + this.alamat + "',"
                    + "nik = '" + this.nik + "'"
                    + " WHERE idcustomer = '" + this.idCustomer + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM customer WHERE idcustomer = '" + this.idCustomer + "'";
        DBHelper.executeQuery(SQL);
    }
}
