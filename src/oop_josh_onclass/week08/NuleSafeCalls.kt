package oop_josh_onclass.week08

class Alamat(val nomor: String?, val kota: String)
class Mahasiswa(val nama: String?, val addr: Alamat?)

fun main(){
    val amt = Alamat("101", "Jakarta")
    val mhs = Mahasiswa("Paddington", amt)

    // Kalau alamat-nya null, kita akan kasih nilai default
    val defKota = mhs.addr?.let{
        alamatDefault->"${mhs.addr.kota} nomor ${mhs.addr.nomor}"
    }?: "Location Unknown"

    println("Hai ${mhs.nama} yang tinggal di ${defKota}")
}