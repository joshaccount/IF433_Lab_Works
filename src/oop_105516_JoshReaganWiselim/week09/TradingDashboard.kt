package oop_105516_JoshReaganWiselim.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -12.8, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 25, 32.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 8.4, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 5, -3.1, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 2.7, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 30, -9.6, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"}

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=".repeat(40))
    println("=== CRYPTO TRADING DASHBOARD ===")
    println("=".repeat(40))

    println("\nTOP PERFORMERS (Winning Trades)")
    println("-".repeat(40))
    topPerformersString.forEach { println(it) }

    println("\nWORST PERFORMERS (Losing Trades)")
    println("-".repeat(40))
    worstPerformersString.forEach { println(it) }

    println("\nUNIQUE TRADING PAIRS")
    println("-".repeat(40))
    println(uniquePairs)
}

/* Hasilnya, untuk checkpoint 20
========================================
=== CRYPTO TRADING DASHBOARD ===
========================================

TOP PERFORMERS (Winning Trades)
----------------------------------------
WIN [SOLUSDT - LONG]: +32.0% ROE (Lev: 25x)
WIN [BTCUSDT - LONG]: +15.5% ROE (Lev: 20x)
WIN [ETHUSDT - LONG]: +8.4% ROE (Lev: 10x)

WORST PERFORMERS (Losing Trades)
----------------------------------------
LOSS [BTCUSDT - SHORT]: +-12.8% ROE (Lev: 15x)
LOSS [ETHUSDT - SHORT]: +-5.2% ROE (Lev: 10x)
LOSS [BNBUSDT - SHORT]: +-3.1% ROE (Lev: 5x)

UNIQUE TRADING PAIRS
----------------------------------------
[BTCUSDT, ETHUSDT, SOLUSDT, BNBUSDT]
*/