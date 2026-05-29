package oop_josh_onclass.week13
import java.io.File
import java.io.BufferedReader
import java.io.FileReader

data class Student(val name: String, val nim: String, val pocketMoney: Int) {
    fun convertToCSV(): String {
        return "$name,$nim,$pocketMoney"
    }
}

fun main() {
    // Single Input
    val s1 = Student("Go Youn Jung", "1924274", 1000)

    // Multiple Input
    val students = listOf<Student>(
        Student("Cha Mu Hee", "3924772", 10000),
        Student("Jang Hui Soo", "483257", 7000),
        Student("SpiderMan", "2145291", 3000)
    )

    val allStudents = listOf(s1) + students
    val file4 = File("src/oop_josh_onclass/week13/studentData.csv")
    file4.writeText(allStudents.joinToString("\n") { it.convertToCSV() })

    println("=== Isi studentData.csv ===")
    println(file4.readText())

    println("\n=== Baca File - Cara 1 ===")
    val file = File("src/oop_josh_onclass/week13/file.txt")
    val isiContent = file.readText()
    println(isiContent)

    println("\n=== Baca File - Cara 2 ===")
    val contentIsi = file.readLines()
    contentIsi.forEach {
        println(it)
    }

    println("\n=== Baca File - Cara BUFFERED READER ===")
    val file2 = BufferedReader(FileReader("src/oop_josh_onclass/week13/file.txt"))
    var baris: String? = file2.readLine()
    while(baris != null) {
        println(baris)
        baris = file2.readLine()
    }
    file2.close()

    println("\n=== Baca File - Cara BUFFERED READER (ver USE) ===")
    val file3 = File("src/oop_josh_onclass/week13/file.txt").bufferedReader()
    file3.use { hasil ->
        hasil.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach { println(it) }
    }

    println("\n=== Buat File - Cara 1 ===")
    val fileSaya = File("src/oop_josh_onclass/week13/FileSaya.txt")
    fileSaya.writeText("Paddington is in London")
    fileSaya.appendText("\nThree Big Premier League Clubs is also in London")
    println("Text is Written in ${fileSaya}")

    val listClubs = listOf<String>("Arsenal", "Chelsea", "Tottenham")
    fileSaya.appendText("\n" + listClubs.joinToString("\n"))

    fileSaya.printWriter().use { out ->
        out.println("Previous Song  - One Time - Justin Bieber")
        out.println("Song Playing   - Shouldn't Be - Luke Chiang")
        out.println("Next Song      - Earrings - Malcolm Todd")
    }
}