package oop_105516_JoshReaganWiselim.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.3))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status: ${response.status}")
    println("Daftar Koin:")
    response.data.forEach { coin ->
        println("Koin : ${coin.name} | Balance: ${coin.balance}")
    }
}