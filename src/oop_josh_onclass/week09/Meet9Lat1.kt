package oop_josh_onclass.week09

fun main() {
    println("========= LIST OF IMMUTABLE =========")
    val arSiswa = listOf("Ali", "Budi", "Cica")
    // view doang
    println(arSiswa)
    // munculin satu item saja
    println(arSiswa[1])
    // menghitung banyak item
    println(arSiswa.size)
    // munculin semua siswa
    for(i in arSiswa) {
        println(i)
    }

    println("========= LIST OF MUTABLE =========")
    val arMatkul = mutableListOf("OOP", "MatDis", "GameDev")
    arMatkul.add("Kalkulus")
    arMatkul[2] = "PemWeb"
    arMatkul.remove("MatDis")
    println(arMatkul)

    println("========= SET OF IMMUTABLE =========")
    var arNilai = setOf(80, 90, 20, 30, 90, 70, 20, 10, 100)
    println("Banyak data: ${arNilai.size}")
    println("Angka 20 ada ga? ${arNilai.contains(20)}")
    println(arNilai)

    println("========= SET OF MUTABLE =========")
    var arMakanan = mutableSetOf("Nasi Goreng", "Tempe", "Tahu", "Bakpao", "Telor", "Ayam")
    arMakanan.add("Indomie")
    arMakanan.remove("Tahu")
    arMakanan.add("Nasi Goreng")
    println(arMakanan)

    println("========= MAP OF IMMUTABLE =========")
    var arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 83
    )
    println("Banyak data: ${arDataMhs.size}")
    println("Si Acong nilainya: ${arDataMhs["Acong"]}")
    println("List Semua Mhs: ${arDataMhs.keys}")
    println("List Semua Nilai: ${arDataMhs.values}")
    println(arDataMhs)

    println("======== MAP OF MUTABLE =========")
    var arMenuResto = mutableMapOf(
        "Mie Ayam" to 5000,
        "Mie Bakso" to 6000,
        "Mie Pangsit" to 6500
    )
    arMenuResto["Mie Bakso"] = 6200
    arMenuResto.remove("Mie Ayam")
    println(arMenuResto)

    println("========= LAMBDA =========")
    // cara lama -> function tulis kebawah
    fun tambah(a: Int, b: Int): Int{
        return a + b
    }
    println("Hasil tambah ${tambah(10,3)}")

    // cara baru -> function tulis kesamping
    var kurang = {a: Int, b: Int -> a - b}
    println("Hasil kurang ${kurang(10,3)}")
    
    println("========= LAMBDA (IT) ========")
    val pangkat = {a: Int, b: Int -> a*a}
    val hitungPangkat:(Int) -> Int = {it*it}
    println("Hasil pangkat adalah ${hitungPangkat(5)}")

    println("========= FOREACH =========")
    // looping for biasa
    for(a in arMakanan) {
        println(a)
    }

    println("========= FOREACH (IT) =========")
    arMakanan.forEach {
        println(it)
    }

    println("========= FOREACH (Variable) =========")
    arMakanan.forEach {
        mkn -> println(mkn)
    }
}