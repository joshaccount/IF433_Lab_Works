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

    println("\n[SETUP] Mengkonfigurasi sistem HVAC...")
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)
    println("(LOG) AC unit ditambahkan: ${acUnit.name}")

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )
    println("(LOG) Alat pakan peliharaan ditambahkan: Picolo's Auto Feeder")
}