package Backend;

import java.sql.*;
import java.util.ArrayList;

public abstract class Mobil implements CRUD {

    public int idMobil;
    public String merek, plat, cc, bahanBakar;

    public Mobil() {

    }

    public Mobil(String merek, String plat, String cc, String bahanBakar) {
        this.merek = merek;
        this.plat = plat;
        this.cc = cc;
        this.bahanBakar = bahanBakar;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    abstract void setBahanBakar(String bahanBakar);

    public int getIdMobil() {
        return idMobil;
    }

    public String getMerek() {
        return merek;
    }

    public String getPlat() {
        return plat;
    }

    public String getCc() {
        return cc;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }
}
