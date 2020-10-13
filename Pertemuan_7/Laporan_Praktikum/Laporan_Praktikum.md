# Laporan Praktikum PBO Minggu Ke 7

## Percobaan 1

### Jawaban Pertanyaan

1. super class : class karyawan
sub class : manager dan staf 
karena manager dan staf mewakili karyawan.
2. extends dan super.
3. yang dimiliki class manager sama dengan karyawan String nama,String alamat,String jk,int umur,int gaji dan dipanggil dimanager melalui super dan ditambahkan atribut tunjangan di class manager.
4. super.gaji adalah memanggil 
atribut dari karyawan yang sudah diberi nilai melalui main dengan deklrasi Manager.
5. Hierarchical Inheritance karena class manager dan class staff memiliki class induk yang sama yaitu karyawan.

## Percobaan 2

### Jawaban Pertanyaan

1. single inheritance manager , multilevel inheritance staf karena class staf awalnya subclass mempunyai subsclass lagi yaitu staf harian dan staf tetap sehingga class staf menjadi superclass dari staf tetap dan staf harian.
2. yang diwarisi oleh staf adalah nama,alamat,jk,umur,gaji,lembur,potongan dan untuk atribut sendiri staftetap mempunyai atribut golongan dan asuransi sedangkan staf harian mempunyai atribut jmljamkerja.
3. untuk memanggil konstruktor pada staf.
4. untuk merujuk method tampildatastaff pada class staf.
5. karena pada konstruktor staftetap sudah merujuk konstruktor staff dengan extends maka jika sudah rujuk menggunakan super maka class tersebut bisa meakses atribut yang sudah terextends maupun super.

## Tugas

### Output 

<img src="img/Screenshot (283).png">
<img src="img/Screenshot (284).png">
<img src="img/Screenshot (286).png">

### Source Code

### Class Main

<img src="img/Screenshot (287).png">
<img src="img/Screenshot (288).png">
<img src="img/Screenshot (289).png">

### Class Komputer

<img src="img/Screenshot (290).png">

### Class Laptop

<img src="img/Screenshot (291).png">

### Class Mac

<img src="img/Screenshot (292).png">

### Class Pc

<img src="img/Screenshot (293).png">

### Class Windows

<img src="img/Screenshot (294).png">

<p> superclass adalah komputer dan mempunyai subclass Laptop dan Pc walaupun laptop subclass tetapi laptop adalah superclass dari class mac dan windows. ini termasuk Hybrid Inheritance yang dimana ditujukan oleh class pc dan laptop sedangkan multilevel inheritancenya ditunjukan oleh class laptop,mac,windows. dibuatlah program untuk menampilkan mac,windows dan pc dengan main pilihan menu melalui switch case dan perulangan agar tidak merun setiap saat dan ada fitur exit untuk berhentikan program yang dijalankan.</p>