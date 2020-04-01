package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//Partie Melanie
public class PartieTest {

    @Test
    public void commencer(){

    }

    @Test
    public void termine(){

    }

    @Test
    public void mouvLegal(){

    }

    @Test
    public void mouvILegal(){

    }

    @Test
    public void autourDuJoureur1(){
        Partie joueur = new Partie();
        boolean joueur1 = true;
        assertTrue(joueur.autourde(joueur1));
    }
}
