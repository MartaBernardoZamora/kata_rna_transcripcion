package dev.martabernardo.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DnaSecuenceTest {
    @Test
    public void testDnaSecuence() {
        String secuence = "ATCG";
        DnaSecuence dnaSecuence = new DnaSecuence(secuence);

        assertThat(dnaSecuence, is(instanceOf(NucleotideSecuence.class)));
        assertThat(dnaSecuence, is(instanceOf(DnaSecuence.class)));
    }
}
