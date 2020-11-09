# Laporan Praktikum PBO Pertemuan 11

# Pertanyaan Percobaan 1

1. Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut.
Jelaskan penyebab terjadinya hal tersebut ? <br>
jawab : <br>
karena icumlaude berada pada satu package tidak perlu menggunakan import sudah bisa memakai.<br>
2. Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut
dihilangkan? Jelaskan menurut pemahaman anda. <br>
jawab : <br>
tidak terjadi error apapun karena tidak perlu lagi untuk mengimport icumlaude yang berada pada satu package<br>
3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!<br>
jawab : <br>
karena pada class mahasiswa tidak ada method icumlaude jika ingin memberikan nilai pada berisertifikat maka class mahasiswa harus diberikan method lulus dan meraih ipk tinggi agar tidak terjadi error.<br>
4. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class
Program? Mengapa demikian? <br>
jawab : <br>
bisa karena class sarjana me extends class mahasiswa yang memiliki method kuliahDiKampus().<br>
5. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method
beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?<br>
jawab : <br>
tidak bisa karena method kuliahDiKampus tidak masuk ke dalam interface icumlaude sehingga tidak terdeteksi untuk methodnya.<br>
6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi
class Program menjadi seperti berikut ini:
<br>
jawab : <br>
menambahkan method kuliahDiKampus() di class sarjana dan class pasca sarjana <br>
<img src="img/Screenshot (343).png">
<br>

# Percobaan 2: Multiple Interfaces Implementation

## memperbaiki langkah 5 

<p>dengan menambahkan semua method dari IBrepestasi maka sarjana bisa dilakukan untuk method berisertifikatmawapres.</p>

# Pertanyaan Percobaan 2

1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar
dibawah ini :
<br>
<img src="img/Screenshot (344).png"> <br>
jawab : <br>
<img src="img/Screenshot (344) - Copy.png">
<br>tidak bisa karena interface bersifat public dan akan digunakan di beda class maupun beda package, interface sebagai display saja tidak ada apa apa selain abstract method jika ingin memberikan nilai di class lainya.<br>

2. Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? <br>
jawab : <br>
class intefaces tidak bisa di instasiasi objek karena interface iberprestasi bukan merupakan objek namun file interfaces.
<br>

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat
mawapres pada objek sarjanaCumlaude <br>
menambahkan method <br>
jawab : <br>
<img src="img/Screenshot (345).png"><br>
maka hasilnya seperti berikut : <br>
<img src="img/Screenshot (346).png">

# Tugas

# Source Code

## Class Binatang : 

<img src="img/Screenshot (347).png">
<br>
<p>Class ini menggunakan absctract yang akan mewariskan nama dan jml kaki ke class lainya yang memiliki setter dan getter untuk menambakan dan mengambil nama dan jml kaki.</p>

## Interface IKarnivora : 

<img src="img/Screenshot (348).png">
<br>
<p>interface ini untuk menampilkan makanan hewan karnivora</p>


## Interface IHerbivora : 

<img src="img/Screenshot (349).png">
<br>
<p>interface ini untuk menampilkan makanan hewan herbivora</p>


## Class Keledai : 

<img src="img/Screenshot (350).png">
<br>
<p>didalam class kedelai terdapat konstruktor dimana ada atribut nama dan jmlkaki yang berasala dari class abstract binatang dan atribut 2 tambahan suara dan warna bulu class ini di implementasikan ke herbivora karena kedelai adalah herbivora lalu memberikan nilai di display makanan yang sesuai dan memberikan nilai display binatang untuk mengetahui jenis binatangnya dan untuk mendapatkan nama,jumlahkaki,suara maupun warna bulu di deklrasikan di method displaydata this untuk mengambil nilai atribut class keledai dan get untuk mengambil nilai di class binatang.</p>


## Class Singa : 

<img src="img/Screenshot (351).png">
<br>
<p>didalam class Singa terdapat konstruktor dimana ada atribut nama dan jmlkaki yang berasala dari class abstract binatang dan atribut 2 tambahan suara dan warna bulu class ini di implementasikan ke karnivora karena singa adalah karnivora lalu memberikan nilai di display makanan yang sesuai dan memberikan nilai display binatang untuk mengetahui jenis binatangnya dan untuk mendapatkan nama,jumlahkaki,suara maupun warna bulu di deklrasikan di method displaydata this untuk mengambil nilai atribut class singa dan get untuk mengambil nilai di class binatang.</p>


## Class Gorilla : 

<img src="img/Screenshot (352).png">
<br>
<p>didalam class Gorilla terdapat konstruktor dimana ada atribut nama dan jmlkaki yang berasala dari class abstract binatang dan atribut 2 tambahan suara dan warna bulu class ini di implementasikan ke karnivora dan herbivora karena gorila adalah karnivora dan herbivora lalu memberikan nilai di display makanan yang sesuai dan memberikan nilai display binatang untuk mengetahui jenis binatangnya dan untuk mendapatkan nama,jumlahkaki,suara maupun warna bulu di deklrasikan di method displaydata this untuk mengambil nilai atribut class gorilla dan get untuk mengambil nilai di class binatang.</p>


## Class Main : 

<img src="img/Screenshot (353).png">
<br>
<p>pada main kita memberikan nilai pada class gorila,singa dan kedelai sesuai dengan tugas dan ditampilkan sesuai dengan inisialisasi objeknya.</p>


# Output : 
<img src="img/Screenshot (354).png">

# Class Diagram :

<img src="img/classDiagram.jpg">
