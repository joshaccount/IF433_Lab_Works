package oop_105516_JoshReaganWiselim.week04

fun main() {
    val manager = Manager("Paddington", 8000000)
    val developer = Developer("Tony Stark", 7000000, "Kotlin")

    // Test Manager
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("---")

    // Test Developer
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}