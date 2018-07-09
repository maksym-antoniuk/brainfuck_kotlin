package ua.antoniuk.brainfuck.commands.impl

import ua.antoniuk.brainfuck.BrainFuckData
import ua.antoniuk.brainfuck.commands.BrainFuckCommand

/**
 * Non represent any BrainFuck commands but will be invoked when in BrainFuck will be founded unsupported operator
 */
class ErrorCommand : BrainFuckCommand {

    /**
     * Throw exception when interpreter has founded unknown operator
     *
     * @throws IllegalArgumentException
     */
    override fun execute(bfData: BrainFuckData) {
        throw IllegalArgumentException("Unsupported command `${bfData.code[bfData.curCommand]}`")
    }
}