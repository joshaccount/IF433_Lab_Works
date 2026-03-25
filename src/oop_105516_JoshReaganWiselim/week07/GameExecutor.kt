package oop_105516_JoshReaganWiselim.week07

fun processEvent(event: BattleState) {
    val msg = when (event) {
        is BattleState.MonsterEncounter -> "Bertemu monster: ${event.monsterName}!"
        is BattleState.LootDropped -> "Loot didapat: ${event.item.name} | Damage: ${event.item.damage} | Rarity: ${event.item.rarity}"
        is BattleState.GameOver -> "Game Over! Alasan: ${event.reason}"
        BattleState.SafeZone -> "Kamu berada di zona aman."
    }
    println(msg)
}