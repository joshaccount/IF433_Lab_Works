package oop_josh_onclass.week08

class set_krs(val nim : String?, val tahun : Int?){
    fun pilih_matkul(kodeMatkul : String?){
        println("Matkul yang Dipilih : $kodeMatkul")
    }
}

fun main() {
    var nama : String? = "Paddington";
    nama = null;
    println("hai $nama");

    val setKRS = set_krs("000123", null)
    println("si ${setKRS.nim} masuk tahun ${setKRS.tahun}");

    setKRS.pilih_matkul(null);
}