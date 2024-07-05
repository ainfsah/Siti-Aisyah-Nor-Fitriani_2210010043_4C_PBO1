
package ShowroomMobil;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class UtamaShowroomMobil {
    public static void main (String [] args){
        
        SuperShowroom MobilMasuk = new SuperShowroom ("Toyota", "Fortuner","2.8 VRZ GR-S 4x4 A/T (TWO TONE)",2023,5,
                720350000.0 , true);
        MobilMasuk.show();
       
       System.out.println(" ");
       System.out.println(" ");
       System.out.println ("Hasil edit data stok mobil");
       MobilMasuk.setStok(8);
       MobilMasuk.show();
       
       System.out.println(" ");
       System.out.println(" ");
       System.out.println("hanya menampilan beberap data atribut");
       System.out.println("Merk Masuk   :"  + MobilMasuk.getMerk());
       System.out.println("Model mobil  :" + MobilMasuk.getModel());
       System.out.println("Harga Mobil  :" + MobilMasuk.getHarga());
       
       System.out.println(" ");
       System.out.println(" ");
       System.out.println("informasi mobil  keuntungan bagi pelanggan VIP");
       subShowroomVip mobilkhusus = new subShowroomVip("Toyota", "Fortuner","2.8 VRZ GR-S 4x4 A/T (TWO TONE)",2023,5,
                720350000.0 , true , "");
       mobilkhusus.show();
       
       // System.out.println(MobilMasuk.Harga); //(contoh penggunanan encapsulation)
        //System.out.println(MobilMasuk.Merk); //(karna Tipe data merk menggunaka Private String jadi tidak bisa lgsung tanpa
       // bawaan daro dalam classnya
       
       
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Update stok terbaru pada Showroom AISYAH!!!!");
       
        
        ///Updatestokmobil pada 
       List<SuperShowroom> MobilReady = new ArrayList<>();
        MobilReady.add(new SuperShowroom("Toyota", "Fortuner", "2.8 VRZ GR-S 4x4 A/T (TWO TONE)", 2023, 5, 720350000.0, true));
        MobilReady.add(new SuperShowroom("Honda", "Civic", "Sedan", 2019, 3, 250000000.0, false));
        MobilReady.add(new SuperShowroom("Ford", "Focus", "Hatchback", 2021, 4, 220000000.0, true));
        MobilReady.add(new SuperShowroom("Toyota", "Innova", "Zenix Hybrid EV 2.0L V HV CVT Modellista", 2021, 7, 551600000.0, false));
        MobilReady.add(new SuperShowroom("Honda", "Brio", "Hatchback", 2023, 0, 168580000.0, false));
        MobilReady.add(new SuperShowroom("Honda", "HRV", "1.5 S MT", 2022, 10, 445756800.0, true));
        MobilReady.add(new SuperShowroom("Daihatsu", "Grand Max", "1.5 S", 2020, 4, 220450000.0, true));

        Scanner scanner = new Scanner(System.in);

        while (true) { // perulangan
            System.out.println("1. Filter berdasarkan ketersediaan");
            System.out.println("2. Filter berdasarkan tahun");
            System.out.println("3. Keluar");
            System.out.print("Pilih filter yang diinginkan: ");

            String pilihan = scanner.nextLine().trim();
            if (pilihan.isEmpty()) {
                System.out.println("Tidak boleh kosong, harus dipilih.");
            } else if (!pilihan.matches("[1-3]")) {
                System.out.println("Pilihan anda tidak valid. Hanya tersedia angka dari 1 - 3.");
            } else {
                int pilihanInt = Integer.parseInt(pilihan);
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
            }
        }
    }
   //gsn menghasilkan filter
    public static void tampilkanMobil(List<SuperShowroom> mobil) {
        for (SuperShowroom m : mobil) {
            m.show();
            System.out.println();
        }
    }
}