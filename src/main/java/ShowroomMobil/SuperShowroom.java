
package ShowroomMobil;

import java.util.List;//untuk mengimport kode pustaka dari java agar bisa menggunakan 'list'
import java.util.stream.Collectors;// untuk mengimport kode pustaka dari java gaar bisa memggunakan 'collctors'.

public class SuperShowroom {
    private String Merk, Nama,Model;
    public int Tahun,Stok;
    public double Harga;
    public boolean Ketersediaan ;
    
    //konstruktor
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
    
    //accesor
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
    
    //mutator atau setter
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
    
    public void show() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merk Mobil           : " + Merk);
        System.out.println("Nama Mobil           : " + Nama);
        System.out.println("Model Mobil          : " + Model);
        System.out.println("Tahun Keluar         : " + Tahun);
        System.out.println("Stok                 : " + Stok);
        System.out.println("Harga Jual           : " + Harga);
        System.out.println("Ketersediaan: " + (Ketersediaan ? "Tersedia" : "Tidak Tersedia"));
    }    
        
    // Metode untuk memfilter mobil dari ketersediaan
    public static List<SuperShowroom> filterBerdasarkanKetersediaan(List<SuperShowroom> mobil, boolean tersedia) {
        return mobil.stream()
                .filter(m -> m.isKetersediaan() == tersedia)
                .collect(Collectors.toList());
    }

    // Metode untuk memfilter mobil dari tahun
    public static List<SuperShowroom> filterBerdasarkanTahun(List<SuperShowroom> mobil, int tahun) {
        return mobil.stream()
                .filter(m -> m.getTahun() == tahun)
                .collect(Collectors.toList());
    }
}



