package tugasminggu2;

import java.util.Scanner;

public class LuasDanKelilingLingkaran {

    public double phi = 3.14, r;

    public LuasDanKelilingLingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return (phi * r * r);
    }

    public double hitungKeliling() {
        return (2 * phi * r);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiR = 0;
        int pilih = 0;
        do {
            System.out.println("Masukan Jari Jari Lingkaran");
            nilaiR = input.nextDouble();
            LuasDanKelilingLingkaran rNilai = new LuasDanKelilingLingkaran(nilaiR);
            System.out.println("=========================================================================");
            System.out.println("         Program Mencari Luas Dan Keliling Lingkaran");
            System.out.println("=========================================================================");
            System.out.println("1. Mencari Luas Lingkaran");
            System.out.println("2. Mencari Keliling Lingkaran");
            System.out.println("3. EXIT");
            System.out.println("pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("=========================================================================");
                    System.out.println("                     Mencari Luas Lingkaran ");
                    System.out.println("=========================================================================");
                    System.out.println("Luas Lingkaran : " + rNilai.hitungLuas());
                    System.out.println("=========================================================================");
                    break;
                case 2:
                    System.out.println("=========================================================================");
                    System.out.println("                     Mencari Keliling Lingkaran ");
                    System.out.println("=========================================================================");
                    System.out.println("Luas Lingkaran : " + rNilai.hitungKeliling());
                    System.out.println("=========================================================================");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("MASUKAN INPUTAN YANG BENAR");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih > 3);
    }
}
