package dev.martabernardo.services;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SecuenceServiceTest {
    @Test
    public void testSecuenceService() {
        SecuenceService secuenceService = SecuenceService.getInstance();
        SecuenceService instance2 = SecuenceService.getInstance();
;

        assertThat(secuenceService, is(instanceOf(SecuenceService.class)));
        assertThat(secuenceService, equalTo(instance2));
    }
}
