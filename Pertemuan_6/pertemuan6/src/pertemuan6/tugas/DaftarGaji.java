/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6.tugas;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class DaftarGaji {

    public Pegawai listPegawai[] ;

    public DaftarGaji() {
    }

    public boolean isEmpty() {
        return listPegawai == null;
    }

    public void addPegawai(Pegawai pegawai) {
        if (!isEmpty()) {
            for (int i = 0; i < listPegawai.length; i++) {
                listPegawai[i] = pegawai;
            }
        } else {
            System.out.println("Data Penuh");
        }

    }

    public void printSemuaGaji() {
        for (int i = 0; i < listPegawai.length; i++) {
            if (isEmpty()) {
                break;
            } else {
                System.out.println("nama : " + listPegawai[i].nama);
                System.out.println("alamat : " + listPegawai[i].alamat);
                System.out.println("nip : " + listPegawai[i].nip);
                System.out.println("gaji : " + listPegawai[i].gaji);
            }
        }

    }
}
