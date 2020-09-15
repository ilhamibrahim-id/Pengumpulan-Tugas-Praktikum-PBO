# Laporan Jobsheet Praktikum PBO Minggu Ke 3

## Percobaan 1

### Source Code


- class Motor Demo


<img src="img/Screenshot (209).png">

- class Motor


<img src="img/Screenshot (210).png">

### output

<img src="img/Screenshot (211).png">

## Percobaan 2

### Source Code 

- class motor

<img src="img/Screenshot (212).png">

- class motor demo

<img src="img/Screenshot (213).png">

### output

<img src="img/Screenshot (214).png">

### pertanyaan 

1. Pada	class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul	peringatan	“Kecepatan tidak bisa bertambah karena Mesin Off!”?	

- jawaban 
karena mesin belum dinyalakan maka kontak on masih keadaan false sehingga tidak bisa ditambahkan kecepatanya.

2. Mengapat	atribut	kecepatan dan kontakOn diset private?

- jawaban 
karena atribut tersebut hanya di gunakan untuk class motor saja hal ini dapat meringakan memory untuk menjalankan program.
3. Ubah	class Motor sehingga kecepatan maksimalnya adalah 100!
- output 

<img src="img/Screenshot (224).png">

- Source Code

<img src="img/Screenshot (225).png">

## Percobaan 3

### Source Code

- class anggota

<img src="img/Screenshot (215).png">

- class koperasi demo

<img src="img/Screenshot (216).png">

### output

<img src="img/Screenshot (217).png">

## Percobaan 4

### Source Code

- class koperasi demo

<img src="img/Screenshot (218).png">

- class anggota

<img src="img/Screenshot (220).png">

- passing parameter class anggota

<img src="img/Screenshot (221).png">

### output

<img src="img/Screenshot (219).png">

### pertanyaan 

1. Apa yang	dimaksud getter	dan	setter?<br>
getter untuk mendapatkan data yang telah di inputkan melalui setter atau memasukan data baru.<br>
2. Apa kegunaan	dari method	getSimpanan()?<br>
untuk menyimpan data angka setor maupun pinjam.<br>
3. Method apa yang digunakan untuk menambah saldo?<br>
public void setor<br>
4. Apa yang dimaksud konstruktor?<br>
konstruktor untuk menginisialisasi kepada sebuah objek pada objek pertama kali diciptakan.<br>
5. Sebutkan	aturan dalam membuat konstruktor?<br>suatu konstruktor tidak dapat diwariskan , bisa memiliki akses modifer private,konstruktor default akan memiliki akses modifier yang sama dengan classnya,Constructor default dari superclass akan dipanggil oleh constructor subclass-nya.<br>
6.  Apakah boleh konstruktor bertipe private?<br>bisa namun tidak bisa dibuat instasiasi diluar class tersebut.<br>
7. Kapan menggunakan parameter dengan passsing parameter?<br> Hal ini biasa dilakukan untuk atribut yang membutuhkan nilai yang spesifik. Jika tidak membutuhkan nilai spesifik dalam konstruktor tidak perlu parameter.<br>
8. Apa perbedaan atribut class dan instansiasi	atribut?<br>atribut class adalah sebuah class memiliki atribut , sedangkan instansiasi adalah berfungsi untuk mengakses atribut walaupun dengan class yang berbeda.<br>
9. Apa perbedaan class method dan instansiasi method?<br>atribut class adalah sebuah class memiliki method , sedangkan instansiasi adalah berfungsi untuk mengakses method memberikan nilai pada method walaupun dengan class yang berbeda.<br>

## Tugas

### Pertanyaan 

1. 
<img src="img/Screenshot (240).png">
2. Pada	program	diatas,	pada class EncapTest kita mengeset age dengan nilai 35,	namun pada saat ditampilkan	ke layar nilainya  30,	jelaskan mengapa.<br>
karena pada method set age maksimal agenya adalah 30.<br>
3. Ubah	program	diatas agar atribut age	dapat diberi nilai maksimal 30 dan minimal 18.<br>

### source code
- class encapdemo

<img src="img/Screenshot (226).png">

- class encaptest 

<img src="img/Screenshot (242).png">

### output
<img src="img/Screenshot (241).png">

4. Pada	sebuah	sistem	informasi	koperasi	simpan	pinjam,	terdapat	class	Anggota	yang	memiliki	
atribut	antara	lain	nomor	KTP,	nama,	limit	peminjaman,	dan	jumlah	pinjaman.	Anggota	
dapat	meminjam	uang	dengan	batas	limit	peminjaman	yang	ditentukan.	Anggota	juga	dapat	
mengangsur	pinjaman.	Ketika	Anggota	tersebut	mengangsur	pinjaman,	maka	jumlah	
pinjaman akan berkurang sesuai dengan	nominal	yang diangsur.Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan.Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.

### Source Code

- class anggota

<img src="img/Screenshot (234).png">
<img src="img/Screenshot (235).png">

- classs TestKoperasi 

<img src="img/Screenshot (231).png">

### output 

<img src="img/Screenshot (230).png">

5. Modifikasi soal no.4 agar nominal	yang dapat diangsur minimal	adalah	10%	dari jumlah pinjaman saat ini.Jika mengangsur kurang dari itu, maka muncul	peringatan “Maaf,angsuran harus 10% dari jumlah pinjaman”.
### Source Code

- class anggota

<img src="img/Screenshot (229).png">

- classs TestKoperasi 

<img src="img/Screenshot (227).png">

### output 

<img src="img/Screenshot (228).png">
6. Modifikasi class TestKoperasi,agar jumlah pinjaman dan angsuran dapat menerima input dari console.

### Source Code

- class anggota

<img src="img/Screenshot (234).png">
<img src="img/Screenshot (235).png">
<img src="img/Screenshot (236).png">

- classs TestKoperasi 

<img src="img/Screenshot (237).png">
<img src="img/Screenshot (238).png">

### output

<img src="img/Screenshot (239).png">


