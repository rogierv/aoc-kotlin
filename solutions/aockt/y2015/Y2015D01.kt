package aockt.y2015

import io.github.jadarma.aockt.core.Solution

object Y2015D01 : Solution {

    override fun partOne(input: String) =
        input.fold(0) { acc, c -> if (c == '(') acc + 1 else acc - 1 }

    override fun partTwo(input: String) : Int {
        var level = 0
        var position = 0

        while (level >= 0) {
            val instruction = input[position]
            if (instruction == '(') {
                level++
            } else {
                level--
            }
            position++
        }

        return position
    }
}