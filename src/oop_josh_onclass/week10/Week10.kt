package oop_josh_onclass.week10

// Non-Generic programming
class meja(val hasil: Any)

// Generic programming
class kursi<T>(val hasil: T)

// Generice Multi Param
class Television<L, V>(val merk: L, val kodeBarcode: V)

// Generic Function
fun <M> Alamat(kodepos: M): M{
    return kodepos
}

// Generic with Constraints
class kalkulator<T: Number>(val a: T, val b: T){
    fun tambah(): Int{
        return a.toInt() + b.toInt();
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}

// Generic WHERE
val arNilai = listOf(60, 70, 80, 90, 100, 67, 96, 77, 88)
fun <T> nilaiDiatasKKM(list: List<T>, kkm: T): List<T> where T: Comparable<T> {
    return list.filter { it >= kkm };
}

fun main() {
   println("========= Implementasi Non-Generic =========")
    val table = meja(100)
    val hargaTable = table.hasil as Int
    println(hargaTable + 50)

    println("========= Implementasi Generic =========")
    val chair = kursi(300)
    println(chair.hasil + 50)

    println("========= Generic Multi Param =========")
    val tv = Television("Lenovo", "310806")
    println("Merknya " + tv.merk)
    println("Barcode ${tv.kodeBarcode + 777}")

    println("========= Generic Function =========")
    println("Kode pos kamu " + Alamat(328314))

    println("========= Generic - Kalkulator =========")
    val kal = kalkulator(10.5,20.43)
    println("Hasil Penambahan ${kal.a} ditambah ${kal.b}: " + kal.tambah())
    println("Hasil Pengurangan ${kal.a} dikurang ${kal.b}: " + kal.kurang())

    println("========= Generic - WHERE =========")
    println("Semua nilai: " + arNilai)
    var nilaiKKM = nilaiDiatasKKM(arNilai, 70)
    println("Yang lolos KKM " + nilaiKKM)
}