package oop_105516_JoshReaganWiselim.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Mengambil 10% dari parent + 500.000
        return super.calculateBonus() + 500000
    }
}