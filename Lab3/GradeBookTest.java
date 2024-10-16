import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;



class GradeBookTest {

    private GradeBook gb1;
    private GradeBook gb2;

    @BeforeEach
    void setUp() {
        gb1 = new GradeBook(5);
        gb2 = new GradeBook(5);

        gb1.addScore(55.3);
        gb1.addScore(88.0);

        gb2.addScore(33.9);
        gb2.addScore(74.7);
    }

    @AfterEach
    void tearDown() {
        gb1 = null;
        gb2 = null;
    }

    @Test
    void addScore() {
        String expectedScores = "55.3 88.0 ";
        assertTrue(gb1.toString().equals(expectedScores));
        String expectedScores2 = "33.9 74.7 ";
        assertTrue(gb2.toString().equals(expectedScores2));

        assertEquals(2,gb1.getScoresSize());
        assertEquals(2,gb2.getScoresSize());
    }

    @Test
    void sum() {
        assertEquals(143.3, gb1.sum());
        assertEquals(108.6, gb2.sum());
    }

    @Test
    void minimum() {
        assertEquals(55.3, gb1.minimum());
        assertEquals(33.9, gb2.minimum());
    }

    @Test
    void finalScore() {
        assertEquals(88.0, gb1.finalScore());
        assertEquals(74.7, gb2.finalScore());
    }


}