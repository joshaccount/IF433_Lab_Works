package oop_josh_onclass.week05

abstract class Karyawan {
    val namaMgr: String = "Paddington";
    val namaStf: String = "Snoopy";
    abstract fun bekerja(kecepatan: Int): String;
}

class Staff : Karyawan(){
    override fun bekerja(kecepatan: Int): String {
        return "Staff $namaStf nyeduh kopi, kecepatan menyeduh $kecepatan km/jam"
    }

    fun pegang_uang(){
        println("$namaStf akhirnya pegang uang!")
    }
}

class Manager : Karyawan(){
    override fun bekerja(kecepatan: Int): String {
        return "Manager $namaMgr memarahi staff selama $kecepatan menit"
    }

    fun quality_control(){
        println("Manager melakukan Quality Control")
    }
}

fun main(){
    var listKry: List<Karyawan> = listOf(
        Staff(),
        Manager()
    );

    println("Jenis karyawan ada ${listKry.size}")

    for(kry in listKry){
        println("Kerjanya karyawan: ${kry.bekerja(7)}")

        when (kry) {
            is Staff -> kry.pegang_uang()
            is Manager -> kry.quality_control()
        }
    }

    /*val stf = Staff();
    println("Staff bekerja: ${stf.bekerja(7)}");

    val mgr = Manager();
    println("Manager bekerja: ${mgr.bekerja(30)}");
    */
}