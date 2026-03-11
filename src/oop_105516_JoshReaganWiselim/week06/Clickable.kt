package oop_105516_JoshReaganWiselim.week06

interface Clickable {
    // ERROR: Property in an interface cannot have a backing field
    val name: String = "Tombol Rahasia"

    // Function without body (Implicity Abstract)
    fun click()
}