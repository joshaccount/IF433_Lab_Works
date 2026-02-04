package oop_105516_JoshReaganWiselim.week01

fun main() {
    val gameTitle: String = "FC26"
    val price: Int = 800000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) price - (price * 20 / 100) else price - (price * 10 / 100)

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println ("Game Title = $title")
    println ("Price = $finalPrice")
    println ("Note = ${note ?: "Tidak ada catatan"}")
}