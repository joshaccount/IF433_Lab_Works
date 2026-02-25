package oop_josh_onclass.week04

class Baju: Pakaian() {
    private var stock: Int = 10;
    public fun update_stock(terjual: Int){
        stock -= terjual
        super.harga = stock * 100;
        println("Stock $stock baju terupdate! Harga ${super.harga}");
    }

    override public fun jumlah_penjualan() {
        println("Baju Terjual!");
    }
}