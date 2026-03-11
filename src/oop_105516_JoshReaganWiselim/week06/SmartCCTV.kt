package oop_105516_JoshReaganWiselim.week06

class SmartCCTV (override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$name] CCTV menyala. Memantau area sekitar...")
        startRecord()
    }

    override fun turnOff() {
        println("[$name] CCTV dimatikan.")
    }

    override fun startRecord() {
        println("[$name] Perekaman dimulai. Menyimpan footage ke Cloud Storage.")
    }

}