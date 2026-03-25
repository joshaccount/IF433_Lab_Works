package oop_105516_JoshReaganWiselim.week07

fun main() {
    println("\n=== TEST GAME MANAGER SINGLETON ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY & FACTORY ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item} | Durability: ${starterWeapon.durability}")
}