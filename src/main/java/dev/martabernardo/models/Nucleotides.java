package dev.martabernardo.models;

public enum Nucleotides {
    ADENINE("A", "U"), 
    CYTOSINE("C", "G"), 
    GUANINE("G", "C"), 
    THYMINE("T", "A");

    private final String dnaNucleotide;
    private final String rnaComplement;

    Nucleotides(String dnaNucleotide, String rnaComplement) {
        this.dnaNucleotide = dnaNucleotide;
        this.rnaComplement = rnaComplement;
    }
}
