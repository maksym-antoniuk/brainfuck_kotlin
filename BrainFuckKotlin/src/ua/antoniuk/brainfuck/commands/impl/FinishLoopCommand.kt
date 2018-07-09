package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand
import ua.antoniuk.brainfuck.commands.Commands

/**
 * Represent command by symbol <i>]</i>
 */
class FinishLoopCommand : BrainFuckCommand {

    /**
     * Method work by following algorithm: if the byte at the data pointer is nonzero,
     * then instead of moving the instruction pointer forward to the next command,
     * jump it back to the command after the matching <i>[</i> command
     */
    override fun execute(bfData: BrainFuckData) {
        if (bfData.memory[bfData.dataPointer] != 0.toByte()) {
            var counter = 0
            bfData.curCommand--
            while (counter > 0 || bfData.code[bfData.curCommand] != Commands.START_LOOP) {
                when (bfData.code[bfData.curCommand]) {
                    Commands.FINISH_LOOP -> counter++
                    Commands.START_LOOP -> counter--
                }
                bfData.curCommand--
            }
            bfData.curCommand--
        }
    }
}