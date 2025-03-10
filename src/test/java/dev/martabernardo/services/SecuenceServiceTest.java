package dev.martabernardo.services;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;



public class SecuenceServiceTest {
    SecuenceService secuenceService;
    @BeforeEach
    public void setUp() throws Exception {
        secuenceService = SecuenceService.getInstance();        
    }
    @Test
    public void testSecuenceService() {
        SecuenceService instance2 = SecuenceService.getInstance();
        assertThat(secuenceService, is(instanceOf(SecuenceService.class)));
        assertThat(secuenceService, equalTo(instance2));
    }
    @Test
    public void testSecuenceTranscribe() {
        String adnSecuence = "ATCG";
        String expected = "UAGC";
        String result = secuenceService.transcribe(adnSecuence);
        assertThat(result, is(expected));

    }

    @Test
    public void testSecuenceTranscribeInvalid() {
        String adnSecuence = "ATD"; 

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            secuenceService.transcribe(adnSecuence);
        });

        assertThat(exception.getMessage(), is("Invalid nucleotide: D"));
    }
}
