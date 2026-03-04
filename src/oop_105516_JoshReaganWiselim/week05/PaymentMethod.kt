package oop_105516_JoshReaganWiselim.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}