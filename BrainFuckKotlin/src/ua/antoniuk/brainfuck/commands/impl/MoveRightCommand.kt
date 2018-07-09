package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand

/**
 * Represent command by symbol <i>></i>
 */
class MoveRightCommand : BrainFuckCommand {

    /**
     * Method increment the data pointer (to point to the next cell to the right)
     */
    override fun execute(bfData: BrainFuckData) {
        bfData.dataPointer = if (bfData.dataPointer == bfData.length - 1) 0 else bfData.dataPointer + 1
    }
}