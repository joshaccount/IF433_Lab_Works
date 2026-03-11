package oop_josh_onclass.week06

class Karyawan(
    override val namaKerjaan: String,
    override val gaji: Int,
    override val jmlHari: Int,
    override val namaGame: String,
    override val waktuMain: Int
): Bekerja, Bermain {
    val namaKaryawan: String = "Tony Stark"
    override fun ngoding() {
        println("Kerjaan kamu $namaKerjaan, keren!")
        println("Gaji kamu ${super.gajiDiDapat}")
    }

    override fun main_game() {
        println("Karyawan: $namaKaryawan sedang bermain game $namaGame dan sudah bermain selama $waktuMain Jam!")
    }

    override fun tester() {
        super<Bekerja>.tester();
        super<Bermain>.tester();
    }
}