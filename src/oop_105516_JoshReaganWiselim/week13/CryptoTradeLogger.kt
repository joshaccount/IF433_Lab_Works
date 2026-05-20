package oop_105516_JoshReaganWiselim.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id, $symbol, $type, $margin, $pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id     = parts[0].toInt(),
            symbol = parts[1],
            type   = parts[2],
            margin = parts[3].toDouble(),
            pnl    = parts[4].toDouble()
        )
    } catch (e: Exception) {
        // Menangkap NumberFormatException, IndexOutOfBoundsException, dll.
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 500.0, pnl = 125.50),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 300.0, pnl = -45.75),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 200.0, pnl = 88.20)
    )

    val filePath = "crypto_trades.csv"
    saveTrades(trades, path = filePath)
    println("Trade records berhasil disimpan ke $filePath")
}