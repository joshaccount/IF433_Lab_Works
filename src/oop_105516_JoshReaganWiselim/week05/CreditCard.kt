package oop_105516_JoshReaganWiselim.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard $accountName: Transaksi sukses men! Total terpakai: $usedAmount")
        } else {
            println("CreditCard $accountName: Transaksi ditolak men! Pembelian lu melebihi limit!")
        }
    }
}