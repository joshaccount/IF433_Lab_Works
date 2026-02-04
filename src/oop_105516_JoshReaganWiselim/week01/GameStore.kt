package oop_105516_JoshReaganWiselim.week01

fun main() {
    val gameTitle: String = "FC26"
    val price: Int = 800000

    println("Game Title = $gameTitle, Price = $price")
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)