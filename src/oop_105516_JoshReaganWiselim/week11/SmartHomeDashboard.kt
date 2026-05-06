package oop_105516_JoshReaganWiselim.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    println("\n[SETUP] Mengkonfigurasi perangkat pencahayaan...")
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("(LOG) Lampu pintar ditambahkan: ${it.name}")
    }

    println("\n[SETUP] Mengkonfigurasi perangkat keamanan...")
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}