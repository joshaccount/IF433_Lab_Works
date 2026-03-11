package oop_105516_JoshReaganWiselim.week06

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}