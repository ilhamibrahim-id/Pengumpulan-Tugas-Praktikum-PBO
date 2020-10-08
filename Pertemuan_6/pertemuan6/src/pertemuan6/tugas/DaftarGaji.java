package pertemuan6.tugas;

import java.util.ArrayList;

public class DaftarGaji {

    private Pegawai[] listPegawai;
    private int currentPegawai = 0;

    public DaftarGaji(int jumlah_pegawai) {
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai p) {
        if (listPegawai.length == currentPegawai) {
            System.out.println("Data Penuh");
        } else {
            listPegawai[currentPegawai] = p;
            currentPegawai++;
        }
    }

    public void printSemuaGaji() {
        System.out.println("||Nama||\t||Alamat||\t||Nip||\t\t||gaji||");
        for (int i = 0; i < currentPegawai; i++) {
            System.out.println("||" + listPegawai[i].getNama() + "||\t||" + listPegawai[i].getAlamat() + "||\t||" + listPegawai[i].getNip() + "||\t||" + listPegawai[i].getGaji() + "||");
        }
    }
}
