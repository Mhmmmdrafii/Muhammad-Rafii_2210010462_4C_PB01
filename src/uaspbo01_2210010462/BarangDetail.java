package uaspbo01_2210010462;

//inheretence
public class BarangDetail extends Barang {
    // Polimorfisme (Overriding)
    public BarangDetail(String nama, String kode, double harga) {
        super(nama, kode, harga);
    }
    
    public String getJenis() {
        String jenisKode = getKode().substring(0, 2);
        //Selection 
        switch(jenisKode) {
            case "01":
                return "Elektronik";
            case "02":
                return "Pakaian";
            case "03":
                return "Makanan";
            default:
                return "Kategori Lain";
        }
    }
    
    public String getMerek() {
        String merekKode = getKode().substring(2, 4).toUpperCase();
        switch(merekKode) {
            case "AA":
                return "Merek A";
            case "BB":
                return "Merek B";
            case "CC":
                return "Merek C";
            default:
                return "Merek Lain";
        }
    }
    
    //fungsi
    public int getStok() {
        return Integer.parseInt(getKode().substring(4, 6));
    }
    
    // Polimorfisme (Overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nJenis: " + getJenis() +
               "\nMerek: " + getMerek() +
               "\nStok: " + getStok();
    }
}
