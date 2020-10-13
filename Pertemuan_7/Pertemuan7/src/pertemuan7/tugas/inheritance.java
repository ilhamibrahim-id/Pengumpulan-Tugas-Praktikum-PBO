package pertemuan7.tugas;

import java.util.Scanner;

public class inheritance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        do{
        System.out.println("=================Program Tampil Spek Komputer================");
        System.out.println("1. Laptop Mac");
        System.out.println("2. Laptop Windows");
        System.out.println("3. Pc");
        System.out.println("4. Exit");
        System.out.println("pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                mac m = new mac();
                System.out.println("Masukan Merk : ");
                m.merk=input.next();
                System.out.println("Masukan Kecepatan Prosessor " + m.merk + " : (Ghz)");
                m.kecProsesor = input.nextInt();
                System.out.println("Masukan Size Memory " + m.merk +" : (GB)");
                m.sizeMemory = input.nextInt();
                System.out.println("Masukan Prosessor " + m.merk + " : ");
                m.jnsProsesor = input.next();
                System.out.println("Jenis Battery " + m.merk + " : ");
                m.jnsBatrei=input.next();
                System.out.println("Jenis Security " + m.merk+ " : ");
                m.security=input.next();
                m.tampilMac();
                break;
            case 2:
                windows w = new windows();
                System.out.println("Masukan Merk : ");
                w.merk=input.next();
                System.out.println("Masukan Kecepatan Prosessor " + w.merk + " : (Ghz)");
                w.kecProsesor = input.nextInt();
                System.out.println("Masukan Size Memory " + w.merk +" : (GB)");
                w.sizeMemory = input.nextInt();
                System.out.println("Masukan Prosessor " + w.merk + " : ");
                w.jnsProsesor = input.next();
                System.out.println("Jenis Battery " + w.merk + " : ");
                w.jnsBatrei=input.next();
                System.out.println("Masukan Fitur " + w.merk + " : ");
                w.fitur=input.next();
                w.tampilWindows();
                break;
            case 3:
                pc p = new pc();
                System.out.println("Masukan Merk : ");
                p.merk=input.next();
                System.out.println("Masukan Kecepatan Prosessor " + p.merk + " : (Ghz)");
                p.kecProsesor = input.nextInt();
                System.out.println("Masukan Size Memory " + p.merk +" : (GB)");
                p.sizeMemory = input.nextInt();
                System.out.println("Masukan Prosessor " + p.merk + " : ");
                p.jnsProsesor = input.next();
                System.out.println("Ukuran monitor " + p.merk + " : ");
                p.ukuranMonitor=input.nextInt();
                p.tampilPc();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih > 4);
    }
}
