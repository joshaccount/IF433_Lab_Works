package oop_josh_onclass.week11

import oop_josh_onclass.week08.Mahasiswa

// function biasa
fun salamPembuka(nama: String) {
    if(nama == "Paddington"){
        println("Salam Kenal")
    } else {
        println("Ih kamu siapa")
    }
}

// function extension - basic
fun String.rubahDepan(): String{
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return "Anyeonghaseo $hasil"
}

// function extension - parameters
fun Int.tentukanGrade(namaMhs: String): String {
    val grade = when {
        this >= 80 -> "A"
        this >= 70 -> "B"
        else -> "C"
    }
    return "$namaMhs Grade Kamu $grade "
}

// function extension - null
fun String?.cekNulldanEmpty(): String {
    if (this == null || this.isEmpty()){
        return "Username ga boleh null atau empty"
    } else {
        return "Username kamu $this"
    }
}

fun main() {
    var namaSaya = "Paddington"
    salamPembuka(namaSaya)
    println(namaSaya.uppercase())

    // cara panggil function extension - basic
    println("cha mu hee".rubahDepan())

    // cara panggil function extension - parameters
    val hasilStr = 86.tentukanGrade("Joo Ho Jin")
    val hasil = hasilStr.repeat(3)
    println(hasil)

    // cara panggil function extension - null
    var usernameKamu: String? = "Woody"
    println(usernameKamu.cekNulldanEmpty())

    // SCOPE - LET
    var kampusKamu: String = "UMN"
    kampusKamu.let {
        println("Nama Kampus Kamu: " + it)
        if (it == "UMN") {
            println("Kerennnnn!")
        } else {
            println("Ohh Okayy")
        }
    }

    // SCOPE - RUN
    var namaMatkul = "OOP"
    namaMatkul.run {
        println("Matkul favorite saya adalah " + this)
    }

    // SCOPE - WITH
    val keputusanLulus = with(100){
        if (this >= 70) {
            "Lulus"
        } else {
            "Remedial"
        }
    }
    println("Kamu $keputusanLulus")

    // SCOPE - APPLY
    val namaMahasiswa = Mahasiswa().apply{
        NIM = "123456789"
        nama = "Buzz Lightyear"
        nilai = 88
    }
    println("Si ${namaMahasiswa.nama} nilainya ${namaMahasiswa.nilai}")

    // SCOPE - ALSO
    val arDeret = mutableListOf<Int>(60, 70, 88, 100, 75)
    arDeret.also {
        println("Deret Sebelum : $arDeret")
    }.add(98)
    println("Deret Setelah : $arDeret")
}

class Mahasiswa {
    var NIM: String = ""
    var nama: String = ""
    var nilai: Int = 0
}