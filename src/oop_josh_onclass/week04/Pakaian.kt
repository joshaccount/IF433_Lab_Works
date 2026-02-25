package oop_josh_onclass.week04

open class Pakaian {
    private var merk: String = "";
    protected var harga: Int = 0;
    init{
        this.merk = "H&M"
        println("Merk is $merk");
    }
    open public fun jumlah_penjualan() {
        println("Pakain terjual!");
    }

}