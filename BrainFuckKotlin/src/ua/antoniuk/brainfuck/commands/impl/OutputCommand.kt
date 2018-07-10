package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand

/**
 * Represent command by symbol <i>.</i>
 */
class OutputCommand : BrainFuckCommand {

    /**
     * Method output the byte at the data pointer
     */
    override fun execute(bfData: BrainFuckData) = print(bfData.memory[bfData.dataPointer].toChar())
}