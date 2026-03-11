package oop_105516_JoshReaganWiselim.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' berhasil ditambahkan.")
    }

    fun turnOffAllSwitches() {
        println("\nMematikan semua perangkat...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}