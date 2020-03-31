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
        assertFalse(joueur.autourde(false));

    }

    //@Test
    //public void autourDuJoureur2(){
    //    Joueur joueur = new Joueur();
    //    boolean joueur2 = false;
//
    //}
//
    //@Test
    //public void joueurPose(){
    //    Joueur joueur = new Joueur();
//
    //}
//
    //@Test
    //public void joueurNePeuxPasJouer(){
    //    Joueur joueur = new Joueur();
//
    //}

    @Test
    public void joueurPerd(){
        Joueur joueur = new Joueur();
        boolean joueur1 = false;
        assertTrue(joueur.Perdu(true));
    }

    @Test
    public void joueurGagne(){
        Joueur joueur = new Joueur();
        boolean joueur1 = true;
        assertFalse(joueur.gagne(false));
    }

}

