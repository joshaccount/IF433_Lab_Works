package oop_105516_JoshReaganWiselim.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan kompuetr melayani administrasi.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}