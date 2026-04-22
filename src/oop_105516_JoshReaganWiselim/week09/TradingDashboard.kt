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
}