# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, kode, dan harga barang dari pengguna. Berdasarkan kode barang, aplikasi ini memberikan detail tambahan seperti jenis barang, merek, dan jumlah stok. Aplikasi ini juga memformat harga barang ke dalam format mata uang Rupiah.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overloading dan Overriding), Seleksi, Perulangan, IO Sederhana, ArrayList, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Barang`, `BarangDetail`, dan `TokoTampil` adalah contoh dari class.

```bash
public class Barang {
    ...
}

public class BarangDetail extends Barang {
    ...
}

public class TokoTampil {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `new BarangDetail(nama, kode, harga)` adalah contoh pembuatan object.

```bash
BarangDetail barang = new BarangDetail(nama, kode, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`kode` dan `harga` adalah contoh atribut.

```bash
private String nama;
private String kode;
private double harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Barang` dan `BarangDetail`.

```bash
public Barang(String nama, String kode, double harga) {
    this.nama = nama;
    this.kode = kode;
    this.harga = harga;
}

public BarangDetail(String nama, String kode, double harga) {
    super(nama, kode, harga);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`,`setKode` dan `setNpm` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKode(String kode) {
    this.kode = kode;
}

public void setHarga(double harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKode`, `getHarga`, dan `getHargaFormatted` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`,`kode` dan `harga`dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kode;
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BarangDetail` mewarisi `Barang` dengan sintaks `extends`.

```bash
public class BarangDetail extends Barang {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String kategori)` di `Barang` merupakan overloading method `displayInfo` dan `displayInfo` di `BarangDetail` merupakan override dari method `displayInfo` di `Barang`.

```bash
public String displayInfo(String kategori) {
    return displayInfo() + "\nKategori: " + kategori;
}

// Overriding
@Override
public String displayInfo() {
    return super.displayInfo() + "\nJenis: " + getJenis() + "\nMerek: " + getMerek() + "\nStok: " + getStok();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getJenis` dan `getMerek`.

```bash
public String getJenis() {
    String jenisKode = getKode().substring(0, 2);
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data  menampilkan data barang yang sudah dimasukkan.

```bash
for (int i = 0; i < jumlahBarang; i++) {
    // ...
}

// Perulangan untuk menampilkan data barang
for (int i = 0; i < daftarBarang.size(); i++) {
    System.out.println("===============");
    System.out.println("DATA BARANG " + (i + 1));
    System.out.println(daftarBarang.get(i).displayInfo());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scn = new Scanner(System.in);
System.out.print("Masukkan jumlah barang yang akan diinputkan: ");
int jumlahBarang = scn.nextInt();
scn.nextLine(); // Membersihkan buffer
```

13. **ArrayList** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel dengan ukuran yang dinamis. Pada kode ini, `ArrayList<BarangDetail> daftarBarang = new ArrayList<>()` adalah contoh penggunaan array list.

```bash
ArrayList<BarangDetail> daftarBarang = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch`untuk menangani error yang mungkin terjadi selama input dan pemrosesan data barang.

```bash
try {
    // kode yang mungkin menimbulkan pengecualian
} catch (NumberFormatException e) {
    System.out.println("Kesalahan Format Nomor: " + e.getMessage());
    if (!handleInputError(scn)) {
        break;
    }
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan Format Kode: " + e.getMessage());
    if (!handleInputError(scn)) {
        break;
    } catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
    if (!handleInputError(scn)) {
        break;
    }
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

Nama: Muhammad Rafi'i
Kelas : 4C TI REG BJB
NPM: 2210010462
