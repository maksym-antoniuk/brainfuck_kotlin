package ua.antoniuk.brainfuck.commands

import ua.antoniuk.brainfuck.BrainFuckData

/**
 * This interface provide common template for executing all BrainFuck commands
 */
interface BrainFuckCommand {

    /**
     * This method execute some actions operating data in <code>bfData</code>
     */
    infix fun execute(bfData : BrainFuckData)
}