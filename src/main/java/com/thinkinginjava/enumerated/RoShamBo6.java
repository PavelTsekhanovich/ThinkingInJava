//: com.thinkinginjava.enumerated/RoShamBo6.java
// Enums using "tables" instead of multiple disp
package com.thinkinginjava.enumerated;

import static com.thinkinginjava.enumerated.Outcome.DRAW;
import static com.thinkinginjava.enumerated.Outcome.LOSE;
import static com.thinkinginjava.enumerated.Outcome.WIN;

enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;
    private static Outcome[][] table = {
            {DRAW, LOSE, WIN}, // PAPER
            {WIN, DRAW, LOSE}, // SCISSORS
            {LOSE, WIN, DRAW}, // ROCK
    };

    public Outcome compete(RoShamBo6 other) {
        return table[this.ordinal()][other.ordinal()];
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo6.class, 20);
    }
}
