/*
 * Class: CMSC203
 * Instructor: Prof. Eivazi
 * Description: This class contains tests for the methods in CryptoManager.java
 * Due: 10/13/24
 * Platform/compiler: IntelliJ IDEA
 * I pledge that I have completed the programming  assignment independently.
 *  I have not copied the code from a student or any source.
 *  I have not given my code to any student.
 *  Print your Name here: Christopher Andrews
 */
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent {
    CryptoManager cryptoManager;

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testStringInBounds() {
        assertTrue(CryptoManager.isStringInBounds("I LOVE CHICKEN NUGGETS"));
        assertTrue(CryptoManager.isStringInBounds("IM A GOOFY GOOBER"));
        assertFalse(CryptoManager.isStringInBounds("oh no!"));
        assertFalse(CryptoManager.isStringInBounds("I LOVE THIS SYMBOL {"));
        assertFalse(CryptoManager.isStringInBounds("\"NO lowercase ALLOWED\""));
    }

    @Test
    public void testEncryptCaesar() {
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("farts", 8));
        assertEquals(" ^_", CryptoManager.caesarEncryption("_]^", 1));
        assertEquals("EBIIL", CryptoManager.caesarEncryption("HELLO", -3));
        assertEquals("9", CryptoManager.caesarEncryption(" ", 25));
    }

    @Test
    public void testDecryptCaesar() {
        assertEquals("!_ ", CryptoManager.caesarDecryption(" ^_", -1));
        assertEquals("GGG", CryptoManager.caesarDecryption("...", 999));
        assertEquals("ZU&(", CryptoManager.caesarDecryption("FART", 300));
    }

    @Test
    public void testEncryptBellaso() {
        assertEquals("SJ%WT", CryptoManager.bellasoEncryption("HELLO", "KEY"));
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoEncryption("H}PPY HALLOWEEN", "U SMELL"));
        assertEquals("DOVGHSZ", CryptoManager.bellasoEncryption("ABCDEFG", "CMSC"));

    }

    @Test
    public void testDecryptBellaso() {
        assertEquals("HELLO", CryptoManager.bellasoDecryption("SJ%WT", "KEY"));
        assertEquals("$$$", CryptoManager.bellasoDecryption("AAA", "]]]]"));
        assertEquals("ABCDEFG", CryptoManager.bellasoDecryption("DOVGHSZ", "CMSC"));

    }

}

