package uaspbo01_2210010462;

import java.text.NumberFormat;
import java.util.Locale;

public class Barang {
    // Atribut dan enscapsulition
    private String nama;
    private String kode;
    private double harga;
    
    // Konstruktor
    public Barang(String nama, String kode, double harga) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
    }
    
    public Barang() {
        System.out.println("Data barang tidak boleh kosong");
    }
    
    // Setter (Mutator)
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Getter (Accessor)
    public String getNama() {
        return nama;
    }
    
    public String getKode() {
        return kode;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public String getHargaFormatted() {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(harga);
    }
    
    // Polimorfisme (Overloading)
    public String displayInfo() {
        return "Nama: " + getNama() + "\nKode: " + getKode() + "\nHarga: " + getHargaFormatted();
    }
    
    public String displayInfo(String kategori) {
        return displayInfo() + "\nKategori: " + kategori;
    }
}
