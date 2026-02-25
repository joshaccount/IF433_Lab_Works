package oop_josh_onclass.week04

class Celana: Pakaian() {
    private var stock: Int = 20;
    public fun update_stock(){
        super.harga = stock * 120;
        println("Stock $stock celana terupdate! Harga ${super.harga}");
    }
}