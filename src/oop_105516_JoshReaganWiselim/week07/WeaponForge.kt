package oop_105516_JoshReaganWiselim.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            println("Forging Initial Weapons...")
            return Weapon(
                item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON),
                durability = 50
            )
        }

        fun forgeEpicSword(): Weapon {
            println("Forging Epic Weapons...")
            return Weapon(
                item = GameItem("Pedang Naga Api", 80, rarity = ItemRarity.EPIC),
                durability = 200
            )
        }
    }
}