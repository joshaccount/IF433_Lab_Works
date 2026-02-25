package oop_105516_JoshReaganWiselim.week04

fun main() {
    println ("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()   // Memanggil method milik sendiri
    myCar.honk()        // Memanggil method yang sudah di-override
    myCar.accelerate()  //Memanggil gabungan method Parent dan Child

    println("\n--- Testing Electric Car ---")
    val myElectricCar = ElectricCar("BYD", 4, 85)
    myElectricCar.accelerate()  // dari ElectricCar (final)
    myElectricCar.openTrunk()   // dari Car
    myElectricCar.openTrunk()   // dari Car
}