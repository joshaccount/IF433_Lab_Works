package oop_josh_onclass.week12

fun basic_trycatch(pembilang: Int, penyebut: Int){
    try {
        val hasil = pembilang / penyebut
        println("Hasil bagi $hasil")
    } catch (e: Exception) {
        println("Ada error pembagian ${e.message}")
    } finally {
        println("Selesai pembagian")
    }
}

fun cekTipeData(angka: String) {
    var nilai: Int = try {
        Integer.parseInt(angka)
    } catch (e: Exception) {
        println("Ada error di cek tipe data ${e.message}")
        123
    }
    println("Nilai kamu $nilai")
}

fun cekGaji (hariKerja: Int) {
    if (hariKerja < 0) {
        throw IllegalArgumentException("Masa Hari kerja minus")
    } else {
        val gaji = hariKerja * 1000;
        println("Gaji kamu $gaji")
    }
}

// Custom Exception -> Class
class cekSaldoBank(val saldoKamu: Int, val jajanKamu: Int):
    Exception("Saldo kamu $saldoKamu, jajan kamu $jajanKamu, gak cukup lahh!!!")

class transaksiPembelian(val saldoAwal: Int) {
    fun mulaiJajan(pengeluaranKamu: Int) {
        if(saldoAwal < pengeluaranKamu) {
            throw cekSaldoBank(saldoAwal, pengeluaranKamu)
        } else {
            val sisaSaldo = saldoAwal - pengeluaranKamu
            println("Sisa saldo kamu $sisaSaldo")
        }
    }
}

// multiple catch
fun multiCatch (input: String, penyebut: Int) {
    try {
        val num: Int = input.toInt()
        println("Hasil pembagian adalah ${num / penyebut}")
    } catch (e: NumberFormatException) {
        println("Ada error multicatch, salah format: ${e.message}")
    } catch (e: ArithmeticException) {
        println("Ada error multicatch, aritmatika: ${e.message}")
    } catch (e: Exception) {
        println("Ada error multicatch, Errornya adalah: ${e.message}")
    }
}

// run catching IDIOM
sealed class ATMException(val pesan: String): Exception(pesan)

class cekSaldo(val saldo: Int): ATMException("Saldo gak cukup, karena sisa $saldo")
class batasJajan(val amount: Int): ATMException("Jajan $amount melebihi limit harian 1000")

fun mulaiJajan(saldoSaya: Int, jajanSaya: Int): Int{
    if (jajanSaya > 1000){
        throw batasJajan(jajanSaya)
    } else if (saldoSaya < jajanSaya) {
        throw cekSaldo(saldoSaya)
    } else {
        println("Sisa saldo kamu adalah ${saldoSaya - jajanSaya}")
    }
    return saldoSaya - jajanSaya
}

fun main() {
    //runCatching IDIOM
    runCatching { mulaiJajan(1200, 1100) }
        .onSuccess { println("Transaksi Sukses ${it}") }
        .onFailure { println("Transaksi Gagal ${it}") }

    // coba multicatch
    multiCatch("10", 0)

    val trx = transaksiPembelian(1000)
    try {
        trx.mulaiJajan(1200)
    } catch (e: Exception) {
        println("Ada error di custom exception ::: ${e.message}")
    }

    // Coba Throw
    try {
        cekGaji(22)
    } catch (e: IllegalArgumentException) {
        println("error coba catch ::: ${e.message}")
    }

    // Exception - Expression
    cekTipeData("29")

    // Basic Expression
    basic_trycatch(10, 2)
}