package oop_105516_JoshReaganWiselim.week04

class Employee(val name: String, val baseSalary: Int) {
    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 10) / 100
    }
}