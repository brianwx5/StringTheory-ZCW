package rocks.zipcode.stringsgalore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTheoryTest {
    StringTheory st = null;

    @org.junit.Before
    public void setUp() throws Exception {
        this.st = new StringTheory();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCharacterFromStringTest() {
        //Given
        String string = "Java Exercise!";
        Character expected = 'J';
        Character expected2 = 'i';

        //When
        Character actual = st.characterByIndex(string, 0);
        Character actual2 = st.characterByIndex(string, 10);

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);

    }

    @Test
    public void getCharacterUnicodeFromStringTest() {
        //Given
        String string = "w3resource.com";
        Character expected = 51;
        Character expected2 = 101;

        //When
        Character actual = st.characterUnicodeByIndex(string, 1);
        Character actual2 = st.characterUnicodeByIndex(string, 9);

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);
    }

    @Test
    public void getCharacterUnicodeBeforeSpecifiedIndexTest() {
        //Given
        String string = "w3resource.com";
        Character expected = 119;
        Character expected2 = 99;

        //When
        Character actual = st.characterUnicodeBeforeSpecifiedIndex(string, 1);
        Character actual2 = st.characterUnicodeBeforeSpecifiedIndex(string, 9);

        //Then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2,actual2);
    }
}