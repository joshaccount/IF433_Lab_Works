package oop_josh_week02

class Jagoan {
    var nama:String = "Paddington"
    var hp:Int = 100

    init {
        println("Hello saya constructor");
        nama = "Harry Potter"
        hp = 120
    }

    constructor(darahhero:Int = 200) {
        println("ini constructor kedua!");
        this.hp = darahhero;
    }

    fun jalan() {
        println("$nama jalan kaki ke pasar")
    }

    fun serang() {
        println("$nama serang dengan life: $hp")
    }
}

fun main() {
    val hero = Jagoan(darahhero = 250)  //object namavariabel=nya : hero
    hero.nama = "Tony Stark";
    println("Hello ${hero.nama}, HP : ${hero.hp}")
    hero.jalan();
    hero.serang();
}