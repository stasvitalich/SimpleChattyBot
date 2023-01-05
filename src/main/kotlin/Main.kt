package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Stan's Aid.")
    println("I was created in 2023.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()

    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is ${yourAge}; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")

    val yourNumber = readln().toInt()
    val yourRange = 0..yourNumber
    for (i in yourRange) {
        println("$i!")
    }

    println("Let's test your programming knowledge.")
    println("Why do we use methods?")

    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    do {
        val yourChoice = readln().toInt()
        println("Please, try again.")
    }while (yourChoice!=2)

    println("Congratulations, have a nice day!")
}
