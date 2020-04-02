package Model;

import MyExecption.TrueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Partie Melanie
public class PartieTest {

    @Test
    public void commencer(){
        Partie partie = new Partie();
        boolean partie1 = true;
        assertThrows(TrueException.class, () -> partie.estCommence(partie1));
    }

    @Test
    public void termine(){
        Partie partie = new Partie();
        boolean partie1 = false;
        assertDoesNotThrow(()->partie.estCommence(partie1));
    }

    @Test
    public void mouvLegal(){
        Partie partie = new Partie();
        boolean partie1 = true;
        assertThrows(TrueException.class, () ->partie.mouvLegal(partie1));

    }

    @Test
    public void mouvILegal(){
        Partie partie = new Partie();
        boolean partie1 = false;
        assertDoesNotThrow(()->partie.mouvLegal(partie1));

    }

    @Test
    public void autourDuJoureur1(){
        Partie joueur = new Partie();
        boolean joueur1 = true;
        assertTrue(joueur.autourde(joueur1));
    }
}
