package oop_105516_JoshReaganWiselim.week03

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan username player: ")
    val username = scanner.nextLine()

    val player = Player(username)

    player.addXp(50)
    player.addXp(60)
}