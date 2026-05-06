package oop_105516_JoshReaganWiselim.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}