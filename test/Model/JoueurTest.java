package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//partie Melanie
public class JoueurTest {

    @Test
    public void autourDuJoureur1(){
        Joueur joueur = new Joueur();
        boolean joueur1 = true;
        assertTrue(joueur.autourde(joueur1));
    }

    @Test
    public void joueurPose(){
        Joueur joueur = new Joueur();
        boolean joueur1 = true;
        assertTrue(joueur.pose(joueur1));
    }

    @Test
    public void joueurNePeuxPasJouer(){
        Joueur joueur = new Joueur();
        boolean joueur1 = false;
        assertFalse(joueur.pose(joueur1));
    }

    @Test
    public void joueurPerd(){
        Joueur joueur = new Joueur();
        boolean joueur1 = true;
        assertTrue(joueur.Perdu(joueur1));
    }

    @Test
    public void joueurGagne(){
        Joueur joueur = new Joueur();
        boolean joueur1 = false;
        assertFalse(joueur.gagne(joueur1));
    }

}

