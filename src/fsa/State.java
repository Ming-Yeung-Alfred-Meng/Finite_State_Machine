package fsa;

import java.util.ArrayList;
import java.util.List;

public class State {
    private State[] nextStates;

    /**
     * TODO: should state depend on sigmaSize? because when the machine is not deterministic, it does not have to be.
     * @param sigmaSize
     */
    public State(int sigmaSize) {
        nextStates = new State[sigmaSize];
    }
}
