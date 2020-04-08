package Model;


public class Plateau {
    public int sizeBoard;
    public Pion[][] caseBoard;


    public Plateau(int sizeBoard) {
        this.sizeBoard = sizeBoard;
        caseBoard = new Pion[sizeBoard][sizeBoard];

        // On lance un nouveau plateau
        for (int x = 0; x < sizeBoard; x++) {
            for (int y=0; y < sizeBoard; y++) {
                // caseBoard représente les pions dans les cases du plateau, ici, c'est nul donc le plateau est vide
                caseBoard[x][y] = null;gi
            }
        }
    }
}
