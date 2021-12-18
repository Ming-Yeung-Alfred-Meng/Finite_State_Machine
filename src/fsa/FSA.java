package fsa;

public interface FSA {
    FSA reverse ();

    FSA complement();

    FSA product();
}
