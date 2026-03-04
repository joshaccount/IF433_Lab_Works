package oop_105516_JoshReaganWiselim.week05

fun main(){
    val mathHelper = MathHelper()

    println("=== Program Hitung Luas ===")
    println("1. Persegi")
    println("2. Persegi Panjang")
    println("3. Lingkaran")
    print("Pilih (1/2/3): ")

    val pilihan = readLine()?.toIntOrNull()

    when (pilihan) {
        1 -> {
            print("Masukkan sisi: ")
            val sisi = readLine()?.toIntOrNull()
            if (sisi != null) {
                val hasil = mathHelper.hitungLuas(sisi)
                println("Luas Persegi = $hasil")
            } else {
                println("Input tidak valid")
            }
        }

        2 -> {
            print("Masukkan panjang: ")
            val panjang = readLine()?.toIntOrNull()
            print("Masukkan lebar: ")
            val lebar = readLine()?.toIntOrNull()

            if (panjang != null && lebar != null) {
                val hasil = mathHelper.hitungLuas(panjang, lebar)
                println("Luas Persegi Panjang = $hasil")
            } else {
                println("Input tidak valid")
            }
        }

        3 -> {
            print("Masukkan jari-jari: ")
            val jariJari = readLine()?.toDoubleOrNull()
            if (jariJari != null) {
                val hasil = mathHelper.hitungLuas(jariJari)
                println("Luas Lingkaran = $hasil")
            } else {
                println("Input tidak valid.")
            }
        }

        else -> println("Pilihan tidak tersedia")
    }
}