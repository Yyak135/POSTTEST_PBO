# Program Galeri Seni

## Identitas

Nama : Anindtya Puji Astari

NIM : 2409106063

---

## Deskripsi Program

Program Galeri Seni merupakan program berbasis Java yang digunakan untuk mengelola data karya seni.

Program ini dijalankan melalui console dengan menu interaktif, dimana pengguna dapat menambahkan, melihat, mengupdate, dan menghapus data karya seni.

Data disimpan menggunakan ArrayList sehingga dapat dikelola secara dinamis.

Pada posttest ini, program dikembangkan lebih lanjut dengan menerapkan konsep **Inheritance (Pewarisan)** dan **Polymorphism (Overloading & Overriding)** dalam pemrograman berorientasi objek.

---

## Konsep yang Digunakan

### 1. Encapsulation

* Atribut pada class dibuat private
* Akses menggunakan getter dan setter

---

### 2. Inheritance

Program menggunakan konsep inheritance dimana:

* **Superclass**: KaryaSeni
* **Subclass**:

  * Lukisan
  * Patung
  * Fotografi

Setiap subclass memiliki atribut tambahan yang berbeda sesuai jenis karya seni.

---

### 3. Polymorphism

Pada posttest ini ditambahkan konsep polymorphism yang terdiri dari:

#### a. Method Overloading (Static Polymorphism)

Method dengan nama sama tetapi parameter berbeda dalam satu class.

Contoh pada class KaryaSeni :

* tampilData()
* tampilData(boolean detail)
* tampilData(String prefix)

Tujuan:
Mempermudah pemanggilan method dengan fungsi yang mirip namun kebutuhan berbeda.

---

#### b. Method Overriding (Dynamic Polymorphism)

Method yang dioverride pada subclass dengan implementasi berbeda.

Method yang dioverride:

* tampilData()
* infoTambahan()

Setiap subclass menampilkan informasi sesuai jenis karya seni:

* Lukisan → media
* Patung → bahan
* Fotografi → kamera

---

## Perubahan yang Dilakukan (Dari Posttest Sebelumnya)

### 1. Penambahan Method Overloading

Pada class KaryaSeni :

* Menambahkan tampilData(boolean detail)
* Menambahkan tampilData(String prefix)

---

### 2. Penambahan Method Baru untuk Override

Menambahkan method:

```
infoTambahan()
```

di superclass KaryaSeni.

---

### 3. Override di Setiap Subclass

Setiap subclass (Lukisan, Patung, Fotografi) melakukan override:

* tampilData()
* infoTambahan()

---

### 4. Implementasi Polymorphism di Main

Pada menu lihat karya:

```
daftarKarya.get(i).tampilData();
daftarKarya.get(i).infoTambahan();
```

---

### 5. Peningkatan Struktur Program

* Kode lebih modular
* Lebih fleksibel
* Mudah dikembangkan

---

## Fitur Program

1. Menambahkan data karya seni
2. Menampilkan seluruh karya seni
3. Mengupdate data karya seni
4. Menghapus data karya seni
5. Keluar dari program

---

## Struktur Program

### 1. Main.java

Berisi:

* Menu program
* Input pengguna
* ArrayList
* Implementasi polymorphism

---

### 2. KaryaSeni.java

Atribut:

* judul
* seniman
* tahun

Method:

* getter & setter
* overloading tampilData
* infoTambahan

---

### 3. Lukisan.java

Atribut:

* media

Override:

* tampilData
* infoTambahan

---

### 4. Patung.java

Atribut:

* bahan

Override:

* tampilData
* infoTambahan

---

### 5. Fotografi.java

Atribut:

* kamera

Override:

* tampilData
* infoTambahan

---

## Contoh Output Program

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





