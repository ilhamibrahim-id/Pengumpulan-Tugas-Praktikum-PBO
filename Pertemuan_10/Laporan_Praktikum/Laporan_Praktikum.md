# Laporan Praktikum PBO Minggu Ke 10

# Abstract Class

## Class Hewan

<img src="img/Screenshot (334).png">

## Class Kucing

<img src="img/Screenshot (335).png">

## Class Ikan

<img src="img/Screenshot (336).png">

## Class Orang

<img src="img/Screenshot (337).png">

## Class Program

<img src="img/Screenshot (338).png">

## Output

<img src="img/Screenshot (339).png">

Pertanyaan diskusi :
Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak
mengimplementasikan method abstract yang ada di class induknya? Buktikan!<br>
Jawab : <br>
tidak bisa harus mengikuti method abstract yang sesuai maka akan bisa dideklarasikan di class yang lain.

Pertanyaan
1. Berikan penjelasan terkait tentang jalannya program diatas<br>
jawab :<br>
program menampilkan nama orang berserta hewan peliharaan dan menampilkan cara bergerak hewanya menggunakan method absctart.
2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method
bergerak() diubah menjadi method abstract! <br>
jawab :<br>
method abstract bergerak() diberikan nilai yang berbeda di class kucing dan ikan dengan extends maka jika kita menampilkan hewan kucing dan ikan untuk method bergerak() memberikan nilai yang berbeda maka akan muncul berbeda walau deklrasi method hanya di class hewan.<br>
public abstract void bergerak();<br>
public class Kucing extends Hewan{<br>
    public void bergerak() {<br>
        System.out.println("Berjalan dengan KAKI, \"Tap..tap..\"");<br>
    }
}<br>
public class Ikan extends Hewan{<br>
    public void bergerak() {<br>
        System.out.println("Berenang dengan SIRIP, \"wush..wush..\"");<br>
    }
}<br>
3. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan
overriding terhadap method bergerak() <br>
jawab : <br>
abstract method tidak memiliki tubuh (hanya deklrasinya saja) maka ini membutuhkan overidding
jika tidak melakukan overiding maka dianggap method baru bukan menggunkan method di class hewan.<br>
public void bergerak() {<br>
    }<br>
public abstract void bergerak();<br>
4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method
bergerak()yang dideklarasikan dalam Class Ikan <br>
jawab :<br>
public class Ikan extends Hewan{ <br>
    public void bergerak() { <br>
        System.out.println("Berenang dengan SIRIP, \"wush..wush..\""); <br>
    }
}<br>
mengambil method pada class hewan dan dideklrasikan pada class ikan dengan print "Berenang dengan SIRIP, \"wush..wush..\""
