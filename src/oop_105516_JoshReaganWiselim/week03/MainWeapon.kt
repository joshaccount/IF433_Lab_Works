package oop_105516_JoshReaganWiselim.week03

fun main() {
    val weapon = Weapon("Excalibur")

    println("=== Test Damage Negatif ===")
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    println("=== Test Damage OP Banget ===")
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    println("=== Tier Weapon ===")
    println("Weapon ${weapon.name} merupakan Tier: ${weapon.tier}")
}