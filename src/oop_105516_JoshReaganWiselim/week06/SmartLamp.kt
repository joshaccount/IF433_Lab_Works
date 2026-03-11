package oop_105516_JoshReaganWiselim.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Lampu menyala. Ruangan terang benderang!")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan. Waduh gelap dong!")
    }
}