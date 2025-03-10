package dev.martabernardo.views;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NucleotideSecuenceTest {
    @Test
    public void testNucleotideSecuence() {
        String secuence = "ATCG";
        NucleotideSecuence nucleotideSecuence = new NucleotideSecuence(secuence);

        assertThat(nucleotideSecuence, is(instanceOf(NucleotideSecuence.class)));

    }
    @Test
    public void testGetSecuence() {
        String secuence = "ATCG";
        NucleotideSecuence nucleotideSecuence = new NucleotideSecuence(secuence);

        assertThat(nucleotideSecuence.getSecuence(), is(secuence));
    }
}
