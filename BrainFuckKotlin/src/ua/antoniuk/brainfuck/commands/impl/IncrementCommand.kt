package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand

/**
 * Represent command by symbol <i>+</i>
 */
class IncrementCommand : BrainFuckCommand {

    /**
     * Method increment (increase by one) the byte at the data pointer
     */
    override fun execute(bfData: BrainFuckData) {
        bfData.memory[bfData.dataPointer]++
    }
}