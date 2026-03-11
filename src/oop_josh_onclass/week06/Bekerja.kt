package oop_josh_onclass.week06

interface Bekerja {
    public val namaKerjaan: String
    val gaji: Int;
    val jmlHari: Int;
    val gajiDiDapat: Int
        get() = gaji * jmlHari;

    public fun ngoding() {
        println("Kerja ngoding");
    }

    public fun tester() {
        println("Testing kodingan biar berhasil")
    }
}