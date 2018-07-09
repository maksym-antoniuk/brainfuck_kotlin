package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand

/**
 * Represent command by symbol <i>,</i>
 */
class InputCommand : BrainFuckCommand {

    /**
     * Method accept one byte of input, storing its value in the byte at the data pointer
     */
    override fun execute(bfData: BrainFuckData) {
        print("Enter command: ")
        bfData.memory[bfData.dataPointer] = readLine()?.toByte()!!
    }
}