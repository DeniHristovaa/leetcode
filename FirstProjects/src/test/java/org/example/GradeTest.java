package org.example;

//import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grade();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD(){
        var grader = new Grade();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    public void sevenNineShouldReturnE(){
        var grader = new Grade();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB(){
        var grader = new Grade();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA(){
        var grader = new Grade();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    public void sixtyShouldReturnD(){
        var grader = new Grade();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    public void sevenShouldReturnC(){
        var grader = new Grade();
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    public void eightyShouldReturnB(){
        var grader = new Grade();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    public void ninetyShouldReturnA(){
        var grader = new Grade();
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    public void hundredShouldReturnA(){
        var grader = new Grade();
        assertEquals('A', grader.determineLetterGrade(100));
    }

    @Test
    public void zeroShouldReturnF(){
        var grader = new Grade();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    public void NegativeShouldReturnIllegalArgumentException(){
        var grader = new Grade();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-1);
                });
    }

    @Test
    public void MoreThanHundredShouldReturnIllegalArgumentException(){
        var grader = new Grade();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(101);
                });
    }
}
