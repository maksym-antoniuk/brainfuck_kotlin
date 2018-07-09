package ua.antoniuk.brainfuck.commands

/**
 * This singleton represent all commands which exist in BrainFuck language
 */
object Commands {

    /**
     * Indicate start loop
     *
     */
    const val START_LOOP = '['

    /**
     * Indicate end of loop
     *
     */
    const val FINISH_LOOP = ']'

    /**
     * Indicate increment the byte in memory
     *
     */
    const val INCREMENT = '+'

    /**
     * Indicate decrement the byte in memory
     *
     */
    const val DECREMENT = '-'

    /**
     * Indicate decrement the current data point
     *
     */
    const val MOVE_LEFT = '<'

    /**
     * Indicate increment the current data point
     *
     */
    const val MOVE_RIGHT = '>'

    /**
     * Indicate that output current memory unit is necessary
     *
     */
    const val OUTPUT = '.'

    /**
     * Indicate that input into current memory unit some byte value is necessary
     */
    const val INPUT = ','
}