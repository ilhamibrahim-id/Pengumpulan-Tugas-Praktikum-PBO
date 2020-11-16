# Laporan Praktikum PBO Minggu Ke 12

# Pertanyaan Percobaan 1
1. Class apa sajakah yang merupakan turunan dari class Employee?<br>
jawab : <br>
terdapat 2 class yaitu intershipemployee dan permanentemployee.
2. Class apa sajakah yang implements ke interface Payable?<br>
jawab : <br>
terdapat 2 class yaitu electricitybill dan permanentemployee.
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi
dengan objek pEmp (merupakan objek dari class PermanentEmployee)
dan objek iEmp (merupakan objek dari class
InternshipEmploye) ? <br>
jawab : <br>
karena employee memiliki turunan class intershipemployee dan permanentemployee sehingga bisa di isi dengan objek tersebut.
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi
denganobjekpEmp (merupakan objek dari class
PermanentEmployee) dan objek eBill (merupakan objek dari class
ElectricityBill) ?<br>
jawab : <br>
karena interface pada payable digunakan di 2 class tersebut sehingga p bisa di isi objeck dari class Permanentemployee dan electricitybill. 
5. Coba tambahkan sintaks:
p = iEmp;
e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang
menyebabkan error?<br>
jawab : <br>
karena p harus memakai interface payable sedangkan employe tidak menggunakan interface tersebut dan untuk e error di sebabkan employe tidak mewarisi class electricitybill.
6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!<br>
jawab : <br>
ketika ada suatu objek yang dideklarasikan dari
super class, maka objek tersebut bisa diinstansiasi sebagai objek dari sub
class. 
# pertanyaan percobaan 2
1. Perhatikan class Tester2 di atas, mengapa pemanggilan
e.getEmployeeInfo() pada baris 8 dan
pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?<br>
jawab : <br>
karena employee 2 sudah di instansiasikan objek ke pEmp atau permanent employe sehingga pemanggilan sama dengan pEmp.
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai
pemanggilan method virtual (virtual method invication), sedangkan
pEmp.getEmployeeInfo() tidak?<br>
jawab : <br>
karena e.getEmployeeinfo() memanggil overidding method dari suatu objek polimorfisme dari class permanentemploye.
3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa
disebut virtual?<br>
jawab : <br>
Disebut virtual karena antara method yang dikenali
oleh compiler dan method yang dijalankan oleh JVM berbeda. 
# pertanyaan percobaan 3
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek iEmp (objek dari
InternshipEmployee) ?<br>
jawab : <br>
karena employee mewarisi class permanentemploye dan intershipemployee sehingga bisa dimasukan ke dalam array sesuai index yang di inginkan.
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek
dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek eBill (objek dari
ElectricityBilling) ?<br>
jawab : <br>
karena payable mewarisi class electricitybill dan permanentemployee sehingga bisa dimasukan ke dalam array sesuai index yang di inginkan.
3. Perhatikan baris ke-10, mengapa terjadi error?<br>
jawab : <br>
karena ebill dari class electricitybill tidak mewarisi class dari employe sehingga tidak bisa di instansiasikan objek.
# Pertanyaan percobaan 4
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa
pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan,
padahal jika diperhatikan method pay() yang ada di dalam class Owner
memiliki argument/parameter bertipe Payable?<br>
jawab : <br>
Jika diperhatikan lebih detil eBill merupakan objek dari
ElectricityBill dan pEmp merupakan objek dari
PermanentEmployee?
tetap bisa dilakukan karena interface paybale digunakan diclass electricitybill dan permanentemployee.
2. Jadi apakah tujuan membuat argument bertipe Payable pada method
pay() yang ada di dalam class Owner?<br>
jawab : <br>
agar bisa diberikan nilai class yang menggunakan interface dari payable.
3. Coba pada baris terakhir method main() yang ada di dalam class
Tester4 ditambahkan perintah ow.pay(iEmp);
Mengapa terjadi error?<br>
jawab : <br>
karena ow.pay memiliki parameter payable dan intershipemploye tidak menggunakan interface payable sehingga tidak bisa di instasiasikan objek.
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p
instanceof ElectricityBill pada baris ke-6 ?<br>
jawab : <br>
p digunakan untuk mengecek apakah suatu objek
merupakan hasil instansiasi dari suatu class tertentu.
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek
disana (ElectricityBill eb = (ElectricityBill) p)
diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke
dalam objek eb yang bertipe ElectricityBill ? <br>
jawab : <br>
digunakan untuk mengubah tipe dari suatu objek eb class electricitybill ke p paybel. Jika ada suatu
objek dari subclass kemudian tipenya diubah ke superclass, maka hal ini
termasuk ke upcasting.
# Tugas
# Source Code
# Class Tester
<img src="img/Screenshot (355).png">

# Class abstract Zombie
<img src="img/Screenshot (356).png">

# interface IDestroyable
<img src="img/Screenshot (357).png">

# Class WalkingZombie
<img src="img/Screenshot (358).png">

# Class Plant
<img src="img/Screenshot (359).png">

# Class JumpingZombie
<img src="img/Screenshot (360).png">

# Class Barrier
<img src="img/Screenshot (361).png">

# Output
<img src="img/Screenshot (362).png">