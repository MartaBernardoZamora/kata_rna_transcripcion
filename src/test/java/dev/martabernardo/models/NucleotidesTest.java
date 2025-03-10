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

}
