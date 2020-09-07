package tugasminggu2;

import java.util.Scanner;

public class HargaJual_no4 {

    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - ((diskon / 100) * hargaDasar));
    }

    public void noKode(String value) {
        kode = value;
    }

    public void nameBarang(String value) {
        namaBarang = value;
    }

    public void hargaDasar(int value) {
        hargaDasar = value;
    }

    public void diskon(int value) {
        diskon = value;
    }

    public void tampilData() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("diskon : " + diskon);
        System.out.println("harga jual : " + hitungHargaJual());
        System.out.println("==========================================");
        System.out.println("            Tranksasi sukses");
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HargaJual_no4 hj = new HargaJual_no4();
        int pilih = 0, pilih2;
        do {
            System.out.println("=================================================");
            System.out.println("                  UDUR-UDUR MART");
            System.out.println("=================================================");
            System.out.println("1.(PTX) udur udur premium (500ml) - Rp.35.000,-");
            System.out.println("2.(PLT) udur udur lite (500ml) - Rp.30.000,-");
            System.out.println("3.(BDR) bland durian (125ml) - Rp.25.000,-");
            System.out.println("4.exit");
            System.out.println("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    hj.noKode("PTX");
                    hj.nameBarang("udur udur premium (500ml)");
                    hj.hargaDasar(35000);
                    System.out.println("=================================================");
                    System.out.println("                  UDUR-UDUR MART");
                    System.out.println("=================================================");
                    System.out.println("=================Diskon Member==================");
                    System.out.println("1. Member junior diskon (15%)");
                    System.out.println("2. Member senior diskon (30%)");
                    System.out.println("3. Tanpa Member");
                    System.out.println("pilih : ");
                    pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            hj.diskon(15);
                            hj.tampilData();
                            break;
                        case 2:
                            hj.diskon(30);
                            hj.tampilData();
                            break;
                        case 3:
                            hj.diskon(0);
                            hj.tampilData();
                            break;
                        default:
                            System.out.println("MASUKAN INPUTAN YANG BENAR");
                            break;
                    }
                    break;
                case 2:
                    hj.noKode("PLT");
                    hj.nameBarang("udur udur lite (500ml)");
                    hj.hargaDasar(30000);
                    System.out.println("=================================================");
                    System.out.println("                  UDUR-UDUR MART");
                    System.out.println("=================================================");
                    System.out.println("=================Diskon Member==================");
                    System.out.println("1. Member junior diskon (15%)");
                    System.out.println("2. Member senior diskon (30%)");
                    System.out.println("3. Tanpa Member");
                    System.out.println("pilih : ");
                    pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            hj.diskon(15);
                            hj.tampilData();
                            break;
                        case 2:
                            hj.diskon(30);
                            hj.tampilData();
                            break;
                        case 3:
                            hj.diskon(0);
                            hj.tampilData();
                            break;
                        default:
                            System.out.println("MASUKAN INPUTAN YANG BENAR");
                            break;
                    }
                    break;
                case 3:
                    hj.noKode("BDR");
                    hj.nameBarang("blend durian (125ml)");
                    hj.hargaDasar(25000);
                    System.out.println("=================================================");
                    System.out.println("                  UDUR-UDUR MART");
                    System.out.println("=================================================");
                    System.out.println("=================Diskon Member==================");
                    System.out.println("1. Member junior diskon (15%)");
                    System.out.println("2. Member senior diskon (30%)");
                    System.out.println("3. Tanpa Member");
                    System.out.println("pilih : ");
                    pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            hj.diskon(15);
                            hj.tampilData();
                            break;
                        case 2:
                            hj.diskon(30);
                            hj.tampilData();
                            break;
                        case 3:
                            hj.diskon(0);
                            hj.tampilData();
                            break;
                        default:
                            System.out.println("MASUKAN INPUTAN YANG BENAR");
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("MASUKAN INPUTAN YANG BENAR");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih > 4);

    }
}
