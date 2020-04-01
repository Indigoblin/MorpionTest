package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PionTest {

    // pion - envoit info sur son état (pas d'action)
    // pion déjà présent ou pas sur plateau
    // nature du pion (croix ou rond)

    // On vérifie si la case n'est pas déjà occupé par un pion
    @Test
    public void caseDispo(){
        Pion pion = new Pion();
        boolean casePion = true;
        assertTrue(pion.caseDisponib(casePion));
    }

    @Test
    public void casePasDispo(){
        Pion pion = new Pion();
        boolean casePion = false;
        assertFalse(pion.caseDisponib(casePion));
    }

    // On vérifie la nature du pion
    @Test
    public void pionEstCroix(){
        Pion pion = new Pion();
        boolean estCroix = true;
        assertTrue(pion.estLaCroix(estCroix));
    }

    @Test
    public void pionPasCroix(){
        Pion pion = new Pion();
        boolean estCroix = false;
        assertFalse(pion.estLaCroix(estCroix));
    }


}
