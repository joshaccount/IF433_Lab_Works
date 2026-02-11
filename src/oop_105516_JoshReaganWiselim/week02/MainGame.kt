package oop_105516_JoshReaganWiselim.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. Input Data Hero
    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan base damage Hero: ")
    val heroDamage = scanner.nextInt()

    val myHero = Hero(heroName, heroDamage)

    // 2. Variabel musuh (Enemy)
    var enemyHp = 100
    val enemyName = "Slime"

    println("\n--- PERTEMPURAN DIMULAI! ---")
    println("${myHero.name} VS $enemyName\n")

    // 3. Main Loop (While Hero hidup DAN Enemy hidup)
    while (myHero.isAlive() && enemyHp > 0) {
        println("--- Menu ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        when (scanner.nextInt()) {
            1 -> {
                // Hero menyerang
                myHero.attack(enemyName)
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP $enemyName sisa: $enemyHp")

                // Jika musuh belum mati, musuh membalas
                if (enemyHp > 0) {
                    val monsterDamage = (10..20).random()
                    println("$enemyName menyerang balik sebesar $monsterDamage damage!")
                    myHero.takeDamage(monsterDamage)
                }

                println("HP ${myHero.name} sisa: ${myHero.hp}\n")
            }
            2 -> {
                println("${myHero.name} melarikan diri dari pertempuran!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    // 4. Pengumuman Pemenang
    println("--- HASIL AKHIR ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Yah... ${myHero.name} telah gugur.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}