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
        println("  Koin : ${coin.name} | Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TION001", 0.1))
    txRepo.add(Transaction("TION002", 500.0))
    txRepo.add(Transaction("TION003", -200.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("\nDaftar Transaksi:")
    txResponse.data.forEach { tx ->
        println("  ID: ${tx.id} | Amount: ${tx.amount}")
    }

    println("\nKoin dengan balance > 1.0:")
    coinRepo.search { it.balance > 1.0 }.forEach { coin ->
        println("  ${coin.name}: ${coin.balance}")
    }

    println("\nTransaksi dengan amount positif:")
    txRepo.search { it.amount > 0 }.forEach { tx ->
        println("  ${tx.id}: ${tx.amount}")
    }
}

/* Hasil
=== CRYPTO DASHBOARD ===
Status: 200 OK
Daftar Koin:
  Koin : BTC | Balance: 0.5
  Koin : ETH | Balance: 2.3
  Koin : USDT | Balance: 1500.0

Daftar Transaksi:
  ID: TION001 | Amount: 0.1
  ID: TION002 | Amount: 500.0
  ID: TION003 | Amount: -200.0

Koin dengan balance > 1.0:
  ETH: 2.3
  USDT: 1500.0

Transaksi dengan amount positif:
  TION001: 0.1
  TION002: 500.0
 */