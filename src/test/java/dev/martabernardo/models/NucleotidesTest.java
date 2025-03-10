package dev.martabernardo.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



public class NucleotidesTest {
    @Test
    void testNameOfValue() {
        assertThat(Nucleotides.ADENINE.name(), is("ADENINE"));
        assertThat(Nucleotides.CYTOSINE.name(), is("CYTOSINE"));
        assertThat(Nucleotides.GUANINE.name(), is("GUANINE"));
        assertThat(Nucleotides.THYMINE.name(), is("THYMINE"));
    }
    @Test
    void testNucleotideGetters() {
        assertThat(Nucleotides.ADENINE.getDnaNucleotide(), is("A"));
        assertThat(Nucleotides.CYTOSINE.getDnaNucleotide(), is("C"));
        assertThat(Nucleotides.GUANINE.getDnaNucleotide(), is("G"));
        assertThat(Nucleotides.THYMINE.getDnaNucleotide(), is("T"));

        assertThat(Nucleotides.ADENINE.getRnaNucleotide(), is("U"));
        assertThat(Nucleotides.CYTOSINE.getRnaNucleotide(), is("G"));
        assertThat(Nucleotides.GUANINE.getRnaNucleotide(), is("C"));
        assertThat(Nucleotides.THYMINE.getRnaNucleotide(), is("A"));
    }

}
