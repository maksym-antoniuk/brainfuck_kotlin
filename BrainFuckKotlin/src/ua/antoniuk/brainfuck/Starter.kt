package ua.antoniuk.brainfuck

import java.util.*

fun main(args: Array<String>) {
    print("Enter the code: ")
    BrainFuckInterpreter(BrainFuckCommandDispatcher()) interpret Scanner(System.`in`).nextLine()
}
