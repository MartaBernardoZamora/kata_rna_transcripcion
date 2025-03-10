package dev.martabernardo.controllers;

import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;




public class SecuenceControllerTest {

    @Test
    public void testSecuenceController() {
        SecuenceController secuenceController = SecuenceController.getInstance();
        SecuenceController secuenceController2 = SecuenceController.getInstance();

        assertThat(secuenceController, is(equalTo(secuenceController2)));
        assertThat(secuenceController, is(instanceOf(SecuenceController.class)));
    }
}
