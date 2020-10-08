# Laporan Praktikum Pertemuan 6
## Percobaan 1 Jawaban

1. menambahkan extends pada classB : public class classB extends classA { }

2. karena belum terhubung dengan classA dan classB sehingga atribut di classA tidak bisa digunakan.

## Percobaan 2 Jawaban

1. menambahkan extends pada classB : public class classB extends classA { } dan merubah atribut x dan y menjadi public.

2. pada classA atribut x dan y menggunakan modifier private dan hanya bisa digunakan dalam satu class maka dirubah menjadi public.

## Percobaan 3 Jawaban

1. untuk merunjuk pada member dari parent classA atau bisa dikatakan memanggil atribut dengan beda class menggunakan super.

2. super memanggil atribut dari class berbeda dan untuk this adalah atribut dalam satu class maka pemanggilanya menggunakan this.

3. karena super bisa mengakses atribut dengan beda class tanpa membuat class baru.

## Percobaan4 Jawaban

1. superclass : classA ,subclass : classB dan classC.
superclass merujuk pada kelas yang dijadikan acuan melalui extends dan class c dan class B menrujuk ke classA

2. super() merujuk memangil konstruktor superclass.

3. karena super() hanya bisa digunakan dibaris pertama dalam konstruktor.
sebelum subclass menjalankan konstruktornya sendiri,maka subclass menjalankan kontruktor superclass terlebih dahulu.

4. super() merujuk memangil konstruktor superclass.

## Tugas Jawaban

## Output

<img src="img/Screenshot (274).png">
<img src="img/Screenshot (275).png">

## Source Code

### Daftar Gaji Class

<img src="img/Screenshot (276).png">

### Dosen

<img src="img/Screenshot (278).png">

### Pegawai

<img src="img/Screenshot (279).png">
<img src="img/Screenshot (280).png">

### Main

<img src="img/Screenshot (281).png">
<img src="img/Screenshot (282).png">

<p> program menyimpan gaji karyawan dengan menambahkan fitur menu akan memudahkan admin meninput data karyawan dan diberi batas untuk memasukan data sehingga saat data penuh akan muncul data penuh gaji karyawan mendapatkan gaji pokok 2 jt dan gaji dosen jumlah sks di kalikan rp 150.000</p>