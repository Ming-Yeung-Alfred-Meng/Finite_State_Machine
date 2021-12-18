package fsa;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * what can this DFSA do:
 *     reads a string and check if it is accepted
 *     can be converted to a regex
 *     can be converted from a regex
 */
public class DFSA {
    private State[] states;
    private char[] sigma;
    private State startState;
    private State[] acceptingStates;

    public DFSA(String[][] delta) {
        int numberOfColumns = getNumberOfStates(delta);
        states = new State[numberOfColumns];
        int numberOfRows = getNumberOfSymbols(delta);
        sigma = new char[numberOfRows];
    }

    private int getNumberOfStates(String[][] delta) {
        return delta[0].length - 1;
    }

    private int getNumberOfSymbols(String[][] delta) {
        return delta.length - 1;
    }


}
