package dev.martabernardo.models;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RnaSecuenceTest {
    @Test
    public void testRnaSecuence() {
        String rnaString = "ATCG";
        RnaSecuence rnaSecuence = new RnaSecuence(rnaString);

        assertThat(rnaSecuence, is(instanceOf(NucleotideSecuence.class)));
        assertThat(rnaSecuence, is(instanceOf(RnaSecuence.class)));
    }
}
