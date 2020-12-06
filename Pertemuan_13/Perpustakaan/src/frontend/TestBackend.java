package frontend;
import backend.*;

/**
 *
 * @author ASUS GAMiNG
 */
public class TestBackend {

    public static void main(String[] args) {
        Kategori novel = new Kategori().getById(27);
        Kategori referensi = new Kategori().getById(28);

        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.save();
        buku2.save();

        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();

        // test delete
        buku3.delete();

        // test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        // test search
        for (Buku b : new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }
}
