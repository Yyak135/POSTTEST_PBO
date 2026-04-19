## Program Galeri Seni

---

## Identitas
**Nama** : Anindtya Puji Astari  
**NIM** : 2409106063

---

## Deskripsi Program
Program Galeri Seni merupakan program berbasis Java yang digunakan untuk mengelola data karya seni.

Program ini dijalankan melalui console (CLI) dengan menu interaktif, di mana pengguna bisa:
- Menambahkan data karya seni
- Melihat seluruh data
- Mengupdate data
- Menghapus data

Data disimpan menggunakan ArrayList, sehingga fleksibel dan mudah dikelola.

Pada posttest ini, program dikembangkan dengan menerapkan konsep:
- Inheritance
- Polymorphism
- Abstraction
- Interface

---

## Konsep yang Digunakan

### 1. Encapsulation
- Atribut dibuat private
- Diakses menggunakan getter dan setter

---

### 2. Inheritance
Program menggunakan pewarisan:

- Superclass (Abstract Class): `KaryaSeni`
- Subclass:
  - `Lukisan`
  - `Patung`
  - `Fotografi`

Setiap subclass memiliki atribut tambahan:
- Lukisan → `media`
- Patung → `bahan`
- Fotografi → `kamera`

---

### 3. Polymorphism

#### a. Overloading
Method dengan nama sama tetapi parameter berbeda.

Contoh:
- `tampilData()`
- `tampilData(boolean detail)`
- `tampilData(String prefix)`

---

#### b. Overriding
Method di subclass dengan implementasi berbeda.

Method:
- `tampilData()`
- `infoTambahan()`

---

### 4. Abstraction
Class `KaryaSeni` diubah menjadi abstract class.

Ciri:
- Tidak bisa dibuat objek langsung
- Memiliki method abstract:
```java
public abstract void infoTambahan();
```

---

### 5. Interface
Ditambahkan interface `Deskripsi`.

Berisi:
- `tampilDeskripsi()`
- `kategoriKarya()`

Semua subclass mengimplementasikan method ini.

---

## Perbaikan dari Posttest Sebelumnya

### 1. Mengubah Class menjadi Abstract
Class `KaryaSeni` sekarang menggunakan `abstract`.

---

### 2. Menambahkan Abstract Method
```java
public abstract void infoTambahan();
```

---

### 3. Menambahkan Interface
Membuat interface `Deskripsi` dengan 2 method.

---

### 4. Implementasi Interface
Semua subclass mengimplementasikan:
- `tampilDeskripsi()`
- `kategoriKarya()`

---

## Fitur Program
- Tambah karya seni
- Lihat semua karya
- Update karya
- Hapus karya
- Keluar program

---

## Contoh Output

```
=== MENU GALERI SENI ===
1. Tambah Karya
2. Lihat Semua Karya
3. Update Karya
4. Hapus Karya
5. Keluar
Pilih menu:
```

---

