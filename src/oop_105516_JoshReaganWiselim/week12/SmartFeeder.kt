package oop_105516_JoshReaganWiselim.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")

    println("Stok saat ini: $currentKibbleStock gr | Porsi diminta: 80 gr")

    try {
        val newStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = newStock
        println("Makan pagi sukses! Sisa stok kibble: $currentKibbleStock gr")

    } catch (e: DispenserJamException) {
        println("ERROR HARDWARE: ${e.message}")
        println("Harap periksa dan bersihkan dispenser secara manual.")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
        println("Harap isi ulang wadah kibble segera!")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
        println("Terjadi kesalahan tidak terduga pada sistem.")
    }
}