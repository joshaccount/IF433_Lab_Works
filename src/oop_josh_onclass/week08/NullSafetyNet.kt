package oop_josh_onclass.week08

fun main(){
    var nama: String? = "Paddington";

    try {
        println("Nama kamu ${nama!!.uppercase()}")
        var hitung = 10/0;
    } catch(ex: Exception) {
        println("Kamu kena error, ini pesan err-nya: ${ex.message}");
    }

    val kumpulanData: List<Any> = listOf(123, "Trenggiling", 2024, "Kalimantan")

    for(item in kumpulanData){
        val isiData = item as? String
        if(isiData != null) {
            println(isiData);
        }
    }
}