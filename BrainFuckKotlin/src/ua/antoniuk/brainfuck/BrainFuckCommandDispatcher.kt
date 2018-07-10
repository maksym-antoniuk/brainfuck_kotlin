package ua.antoniuk.brainfuck

import ua.antoniuk.brainfuck.commands.BrainFuckCommand
import ua.antoniuk.brainfuck.commands.Commands
import ua.antoniuk.brainfuck.commands.impl.DecrementCommand
import ua.antoniuk.brainfuck.commands.impl.ErrorCommand
import ua.antoniuk.brainfuck.commands.impl.FinishLoopCommand
import ua.antoniuk.brainfuck.commands.impl.IncrementCommand
import ua.antoniuk.brainfuck.commands.impl.InputCommand
import ua.antoniuk.brainfuck.commands.impl.MoveLeftCommand
import ua.antoniuk.brainfuck.commands.impl.MoveRightCommand
import ua.antoniuk.brainfuck.commands.impl.OutputCommand
import ua.antoniuk.brainfuck.commands.impl.StartLoopCommand

class BrainFuckCommandDispatcher(private var commands: Map<Char, BrainFuckCommand> = HashMap()) {

    private val errorCommand: BrainFuckCommand = ErrorCommand()

    init {
        commands = mapOf(Pair(Commands.START_LOOP, StartLoopCommand()),
                Pair(Commands.FINISH_LOOP, FinishLoopCommand()),
                Pair(Commands.MOVE_RIGHT, MoveRightCommand()),
                Pair(Commands.MOVE_LEFT, MoveLeftCommand()),
                Pair(Commands.INCREMENT, IncrementCommand()),
                Pair(Commands.DECREMENT, DecrementCommand()),
                Pair(Commands.OUTPUT, OutputCommand()),
                Pair(Commands.INPUT, InputCommand()))
    }

    infix fun receive(command: Char): BrainFuckCommand = commands.getOrDefault(command, errorCommand)
}