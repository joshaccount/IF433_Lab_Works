package oop_105516_JoshReaganWiselim.week06

class SmartSpeaker(override val id: String, override val name: String ) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Smart Speaker menyala. Siap menerima perintah suara!")
    }

    override fun turnOff() {
        println("[$name] Smart Speaker dimatikan!")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}