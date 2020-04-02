package Model;

import MyExecption.TrueException;

public class Partie {

    public boolean autourde(boolean joueur1) {
        //si c est au tour du joueur 2 le joueur 1 sera en false et le 2 a true
        return joueur1;
    }

    public boolean estCommence(boolean partie1) throws TrueException {
        if (partie1 == true){
            throw new TrueException("La partie va commencer ");
        }
        return partie1;
    }
    public boolean mouvLegal(boolean partie1) throws TrueException {
        if (partie1 == true) {
            throw new TrueException("M'sieur, c'est légal tout ça ");
        }
        return partie1;
    }
}
