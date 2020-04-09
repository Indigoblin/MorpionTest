package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

    // plateau - envoit info sur son état, ne fait pas d'action
    // vérifie si victoire horizontal, vertical, diagonale
    // vérifie si plateau est plein, si oui, partie fini
    //

    @Test
    public void plateauEstVide(){
        Plateau plateau = new Plateau();

    }

    @Test
    public void victoireCaseHorizontal(){
        Plateau plateau = new Plateau();
    }

    @Test
    public void victoireCaseVertical(){
        Plateau plateau = new Plateau();
    }

    @Test
    public void victoireCaseDiagonal(){
        Plateau plateau = new Plateau();
    }
}
