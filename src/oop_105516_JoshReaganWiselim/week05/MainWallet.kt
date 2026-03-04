package oop_105516_JoshReaganWiselim.week05

fun main() {
    val eWallet = EWallet("Paddington", 50000.0)
    val creditCard = CreditCard("Paddington", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in paymentList) {

        println("\nMencoba transaksi 75000.0")
        payment.processPayment(75000.0)

        when (payment) {

            is EWallet -> {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }

            is CreditCard -> {
                println("Mengecek sisa limit kartu...")
                println("Limit terpakai: ${payment.usedAmount} / ${payment.limit}")
            }
        }
    }
}