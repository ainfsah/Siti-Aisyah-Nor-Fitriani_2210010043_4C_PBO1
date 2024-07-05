
package ShowroomMobil;
public class subShowroomVip extends SuperShowroom{
    public String FiturSpesial;
    public subShowroomVip (String Merk, String Nama,String Model, int Tahun, int Stok, 
            double Harga, boolean Ketersediaan,String FiturSpesial){
        super (Merk, Nama,Model,Tahun,Stok,Harga,Ketersediaan);
        this.FiturSpesial="Gratis cek mesin mobil selama 6 ";
    }
     public String getFiturSpesial(){
        return this.FiturSpesial ;
    }
    
    //mutator 
    public void setFiturSpesial (String newName){
        this.FiturSpesial=newName;   
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Fitur yang didapat    : " + FiturSpesial);
        
    }
}
