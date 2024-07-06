package uaspbo01_2210010462;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoTampil {
    public static void main(String[] args) {
        // Scanner untuk input dari pengguna
        Scanner scn = new Scanner(System.in);
        
        // Array untuk menyimpan data barang secara dinamis
        ArrayList<BarangDetail> daftarBarang = new ArrayList<>();
        
        // Loop utama untuk memungkinkan pengguna melanjutkan atau menghentikan program
        boolean continueProgram = true;
        
        while (continueProgram) {
            try {
                // Meminta pengguna untuk memasukkan jumlah barang
                System.out.print("Masukkan jumlah barang yang akan diinputkan: ");
                int jumlahBarang = scn.nextInt();
                scn.nextLine(); // Membersihkan buffer

                // Perulangan untuk input data barang
                for(int i = 0; i < jumlahBarang; i++) {
                    System.out.print("Masukkan Nama Barang " + (daftarBarang.size() + 1) + ": ");
                    String nama = scn.nextLine();
                    System.out.print("Masukkan Kode Barang " + (daftarBarang.size() + 1) + ": ");
                    String kode = scn.nextLine();
                    System.out.print("Masukkan Harga Barang " + (daftarBarang.size() + 1) + ": ");
                    double harga = scn.nextDouble();
                    scn.nextLine(); // Membersihkan buffer
                    
                    // Membuat objek BarangDetail dan menambahkannya ke daftar
                    daftarBarang.add(new BarangDetail(nama, kode, harga));
                }
                
                // Perulangan untuk menampilkan data barang
                for(int i = 0; i < daftarBarang.size(); i++) {
                    System.out.println("===============");
                    System.out.println("DATA BARANG " + (i + 1));
                    System.out.println(daftarBarang.get(i).displayInfo());
                }
                
                // Menanyakan kepada pengguna apakah ingin melanjutkan atau keluar
                System.out.print("Apakah Anda ingin memasukkan data barang lagi? (ya/tidak): ");
                String pilihan = scn.nextLine();
                
                if (!pilihan.equalsIgnoreCase("ya")) {
                    continueProgram = false;
                    System.out.println("Program dihentikan. Terima kasih!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Kesalahan Format Nomor: " + e.getMessage());
                if (!handleInputError(scn)) {
                    break;
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Kesalahan Format Kode: " + e.getMessage());
                if (!handleInputError(scn)) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Kesalahan Umum: " + e.getMessage());
                if (!handleInputError(scn)) {
                    break;
                }
            }
        }
        
        // Menutup scanner
        scn.close();
    }

    // Method untuk menangani error input dan memberi opsi ke pengguna
    private static boolean handleInputError(Scanner scn) {
        while (true) {
            System.out.print("Apakah Anda ingin mencoba lagi atau keluar? (coba lagi/keluar): ");
            String pilihan = scn.nextLine();
            
            if (pilihan.equalsIgnoreCase("coba lagi")) {
                return true; // Kembali ke loop utama untuk mencoba lagi
            } else if (pilihan.equalsIgnoreCase("keluar")) {
                System.out.println("Program dihentikan. Terima kasih!");
                return false; // Menghentikan loop utama dan keluar dari program
            }
        }
    }
}

