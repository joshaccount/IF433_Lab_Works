package oop_105516_JoshReaganWiselim.week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class order(val deliveryDetails: DeliveryDetails?, val totalPRice: Int?)