# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data informasi showroom Mobil menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi
Aplikasi yang saya buat dengan menggunakan bahasa pemrogramman java ini adalah aplikasi "SHowroom Mobil" .
Aplikasi Showroom Mobil ini adlaah aplikasi dengan sistem sederhana dimana unutk membuatu showroom mobil dalam mengelola dan menampilkan informasi mengenai stok mobil yang tersedia.
Aplikasi ini memiliki beberap fitur yaitu seperti pengeleolaan data mobil, penampilan informasi mobil, serta fitur untuk memfilter berdasarkan ketersediaan dan tahun produksi mobil, dimana fitur ini sangat memudahkan pelanggan untuk
mempertimbangkan pilihannya.
Cara kerja pada aplikasi ini adalah yang pertama-tama informasi mengenai mobil yang telah di inisialisasikan akan ditampilkan. kemudian informasi mobil yang telah di inisialisasikan juga dapat di perbahrui menggunakan fitur yang tersedia pada aplikasi ini.
Lalu apabila hanya ingin menampilkan atau melihat beberapa atribut saja dari data yang di inisalisasikan maka aplikasi ini juga menyediakan opsi untuk menampilkan beberapa atribut tersebut.
Kemudian yang terakhir aplikasi menyediakan kemudahan dengan fitur pilihan sederhana, dimana setelah menambahkan data para pelanggan dapat memfilter data tersebut sesuai ketersediaan da tahun produksinya.
Aplikais ini menggunakan metode input untuk inisialiasi Data mobil seperti input merk,nama,model,tahun,stok,harga, dan status ketersediaan, kemudian juga aplikasi ini juga menggunakan sistem input untuk pemilihan filter menggunakan terminal dimana 
dapat mnerima perintah. KMeudian input yang terakhir adalah aplikais ini menginput validasi iinput dimana untuk memastikan bahwa nilai yang dimasukkan sudah benar sesuai dengan format. 
Unutk outputnya aplikais mengoutput informasi mobil, hasil filter, pesan kesalhan, inrommasi keluar.
.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## ************************************************************
## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. pada Kode yang saya buat, disini saya menggunakan 3 class yaitu SuperShowroom, SubShowroomVP, UtamaShowroomMobil.
   dimana 3 class ini memili guna maising unutk memasukkan beberapa fungsi dan method. 

```bash
public class SuperShowroom {
    ...
}
>>>class SuperShowroom ini merupakan class dasar atau super class pada projek saya yang digunakan untuk mewakili atribut dan method-method umum yang saya gunakan
untuk berbagai tipe showrom,dimana pada class ini bisa juga disebut sebagai kerangka dasarnya untuk mengelola dimana berbagai operasi dari method method seperti
mutator, konstruktor, accesor, untuk menampilkan dan juga method untuk memfilter / seleksi <<<

public class subShowroomVip extends SuperShowroom{
    ...
}
>>>subShowroomVip, class ini merupakan turunan dari class SuperShowroom dimana class ini mewari atribut dari class Supershowroom
pada class ini saya menambahkan 1 atribut yaitu fiturspesial yang dimiliki dari class subShowroom. kemudian beberapa atribut
pada class ini adalah hasil dari turunan class super. pada class ini juga terdapat method mutator dan accesor untuk atribut fiturkhusus.

public class UtamaShowroomMobil {
    ...
}
>>>UtamaShowroomMobil, seperti namnya menandkaan bahwa class ini adalah class utama yang dimiliki pada projek atau aplikasi saya. Dimana class ini mengelola operasi showroo, secara keseluruhan
class ini juga berfungsi sebagai gerbang masuk utama untuk aplikasi dan projek Showroom Mobil, mengelola berbagai objek yang dibuat, dimana class ini juga sebgaia class yang menmapilkan informasi mobil
yang telah di input atau juga sebagai clas syang memperbahrui stok pada informasi mobil dan lainnya. class ini juga menyediakan layanan antarmuka bagi pengunjung
yang ingin memilih atau melihat informasi mobil tertantu dengan adanya fitur seleksi dan filter yang dimiliki class ini.
```
## ********************************************
2. **Object** adalah instance dari class. Pada kode aplikasi ini,  saya membuat 3 objek yaitu objek 

```bash
<objek 1> SuperShowroom MobilMasuk = new SuperShowroom ("Toyota", "Fortuner","2.8 VRZ GR-S 4x4 A/T (TWO TONE)",2023,5,
                720350000.0 , true);
>>>>>>Pada Objek kesatu ini yang menjadi objek adalah 'MobilMasuk' sebagai objek dari class 'Superhowroom

<objek 2> subShowroomVip mobilkhusus = new subShowroomVip("Toyota", "Fortuner","2.8 VRZ GR-S 4x4 A/T (TWO TONE)",2023,5,
                720350000.0 , true , "");
>>>>>Pada Objek kedua ini yang menjadi objek adalah 'Mobilkhusus' sebagai objek dari class subclass 'Subshowroom

<objek 3> List<SuperShowroom> MobilReady = new ArrayList<>();
        MobilReady.add(new SuperShowroom("Toyota", "Fortuner", "2.8 VRZ GR-S 4x4 A/T (TWO TONE)", 2023, 5, 720350000.0, true));
        MobilReady.add(new SuperShowroom("Honda", "Civic", "Sedan", 2019, 3, 250000000.0, false));
        MobilReady.add(new SuperShowroom("Ford", "Focus", "Hatchback", 2021, 4, 220000000.0, true));
        MobilReady.add(new SuperShowroom("Toyota", "Innova", "Zenix Hybrid EV 2.0L V HV CVT Modellista", 2021, 7, 551600000.0, false));
        MobilReady.add(new SuperShowroom("Honda", "Brio", "Hatchback", 2023, 0, 168580000.0, false));
        MobilReady.add(new SuperShowroom("Honda", "HRV", "1.5 S MT", 2022, 10, 445756800.0, true));
        MobilReady.add(new SuperShowroom("Daihatsu", "Grand Max", "1.5 S", 2020, 4, 220450000.0, true));
>>>>> pada objek ke 3 berbeda dengan kode 2 objek lainnya, pada kode ini yang menjadi objek adalah  'MobilReady' dari class List<superShowroom>.
```

## *********************************************************
3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
<Atribut pada class Super Showroom>
public class SuperShowroom {
    private String Merk, Nama,Model;   >>> terdapat atribut Merk, Nama dan model dengan tipe data String, berarti atribut ini akan menyimpan teks.
    public int Tahun,Stok;             >>>  terdapat atribut tahun dan stok dengan tipe data integer, berarti atribut ini menyimpan bilangan bulat (angka bilangan bulat).
    public double Harga;               >>>  terdapat atribut Harga dengan tipe data double, berati atribut ini akan menyimpan dengan bilangan pecahan atau desimal.
    public boolean Ketersediaan ;      >>>  terdapat atribut ketersediaan dnegan tipe data boolean, berati atribut ini mempresentasi nilai kebeneran (benar atau salah) yaitu 'true'/'false'

<Atribut pada class subShowroomVip>
ublic class subShowroomVip extends SuperShowroom{
    public String FiturSpesial; >>> terdapat atribut fiturSpesial dengan tipe data String, berarti atribut ini akan menyimpan teks.
```

## *************************************************************
4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `SuperShowroom` dan `SubShoroom`.

```bash
<KOnstruktor pada class super showroom>
SuperShowroom (String Merk, String Nama,String Model, int Tahun, int Stok, 
            double Harga, boolean Ketersediaan){
        this.Merk =Merk;
        this.Nama =Nama;
        this.Model = Model;
        this.Tahun =Tahun;
        this.Stok =Stok;
        this.Harga=Harga;
        this.Ketersediaan=Ketersediaan;   
    }
 <Konstruktor pada class subShowroomVip>
public subShowroomVip (String Merk, String Nama,String Model, int Tahun, int Stok, 
            double Harga, boolean Ketersediaan,String FiturSpesial){
        super (Merk, Nama,Model,Tahun,Stok,Harga,Ketersediaan);
        this.FiturSpesial="Gratis cek mesin mobil selama 6 ";
```

## ***********************************************************
5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut.
   Pada kode ini dibawh ini adalah contoh dari mutator atau penggunaan setter :
```bash
public void setMerk(String merk) {
        this.Merk = merk;
    }
    public void setNama(String nama) {
        this.Nama = nama;
    }
    public void setModel(String model) {
        this.Model = model;
    }
    public void setTahun(int tahun) {
        this.Tahun = tahun;
    }
    public void setStok(int stok) {
        this.Stok = stok;
    }
    public void setHarga(double harga) {
        this.Harga = harga;
    }
    public void setKetersediaan(boolean ketersediaan) {
        this.Ketersediaan = ketersediaan;
    }
```

## ***********************************************************
6. **Accessor** atau getter digunakan untuk mengambil nilai dari beberapa atribut saja.
    Pada kode ini contoh method accessor seperti dibawh ini :

```bash
public String getMerk() {
        return Merk;
    }
    public String getNama() {
        return Nama;
    }
    public String getModel() {
        return Model;
    }
    public int getTahun() {
        return Tahun;
    }
    public int getStok() {
        return Stok;
    }
    public double getHarga() {
        return Harga;
    }
    public boolean isKetersediaan() {
        return Ketersediaan;
    }
}
```

## ***********************************************************
7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `Merk`, 'Nama' dan `Model` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String Merk, Nama,Model;            >>> pada bagian ini atribut Merk, Nama dan model menjadi private dimana hnaya dapat di akses pada class tersebut atau memlaui method yang ada di class ini.
```

## ***********************************************************
8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
ublic class subShowroomVip extends SuperShowroom{                                            >>>>> class subclass 'subShowroom' mewarisi class Super Showroom, ini yang dimaksut inheritance
    public String FiturSpesial;                                                              >>>>> Atribut yang dibuat pada class subclass
    public subShowroomVip (String Merk, String Nama,String Model, int Tahun, int Stok, 
            double Harga, boolean Ketersediaan,String FiturSpesial){
        super (Merk, Nama,Model,Tahun,Stok,Harga,Ketersediaan);                               >>>>>> atribut dari superclass yang diwari oleh class suubShowroomVip
    ...
}
```

## ***********************************************************
9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi,
   polymorphis pada kode ini diterapkan dengan menggunakan method 'Show()' yang di ditimpa diclass SubShowroomVip yang sbeelumnya telah di buat atau didefinisikan di class Super Shoroom.
   polymorphism bisa berbentuk Overloading ataupun Overriding.  pada kode ini menggunakan Overriding .

```bash
public void show() {    >>>>> metode 'show()' yang akan di override
        System.out.println("Informasi Mobil:");
        System.out.println("Merk Mobil           : " + Merk);
        System.out.println("Nama Mobil           : " + Nama);
        System.out.println("Model Mobil          : " + Model);
        System.out.println("Tahun Keluar         : " + Tahun);
        System.out.println("Stok                 : " + Stok);
        System.out.println("Harga Jual           : " + Harga);
        System.out.println("Ketersediaan: " + (Ketersediaan ? "Tersedia" : "Tidak Tersedia"));
    }    

@ @Override          >>> override metode show() dari kelas uspershowroom
    public void show(){
        super.show();          >>>> memanggil metode show() dari kelas supershowroo,
        System.out.println("Fitur yang didapat    : " + FiturSpesial);
        
    }
```

## ***********************************************************
10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi.
    Pada kode ini, digunakan seleksi `if else` dan 'switch case'.
    dimamna program memungkin untuk memilih opsi dengan menggunakan swith case berdasarkan nilai yang di input dan menggunakan method seleksi ' if else'.
    dimana saat memilih salah satu pilihan pada method 'if - else' kemudian program akan meminta melanjutkan proses memproses filter, jika input sesuai maka
    program akan memfilter dan menampilkan hasilnya. 

```bash
while (true) { // perulangan
            System.out.println("1. Filter berdasarkan ketersediaan");
            System.out.println("2. Filter berdasarkan tahun");
            System.out.println("3. Keluar");
            System.out.print("Pilih filter yang diinginkan: ");

            String pilihan = scanner.nextLine().trim();
            if (pilihan.isEmpty()) {                                                      >>> 'if -elsei' - digunakan untuk menyeleksi filter atau menu nomor berapa yang akan dipilih
                System.out.println("Tidak boleh kosong, harus dipilih.");              
            } else if (!pilihan.matches("[1-3]")) {
                System.out.println("Pilihan anda tidak valid. Hanya tersedia angka dari 1 - 3.");
            } else {
                int pilihanInt = Integer.parseInt(pilihan);
                try {
                    switch (pilihanInt) { // seleksi                                                >>> 'switch case' adalah tambahan prose dari proses seleksi 'if- else- dimana saat pilih di input maka apabila benar
                        case 1 -> {                                                                 >>> methode swithch case akan memproses dan menyeleksi sesuai pilihan yang dipilih, contoh jik pada case 1 yang dipilih maka akan menampilkan dan mnyeleksi untuk hanya ketersediaan yang ditampil.
                            System.out.print("Masukkan ketersediaan format : (true/false): ");
                            if (scanner.hasNextBoolean()) {
                                boolean tersedia = scanner.nextBoolean();
                                scanner.nextLine(); 
                                List<SuperShowroom> hasilKetersediaan = SuperShowroom.filterBerdasarkanKetersediaan(MobilReady, tersedia);
                                tampilkanMobil(hasilKetersediaan);
                            } else {
                                System.out.println("Input ketersediaan tidak valid. hanya menggunakan (true/false)");
                                scanner.nextLine(); 
                            }
                        }
                        case 2 -> {
                            System.out.print("Masukkan tahun: ");
                            if (scanner.hasNextInt()) {
                                int tahun = scanner.nextInt();
                                scanner.nextLine(); 
                                List<SuperShowroom> hasilTahun = SuperShowroom.filterBerdasarkanTahun(MobilReady, tahun);
                                tampilkanMobil(hasilTahun);
                            } else {
                                System.out.println("Input tahun tidak valid. Hanya dapat diinput menggunakan angka");
                                scanner.nextLine(); 
                            }
                        }
                        case 3 -> {
                            System.out.println("Keluar dari program.");
                            return;
                        }
                        default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                    scanner.nextLine(); 
                }

public String getProdi() {
    switch(getNpm().substring(4, 6)) {
        case "01":
            return "Teknik Informatika";
        case "02":
            return "Sistem Informasi";
        default:
            return "Prodi lain";
    }
}
```

## ***********************************************************
11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data menu terus menerus sampai
    pengguna mmeilih unutk keluar dair program. ibaratnya menu akn terus muncuk setiap  akhir proses untuk menmapilkan secara berulang.

```bash
while (true) {
            System.out.println("1. Filter berdasarkan ketersediaan");
            System.out.println("2. Filter berdasarkan tahun");
            System.out.println("3. Keluar");
            System.out.print("Pilih filter yang diinginkan: ");
}
```

## ***********************************************************
12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user.
pada kode ini dimana objek scanner meminta input dari pengguna. Pengguna diminta untuk memilih opsi filter 
berdasarkan ketersediaan atau tahun, atau keluar dari program.
 Jika pengguna memilih filter berdasarkan ketersediaan, program menunggu input berupa nilai boolean (true atau false). Setelah
 menerima input yang valid, program memfilter daftar mobil yang telah disiapkan sebelumnya 
(MobilReady) dan menampilkan output hasil filter tersebut dengan menggunakan metode tampilkanMobil().
 Proses serupa terjadi jika pengguna memilih untuk melakukan filter berdasarkan tahun, di mana 
program meminta input tahun dalam bentuk angka dan kemudian memprosesnya untuk 
menampilkan mobil-mobil yang sesuai dengan tahun tersebut.

    
```bash
Scanner scanner = new Scanner(System.in);
        while (true) { // perulangan
            System.out.println("1. Filter berdasarkan ketersediaan");
            System.out.println("2. Filter berdasarkan tahun");
            System.out.println("3. Keluar");
            System.out.print("Pilih filter yang diinginkan: ");

System.out.print("Masukkan ketersediaan format : (true/false): ");
                            if (scanner.hasNextBoolean()) {
                                boolean tersedia = scanner.nextBoolean();
                                scanner.nextLine(); 
                                List<SuperShowroom> hasilKetersediaan = SuperShowroom.filterBerdasarkanKetersediaan(MobilReady, tersedia);
                                tampilkanMobil(hasilKetersediaan);

case 2 -> {
                            System.out.print("Masukkan tahun: ");
                            if (scanner.hasNextInt()) {
                                int tahun = scanner.nextInt();
                                scanner.nextLine(); 
                                List<SuperShowroom> hasilTahun = SuperShowroom.filterBerdasarkanTahun(MobilReady, tahun);
                                tampilkanMobil(hasilTahun);
```

## ***********************************************************
13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel.
    pada kode ini Array MobilReady merupakan sebuah ArrayList yang berisi objek-objek SuperShowroom. 
    Setiap elemen dalam ArrayList ini diisi dengan menggunakan konstruktor dari kelas 
    SuperShowroom, yang mewakili data mobil yang berbeda-beda seperti Merk, Nama,Model, Tahun, 
    stok, harga, dan ketersediaan.


```bash
 List<SuperShowroom> MobilReady = new ArrayList<>();
        MobilReady.add(new SuperShowroom("Toyota", "Fortuner", "2.8 VRZ GR-S 4x4 A/T (TWO TONE)", 2023, 5, 720350000.0, true));
        MobilReady.add(new SuperShowroom("Honda", "Civic", "Sedan", 2019, 3, 250000000.0, false));
        MobilReady.add(new SuperShowroom("Ford", "Focus", "Hatchback", 2021, 4, 220000000.0, true));
        MobilReady.add(new SuperShowroom("Toyota", "Innova", "Zenix Hybrid EV 2.0L V HV CVT Modellista", 2021, 7, 551600000.0, false));
        MobilReady.add(new SuperShowroom("Honda", "Brio", "Hatchback", 2023, 0, 168580000.0, false));
        MobilReady.add(new SuperShowroom("Honda", "HRV", "1.5 S MT", 2022, 10, 445756800.0, true));
        MobilReady.add(new SuperShowroom("Daihatsu", "Grand Max", "1.5 S", 2020, 4, 220450000.0, true));
```

## ***********************************************************
14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
                    switch (pilihanInt) { // seleksi 
                        case 1 -> {
                            System.out.print("Masukkan ketersediaan format : (true/false): ");
                            if (scanner.hasNextBoolean()) {
                                boolean tersedia = scanner.nextBoolean();
                                scanner.nextLine(); 
                                List<SuperShowroom> hasilKetersediaan = SuperShowroom.filterBerdasarkanKetersediaan(MobilReady, tersedia);
                                tampilkanMobil(hasilKetersediaan);
                            } else {
                                System.out.println("Input ketersediaan tidak valid. hanya menggunakan (true/false)");
                                scanner.nextLine(); 
                            }
                        }
                        case 2 -> {
                            System.out.print("Masukkan tahun: ");
                            if (scanner.hasNextInt()) {
                                int tahun = scanner.nextInt();
                                scanner.nextLine(); 
                                List<SuperShowroom> hasilTahun = SuperShowroom.filterBerdasarkanTahun(MobilReady, tahun);
                                tampilkanMobil(hasilTahun);
                            } else {
                                System.out.println("Input tahun tidak valid. Hanya dapat diinput menggunakan angka");
                                scanner.nextLine(); 
                            }
                        }
                        case 3 -> {
                            System.out.println("Keluar dari program.");
                            return;
                        }
                        default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (Exception e) {
                    System.out.println("Terjadi kesalahan: " + e.getMessage());
                    scanner.nextLine(); 
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama   : Siti AIsyah Nor Fitriani

NPM    :  2210010043
