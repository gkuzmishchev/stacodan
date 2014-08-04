package de.egga;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

/**
 * @author egga
 */
public class ThingTest {

    private Thing thing;

    @BeforeMethod
    public void setUp() {
        thing = new Thing();
    }

    @Test
    public void shouldHaveValue() {
        assertThat(thing.getValue(), is(nullValue()));
    }
}
