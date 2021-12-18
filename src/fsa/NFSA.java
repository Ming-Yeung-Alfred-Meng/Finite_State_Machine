package fsa;

public interface NFSA extends FSA {
    DFSA toDeterministic();

}
