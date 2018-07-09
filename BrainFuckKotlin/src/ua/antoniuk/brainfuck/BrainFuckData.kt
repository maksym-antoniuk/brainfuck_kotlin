package ua.antoniuk.brainfuck

import java.util.*

data class BrainFuckData(var dataPointer: Int = 0,
                         val length: Int,
                         val memory: ByteArray = ByteArray(length, {0.toByte()}),
                         val code: String,
                         var curCommand: Int = 0) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BrainFuckData

        if (dataPointer != other.dataPointer) return false
        if (length != other.length) return false
        if (!Arrays.equals(memory, other.memory)) return false
        if (code != other.code) return false
        if (curCommand != other.curCommand) return false

        return true
    }

    override fun hashCode(): Int {
        var result = dataPointer
        result = 31 * result + length
        result = 31 * result + Arrays.hashCode(memory)
        result = 31 * result + code.hashCode()
        result = 31 * result + curCommand
        return result
    }
}