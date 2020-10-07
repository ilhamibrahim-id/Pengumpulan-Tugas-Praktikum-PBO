
package kelilingbangundatar;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0, pilih2 = 0;
        do{
        System.out.println("==========================================");
        System.out.println("              BANGUN DATAR");
        System.out.println("==========================================");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                persegiPanjang p = new persegiPanjang();
                System.out.println("Masukan Panjang : ");
                p.panjang = input.nextFloat();
                System.out.println("Masukan Lebar : ");
                p.lebar = input.nextFloat();
                p.luas();
                p.keliling();

                break;
            case 2:
                lingkaran l = new lingkaran();
                System.out.println("Masukan jari jari :");
                l.r = input.nextFloat();
                l.luas();
                l.lingkaran();
                break;
            case 3:
                segitiga s = new segitiga();
                System.out.println("Masukan alas : ");
                s.alas = input.nextFloat();
                System.out.println("Masukan tinggi : ");
                s.tinggi = input.nextFloat();
                s.luas();
                s.keliling();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("salah input!!");
                break;

        }
        
    }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih
                > 4);
    }
}
