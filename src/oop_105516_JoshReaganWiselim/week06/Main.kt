package oop_105516_JoshReaganWiselim.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout (method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showItem()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1,50000.0)
    processCheckout(pay2, 150000.0)
}