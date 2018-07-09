package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand

/**
 * Represent command by symbol <i><</i>
 */
class MoveLeftCommand : BrainFuckCommand {

    /**
     * Method decrement the data pointer (to point to the next cell to the left)
     */
    override fun execute(bfData: BrainFuckData) {
        bfData.dataPointer = if (bfData.dataPointer == 0) bfData.length - 1 else bfData.dataPointer - 1
    }
}