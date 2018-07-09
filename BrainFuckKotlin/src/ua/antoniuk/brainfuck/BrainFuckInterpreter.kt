package ua.antoniuk.brainfuck

class BrainFuckInterpreter(private val commandDispatcher: BrainFuckCommandDispatcher) {

    infix fun interpret(code : String) {
        val data = BrainFuckData(length = 65555, code = code)
        while (code.length > data.curCommand) {
            commandDispatcher receive code[data.curCommand] execute data
            data.curCommand++
        }
    }
}