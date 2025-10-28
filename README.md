# 📘 Tugas Pertemuan 11 — Penerapan Java Persistence (JPA)

Proyek ini merupakan implementasi Java Persistence API (JPA) untuk melakukan manajemen data MataKuliah ke dalam database.
Aplikasi dikembangkan menggunakan NetBeans dengan arsitektur berbasis Entity–DAO–View, serta menggunakan ORM (Object Relational Mapping) agar interaksi dengan database lebih efisien dan terstruktur.

--- 

# 🚀 Tujuan Proyek

Menerapkan konsep Persistence pada Java, khususnya:

- Menghubungkan aplikasi Java dengan database menggunakan JPA.

- Mengelola data entitas (CRUD) tanpa query SQL langsung.

- Menerapkan EntityManager dan NamedQuery untuk operasi data.

- Mengimpor data CSV ke database menggunakan JPA.

--- 

# ⚙️ Teknologi yang Digunakan

- Java SE 8+

- NetBeans IDE

- JPA (Java Persistence API)

- EclipseLink (JPA Provider)

- PostgreSQL Database

- Swing GUI

- CSV Data Import

---

# 📚 Fitur Utama

1. Menampilkan Data Mata Kuliah

    Data ditarik dari database melalui EntityManager dan ditampilkan dalam tabel GUI.

2. Menambahkan Data Baru

    Data MataKuliah disimpan ke database menggunakan persist().

3. Mengubah dan Menghapus Data

    Menggunakan operasi persist() dan remove() dari JPA.

4. Mengurutkan Data Berdasarkan Kode Mata Kuliah

    Query JPA otomatis mengurutkan data menggunakan ORDER BY.

5. Import Data dari CSV

    File CSV dibaca lalu disimpan ke database tanpa SQL manual, melainkan lewat entitas MataKuliah.

---

# 🧰 Langkah-Langkah Pembuatan Persistence (JPA)
1. Membuat class persistance di folder utama project
![Membuat Class](https://github.com/fa-iqq29/Tugas-Pertemuan-11/blob/main/P11%20PBO/MembuatClass.png?raw=true)

2. Sambungkan Koneksi dengan database
![Membuat Class](https://github.com/fa-iqq29/Tugas-Pertemuan-11/blob/main/P11%20PBO/Sambungkan.png?raw=true)

3. Pilih tabel yang akan di persistance dari database
![Membuat Class](https://github.com/fa-iqq29/Tugas-Pertemuan-11/blob/main/P11%20PBO/PilihTabel.png?raw=true)

4. Pilih opsi sesuai gambar, lalu klik next
![Membuat Class](https://github.com/fa-iqq29/Tugas-Pertemuan-11/blob/main/P11%20PBO/KlikNext.png?raw=true)

5. Klik Finish
![Membuat Class](https://github.com/fa-iqq29/Tugas-Pertemuan-11/blob/main/P11%20PBO/KlikFinish.png?raw=true)

6. Class persistance dan package META-INF berhasil dibuat

![Membuat Class](https://github.com/fa-iqq29/Tugas-Pertemuan-11/blob/main/P11%20PBO/Hasil.png?raw=true)

---

# ▶️ Cara Menjalankan

1. Buka proyek di NetBeans.

2. Pastikan database sudah dibuat dengan tabel mata_kuliah.

3. Periksa konfigurasi persistence.xml agar sesuai dengan database lokalmu.

4. Jalankan program — aplikasi akan menampilkan tabel data dan bisa melakukan CRUD + import CSV.

---

# ✍️ Penulis

Faiq

Mahasiswa Sistem Informasi

Semester 3

Universitas Islam Negeri Sunan Ampel Surabaya
