package oop_105516_JoshReaganWiselim.week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet $accountName: Payment sukses men! Sisa saldo $balance")
        } else {
            println("EWallet $accountName: Saldo tidak cukup men! Gabisa payment")
        }
    }

    fun topUp (amount: Double) {
        balance += amount
        println("EWallet $accountName: Berhasil toup menn! Saldo sekarang $balance")
    }
}